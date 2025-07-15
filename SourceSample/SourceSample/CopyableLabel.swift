//
//  CopyableLabel.swift
//  Sourcy
//
//  Created by Benjamin Briggs on 10/07/2025.
//

import SwiftUI

struct CopyableLabel: View {
    init(_ text: String) {
        self.text = text
    }
    let text: String
    @State private var isHovering = false
    @State private var hasCopied = false
    var body: some View {
        HStack(spacing: 2) {
            if hasCopied {
                Text("Copied")
            } else {
                Text(text)
            }
            Image(systemName: "document.on.document")
                .imageScale(.small)
                .opacity(isHovering ? 1 : 0)
        }
        .monospaced()
        .foregroundStyle(.secondary)
        .onHover { isHovering = $0 }
        .onTapGesture {
#if os(iOS)
            UIPasteboard.general.setObjects([text])
#else
            NSPasteboard.general.clearContents()
            NSPasteboard.general.setString(
                text,
                forType: .string
            )
#endif
            // Show the users they have copied the label
            Task {
                do {
                    hasCopied = true
                    try await Task.sleep(for: .seconds(2))
                    hasCopied = false
                } catch {
                    hasCopied = false
                }

            }
        }
    }
}
