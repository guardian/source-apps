#!/usr/bin/env sh

ORIGINAL_DIR=$(pwd)
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
ANDROID_CONFIG_DIR="$(cd "$SCRIPT_DIR" && pwd)"

if [ "$ORIGINAL_DIR" != "$ANDROID_CONFIG_DIR" ]; then
  cd "$ANDROID_CONFIG_DIR"
fi

# 1. Read version from "version.txt" file in the root of the project (android/)
VERSION_FILE="../version.txt"
API_FILE="../source/api/source-api.txt"
TMP_API_FILE=$(mktemp)

if [ ! -f "$VERSION_FILE" ]; then
  echo "0.0.1" > "$VERSION_FILE"
fi

VERSION=$(cat "$VERSION_FILE" | tr -d ' \n\r')
IFS='.' read -r MAJOR MINOR PATCH <<EOF
$VERSION
EOF

# 2. Read "source-api.txt" file from source/api
cp "$API_FILE" "$TMP_API_FILE"

# 3. Run `./gradlew :source:metalavaCheckCompatibilityRelease` from android/
cd ..
./gradlew :source:metalavaCheckCompatibilityRelease
RESULT=$?
cd config

if [ $RESULT -ne 0 ]; then
  # 4. If the command fails,
  #    a. increment major version, set minor and patch to 0
  MAJOR=$((MAJOR + 1))
  MINOR=0
  PATCH=0
  #    b. Run `./gradlew :source:metalavaGenerateSignatureRelease`
  cd ..
  ./gradlew :source:metalavaGenerateSignatureRelease
  cd config
  #    c. Update "version.txt" with the new version
  echo "$MAJOR.$MINOR.$PATCH" > "$VERSION_FILE"
else
  # 5. If the command succeeds,
  #    a. Run `./gradlew :source:metalavaGenerateSignatureRelease`
  cd ..
  ./gradlew :source:metalavaGenerateSignatureRelease
  cd config
  #    b. Check whether `source-api.txt` has changed
  if ! cmp -s "$API_FILE" "$TMP_API_FILE"; then
    #    c. If it has, increment minor version, set patch to 0
    MINOR=$((MINOR + 1))
    PATCH=0
  else
    #    d. If it hasn't, increment patch version
    PATCH=$((PATCH + 1))
  fi
  #    e. Update "version.txt" with the new version
  echo "$MAJOR.$MINOR.$PATCH" > "$VERSION_FILE"
fi

# 6. Commit version.txt and source/api/source-api.txt
cd ..
git add version.txt source/api/source-api.txt
git commit -m "chore: update version to $(cat version.txt)"

# 7. Push changes to the remote repository
git push

# Cleanup
rm -f "$TMP_API_FILE"

cd "$ORIGINAL_DIR"