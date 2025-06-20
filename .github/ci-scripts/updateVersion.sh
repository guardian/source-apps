#!/usr/bin/env sh

# Usage:
#   ./updateVersion.sh [script_directory]
# If no directory is provided, the script assumes android/config relative to the repo root.
# This script updates the version in version.txt based on API compatibility checks and changes.

ORIGINAL_DIR=$(pwd)
if [ -n "$1" ]; then
  # Use provided script directory
  SCRIPT_DIR="$(cd "$1" && pwd)"
else
  # Default to script relative to script location
  SCRIPT_DIR="$(cd "$(dirname "$0")/../../android/config" && pwd)"
fi

# Ensure we are in the script directory for relative paths to work
if [ "$ORIGINAL_DIR" != "$SCRIPT_DIR" ]; then
  cd "$SCRIPT_DIR"
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

# Clean up temporary file and return to original directory
rm -f "$TMP_API_FILE"
cd "$ORIGINAL_DIR"