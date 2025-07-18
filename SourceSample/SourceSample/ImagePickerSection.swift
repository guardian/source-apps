//
//  ImagePickerSection.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 11/07/2025.
//

import SwiftUI
#if canImport(PhotosUI)
import PhotosUI
#endif
#if canImport(AppKit)
import AppKit
#endif

#if os(macOS)
typealias PlatformImage = NSImage
#else
typealias PlatformImage = UIImage
#endif

struct ImagePickerSection: View {
    @Binding var selectedImage: PlatformImage?

#if os(iOS)
    @State private var selectedPhotoItem: PhotosPickerItem?
#endif

    var body: some View {
        LabeledContent("Image") {
            HStack {
                // Image preview
                if let selectedImage {
#if os(macOS)
                    Image(nsImage: selectedImage)
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                        .frame(width: 40, height: 40)
                        .background(Color.gray.opacity(0.2))
                        .cornerRadius(6)
#else
                    Image(uiImage: selectedImage)
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                        .frame(width: 40, height: 40)
                        .background(Color.gray.opacity(0.2))
                        .cornerRadius(6)
#endif
                } else {
                    RoundedRectangle(cornerRadius: 6)
                        .fill(Color.gray.opacity(0.2))
                        .frame(width: 40, height: 40)
                        .overlay(
                            Image(systemName: "photo")
                                .foregroundColor(.secondary)
                        )
                }

                VStack(alignment: .leading, spacing: 4) {
#if os(macOS)
                    macOSImagePicker
#else
                    iOSImagePicker
#endif

                    if selectedImage != nil {
                        Button("Remove") {
                            selectedImage = nil
#if os(iOS)
                            selectedPhotoItem = nil
#endif
                        }
                        .foregroundColor(.red)
                    }
                }

                Spacer()
            }
        }
    }

#if os(macOS)
    private var macOSImagePicker: some View {
        Button("Choose Image...") {
            selectImageMacOS()
        }
    }

    private func selectImageMacOS() {
        let panel = NSOpenPanel()
        panel.title = "Choose an Image"
        panel.allowsMultipleSelection = false
        panel.canChooseFiles = true
        panel.canChooseDirectories = false
        panel.allowedContentTypes = [.image]

        if panel.runModal() == .OK,
           let url = panel.url,
           let image = NSImage(contentsOf: url) {
            selectedImage = image
        }
    }
#else
    private var iOSImagePicker: some View {
        PhotosPicker("Choose Image...", selection: $selectedPhotoItem, matching: .images)
            .onChange(of: selectedPhotoItem) { _, newItem in
                Task {
                    if let data = try? await newItem?.loadTransferable(type: Data.self),
                       let image = UIImage(data: data) {
                        await MainActor.run {
                            selectedImage = image
                        }
                    }
                }
            }
    }
#endif
}

#Preview {
    @Previewable @State var image: PlatformImage?
    ImagePickerSection(
        selectedImage: $image,
    )
}
