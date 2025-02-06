//
//  SourceIcon.swift
//  Source
//
//  Created by Benjamin Briggs on 06/02/2025.
//
import SwiftUI

public extension Image {
    init(source: SourceIcon) {
        self.init(sourceName: source.imageName)
    }
}

public enum SourceIcon: CaseIterable {
    case alertTriangle
    case directDebitWide
    case whiteArrowLeftStraightRound
    case alertPhone
    case alertRound
    case appleBrand
    case arrowContract
    case arrowDownStraight
    case arrowExpand
    case arrowLeftStraight
    case arrowOutdent
    case arrowPopOut
    case arrowRightStraight
    case arrowScroll
    case arrowUpAndDownSmall
    case arrowUpStraightSmall
    case arrowUpStraight
    case asterisk
    case audioMute
    case audio
    case bookmarkCross
    case bookmarkFilled
    case bookmarkRoundFilled
    case calendar
    case camera
    case checkmark
    case chevronDownDouble
    case chevronDownSingle
    case chevronLeftDouble
    case chevronLeftSingle
    case chevronRightDouble
    case chevronRightSingle
    case chevronUpDouble
    case chevronUpSingle
    case clockBaselineSmall
    case clockFilled
    case clockOutlined
    case creditCard
    case cross
    case crosswords
    case directDebit
    case discover
    case document
    case download
    case dragHandle
    case edit
    case ellipsis
    case envelope
    case exclamation
    case external
    case eyeStrike
    case eye
    case facebookBrand
    case facebookMessenger
    case facebook
    case filterAndroidAppSmall
    case filter
    case gift
    case gps
    case handPointed
    case headphonesRoundFilled
    case homeHouseFilled
    case houseCross
    case housePlus
    case houseSetting
    case indent
    case infoRound
    case ingredient
    case linkedIn
    case list
    case locationMarker
    case magnifyingGlassMinus
    case magnifyingGlassPlus
    case magnifyingGlassSadFace
    case magnifyingGlass
    case mediaControlsBack
    case mediaControlsForward
    case mediaControlsPause
    case mediaControlsPlay
    case mediaControlsStop
    case menu
    case minus
    case moon
    case newsletter
    case newspaperArchive
    case notificationsOff
    case notificationsOn
    case padlock
    case partyOfThree
    case payPalBrand
    case personCross
    case personPlus
    case personTick
    case person
    case phone
    case pinterest
    case plus
    case quote
    case reload
    case settings
    case shareCallout
    case shareRoundFilled
    case shareWeb
    case speechBubbleCross
    case speechBubblePlus
    case speechBubble
    case star
    case textLarge
    case textSizeRoundFilled
    case textSize
    case textSmall
    case tickRound
    case transparentArrowLeftStraightRound
    case upload
    case video
    case whatsApp
}

extension SourceIcon {
    var imageName: String {
        switch self {
        case .alertTriangle: "alert-triangle"
        case .directDebitWide: "direct-debit-wide"
        case .whiteArrowLeftStraightRound: "white-arrow-left-straight-round"
        case .alertPhone: "alert-phone"
        case .alertRound: "alert-round"
        case .appleBrand: "apple-brand"
        case .arrowContract: "arrow-contract"
        case .arrowDownStraight: "arrow-down-straight"
        case .arrowExpand: "arrow-expand"
        case .arrowLeftStraight: "arrow-left-straight"
        case .arrowOutdent: "arrow-outdent"
        case .arrowPopOut: "arrow-pop-out"
        case .arrowRightStraight: "arrow-right-straight"
        case .arrowScroll: "arrow-scroll"
        case .arrowUpAndDownSmall: "arrow-up-and-down-small"
        case .arrowUpStraightSmall: "arrow-up-straight-small"
        case .arrowUpStraight: "arrow-up-straight"
        case .asterisk: "asterisk"
        case .audioMute: "audio-mute"
        case .audio: "audio"
        case .bookmarkCross: "bookmark-cross"
        case .bookmarkFilled: "bookmark-filled"
        case .bookmarkRoundFilled: "bookmark-round-filled"
        case .calendar: "calendar"
        case .camera: "camera"
        case .checkmark: "checkmark"
        case .chevronDownDouble: "chevron-down-double"
        case .chevronDownSingle: "chevron-down-single"
        case .chevronLeftDouble: "chevron-left-double"
        case .chevronLeftSingle: "chevron-left-single"
        case .chevronRightDouble: "chevron-right-double"
        case .chevronRightSingle: "chevron-right-single"
        case .chevronUpDouble: "chevron-up-double"
        case .chevronUpSingle: "chevron-up-single"
        case .clockBaselineSmall: "clock-baseline-small"
        case .clockFilled: "clock-filled"
        case .clockOutlined: "clock-outlined"
        case .creditCard: "credit-card"
        case .cross: "cross"
        case .crosswords: "crosswords"
        case .directDebit: "direct-debit"
        case .discover: "discover"
        case .document: "document"
        case .download: "download"
        case .dragHandle: "drag-handle"
        case .edit: "edit"
        case .ellipsis: "ellipsis"
        case .envelope: "envelope"
        case .exclamation: "exclamation"
        case .external: "external"
        case .eyeStrike: "eye-strike"
        case .eye: "eye"
        case .facebookBrand: "facebook-brand"
        case .facebookMessenger: "facebook-messenger"
        case .facebook: "facebook"
        case .filterAndroidAppSmall: "filter-android-app-small"
        case .filter: "filter"
        case .gift: "gift"
        case .gps: "gps"
        case .handPointed: "hand-pointed"
        case .headphonesRoundFilled: "headphones-round-filled"
        case .homeHouseFilled: "home-house-filled"
        case .houseCross: "house-cross"
        case .housePlus: "house-plus"
        case .houseSetting: "house-setting"
        case .indent: "indent"
        case .infoRound: "info-round"
        case .ingredient: "ingredient"
        case .linkedIn: "linked-in"
        case .list: "list"
        case .locationMarker: "location-marker"
        case .magnifyingGlassMinus: "magnifying-glass-minus"
        case .magnifyingGlassPlus: "magnifying-glass-plus"
        case .magnifyingGlassSadFace: "magnifying-glass-sad-face"
        case .magnifyingGlass: "magnifying-glass"
        case .mediaControlsBack: "media-controls-back"
        case .mediaControlsForward: "media-controls-forward"
        case .mediaControlsPause: "media-controls-pause"
        case .mediaControlsPlay: "media-controls-play"
        case .mediaControlsStop: "media-controls-stop"
        case .menu: "menu"
        case .minus: "minus"
        case .moon: "moon"
        case .newsletter: "newsletter"
        case .newspaperArchive: "newspaper-archive"
        case .notificationsOff: "notifications-off"
        case .notificationsOn: "notifications-on"
        case .padlock: "padlock"
        case .partyOfThree: "party-of-three"
        case .payPalBrand: "pay-pal-brand"
        case .personCross: "person-cross"
        case .personPlus: "person-plus"
        case .personTick: "person-tick"
        case .person: "person"
        case .phone: "phone"
        case .pinterest: "pinterest"
        case .plus: "plus"
        case .quote: "quote"
        case .reload: "reload"
        case .settings: "settings"
        case .shareCallout: "share-callout"
        case .shareRoundFilled: "share-round-filled"
        case .shareWeb: "share-web"
        case .speechBubbleCross: "speech-bubble-cross"
        case .speechBubblePlus: "speech-bubble-plus"
        case .speechBubble: "speech-bubble"
        case .star: "star"
        case .textLarge: "text-large"
        case .textSizeRoundFilled: "text-size-round-filled"
        case .textSize: "text-size"
        case .textSmall: "text-small"
        case .tickRound: "tick-round"
        case .transparentArrowLeftStraightRound: "transparent-arrow-left-straight-round"
        case .upload: "upload"
        case .video: "video"
        case .whatsApp: "whats-app"
        }
    }
}

#Preview {
    ScrollView {
        LazyVGrid(
            columns: Array.init(
                repeating: GridItem(.flexible()),
                count: 1
            )
        ) {
            ForEach(SourceIcon.allCases, id:\.self) { icon in
                HStack {
                    Image(source: icon)
                        .tint(.primary)
                    Text(icon.imageName)
                    Spacer()
                }
            }
        }
        .padding()
    }
}
