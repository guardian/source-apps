//
//  IconSection.swift
//  SourceSample
//
//  Created by Benjamin Briggs on 30/06/2025.
//


//
//  IconModel.swift
//  SourceSample
//
//  Created by Benjamin Briggs on 30/06/2025.
//

import Foundation
import Source

struct IconSection {
    let name: String
    let icons: [IconData]
}

struct IconData {
    let name: String
    let iconDescriptor: String
    let icon: SourceIcon
}

struct IconModel {
    let sections = [
        IconSection(
            name: "Navigation & Arrows",
            icons: [
                IconData(
                    name: "Arrow Down Straight",
                    iconDescriptor: "SourceIcon.arrowDownStraight",
                    icon: .arrowDownStraight
                ),
                IconData(
                    name: "Arrow Left Straight",
                    iconDescriptor: "SourceIcon.arrowLeftStraight",
                    icon: .arrowLeftStraight
                ),
                IconData(
                    name: "Arrow Right Straight",
                    iconDescriptor: "SourceIcon.arrowRightStraight",
                    icon: .arrowRightStraight
                ),
                IconData(
                    name: "Arrow Up Straight",
                    iconDescriptor: "SourceIcon.arrowUpStraight",
                    icon: .arrowUpStraight
                ),
                IconData(
                    name: "Arrow Up Straight Small",
                    iconDescriptor: "SourceIcon.arrowUpStraightSmall",
                    icon: .arrowUpStraightSmall
                ),
                IconData(
                    name: "Chevron Down Single",
                    iconDescriptor: "SourceIcon.chevronDownSingle",
                    icon: .chevronDownSingle
                ),
                IconData(
                    name: "Chevron Left Single",
                    iconDescriptor: "SourceIcon.chevronLeftSingle",
                    icon: .chevronLeftSingle
                ),
                IconData(
                    name: "Chevron Right Single",
                    iconDescriptor: "SourceIcon.chevronRightSingle",
                    icon: .chevronRightSingle
                ),
                IconData(
                    name: "Chevron Up Single",
                    iconDescriptor: "SourceIcon.chevronUpSingle",
                    icon: .chevronUpSingle
                ),
                IconData(
                    name: "White Arrow Left Straight Round",
                    iconDescriptor: "SourceIcon.whiteArrowLeftStraightRound",
                    icon: .whiteArrowLeftStraightRound
                ),
                IconData(
                    name: "Transparent Arrow Left Straight Round",
                    iconDescriptor: "SourceIcon.transparentArrowLeftStraightRound",
                    icon: .transparentArrowLeftStraightRound
                )
            ]
        ),
        IconSection(
            name: "Actions & Controls",
            icons: [
                IconData(
                    name: "Plus",
                    iconDescriptor: "SourceIcon.plus",
                    icon: .plus
                ),
                IconData(
                    name: "Minus",
                    iconDescriptor: "SourceIcon.minus",
                    icon: .minus
                ),
                IconData(
                    name: "Cross",
                    iconDescriptor: "SourceIcon.cross",
                    icon: .cross
                ),
                IconData(
                    name: "Checkmark",
                    iconDescriptor: "SourceIcon.checkmark",
                    icon: .checkmark
                ),
                IconData(
                    name: "Edit",
                    iconDescriptor: "SourceIcon.edit",
                    icon: .edit
                ),
                IconData(
                    name: "Download",
                    iconDescriptor: "SourceIcon.download",
                    icon: .download
                ),
                IconData(
                    name: "Upload",
                    iconDescriptor: "SourceIcon.upload",
                    icon: .upload
                ),
                IconData(
                    name: "Reload",
                    iconDescriptor: "SourceIcon.reload",
                    icon: .reload
                ),
                IconData(
                    name: "Bin",
                    iconDescriptor: "SourceIcon.bin",
                    icon: .bin
                ),
                IconData(
                    name: "Add to Basket",
                    iconDescriptor: "SourceIcon.addToBasket",
                    icon: .addToBasket
                )
            ]
        ),
        IconSection(
            name: "Media & Audio",
            icons: [
                IconData(
                    name: "Media Controls Play",
                    iconDescriptor: "SourceIcon.mediaControlsPlay",
                    icon: .mediaControlsPlay
                ),
                IconData(
                    name: "Media Controls Pause",
                    iconDescriptor: "SourceIcon.mediaControlsPause",
                    icon: .mediaControlsPause
                ),
                IconData(
                    name: "Media Controls Stop",
                    iconDescriptor: "SourceIcon.mediaControlsStop",
                    icon: .mediaControlsStop
                ),
                IconData(
                    name: "Media Controls Back",
                    iconDescriptor: "SourceIcon.mediaControlsBack",
                    icon: .mediaControlsBack
                ),
                IconData(
                    name: "Media Controls Forward",
                    iconDescriptor: "SourceIcon.mediaControlsForward",
                    icon: .mediaControlsForward
                ),
                IconData(
                    name: "Audio",
                    iconDescriptor: "SourceIcon.audio",
                    icon: .audio
                ),
                IconData(
                    name: "Audio Mute",
                    iconDescriptor: "SourceIcon.audioMute",
                    icon: .audioMute
                ),
                IconData(
                    name: "Video",
                    iconDescriptor: "SourceIcon.video",
                    icon: .video
                ),
                IconData(
                    name: "Headphones Filled",
                    iconDescriptor: "SourceIcon.headphonesFilled",
                    icon: .headphonesFilled
                ),
                IconData(
                    name: "Headphones Round Filled",
                    iconDescriptor: "SourceIcon.headphonesRoundFilled",
                    icon: .headphonesRoundFilled
                )
            ]
        ),
        IconSection(
            name: "Social Media",
            icons: [
                IconData(
                    name: "Facebook",
                    iconDescriptor: "SourceIcon.facebook",
                    icon: .facebook
                ),
                IconData(
                    name: "Facebook Brand",
                    iconDescriptor: "SourceIcon.facebookBrand",
                    icon: .facebookBrand
                ),
                IconData(
                    name: "Twitter",
                    iconDescriptor: "SourceIcon.twitter",
                    icon: .twitter
                ),
                IconData(
                    name: "WhatsApp",
                    iconDescriptor: "SourceIcon.whatsApp",
                    icon: .whatsApp
                ),
                IconData(
                    name: "WhatsApp Brand",
                    iconDescriptor: "SourceIcon.whatsAppBrand",
                    icon: .whatsAppBrand
                ),
                IconData(
                    name: "LinkedIn",
                    iconDescriptor: "SourceIcon.linkedIn",
                    icon: .linkedIn
                ),
                IconData(
                    name: "Pinterest",
                    iconDescriptor: "SourceIcon.pinterest",
                    icon: .pinterest
                ),
                IconData(
                    name: "Telegram Brand",
                    iconDescriptor: "SourceIcon.telegramBrand",
                    icon: .telegramBrand
                ),
                IconData(
                    name: "Signal Brand",
                    iconDescriptor: "SourceIcon.signalBrand",
                    icon: .signalBrand
                )
            ]
        ),
        IconSection(
            name: "Communication",
            icons: [
                IconData(
                    name: "Envelope",
                    iconDescriptor: "SourceIcon.envelope",
                    icon: .envelope
                ),
                IconData(
                    name: "Phone",
                    iconDescriptor: "SourceIcon.phone",
                    icon: .phone
                ),
                IconData(
                    name: "Speech Bubble",
                    iconDescriptor: "SourceIcon.speechBubble",
                    icon: .speechBubble
                ),
                IconData(
                    name: "Message",
                    iconDescriptor: "SourceIcon.message",
                    icon: .message
                ),
                IconData(
                    name: "Message Round",
                    iconDescriptor: "SourceIcon.messageRound",
                    icon: .messageRound
                ),
                IconData(
                    name: "Newsletter",
                    iconDescriptor: "SourceIcon.newsletter",
                    icon: .newsletter
                ),
                IconData(
                    name: "Facebook Messenger",
                    iconDescriptor: "SourceIcon.facebookMessenger",
                    icon: .facebookMessenger
                )
            ]
        ),
        IconSection(
            name: "User & People",
            icons: [
                IconData(
                    name: "Person",
                    iconDescriptor: "SourceIcon.person",
                    icon: .person
                ),
                IconData(
                    name: "Person Plus",
                    iconDescriptor: "SourceIcon.personPlus",
                    icon: .personPlus
                ),
                IconData(
                    name: "Person Cross",
                    iconDescriptor: "SourceIcon.personCross",
                    icon: .personCross
                ),
                IconData(
                    name: "Person Tick",
                    iconDescriptor: "SourceIcon.personTick",
                    icon: .personTick
                ),
                IconData(
                    name: "Person Round Filled",
                    iconDescriptor: "SourceIcon.personRoundFilled",
                    icon: .personRoundFilled
                ),
                IconData(
                    name: "Party of Three",
                    iconDescriptor: "SourceIcon.partyOfThree",
                    icon: .partyOfThree
                )
            ]
        ),
        IconSection(
            name: "Home & Location",
            icons: [
                IconData(
                    name: "Home House Filled",
                    iconDescriptor: "SourceIcon.homeHouseFilled",
                    icon: .homeHouseFilled
                ),
                IconData(
                    name: "Home House Outlined",
                    iconDescriptor: "SourceIcon.homeHouseOutlined",
                    icon: .homeHouseOutlined
                ),
                IconData(
                    name: "House Plus",
                    iconDescriptor: "SourceIcon.housePlus",
                    icon: .housePlus
                ),
                IconData(
                    name: "House Cross",
                    iconDescriptor: "SourceIcon.houseCross",
                    icon: .houseCross
                ),
                IconData(
                    name: "House Setting",
                    iconDescriptor: "SourceIcon.houseSetting",
                    icon: .houseSetting
                ),
                IconData(
                    name: "Location Marker",
                    iconDescriptor: "SourceIcon.locationMarker",
                    icon: .locationMarker
                ),
                IconData(
                    name: "GPS",
                    iconDescriptor: "SourceIcon.gps",
                    icon: .gps
                ),
                IconData(
                    name: "Globe",
                    iconDescriptor: "SourceIcon.globe",
                    icon: .globe
                )
            ]
        ),
        IconSection(
            name: "Time & Calendar",
            icons: [
                IconData(
                    name: "Calendar",
                    iconDescriptor: "SourceIcon.calendar",
                    icon: .calendar
                ),
                IconData(
                    name: "Clock Filled",
                    iconDescriptor: "SourceIcon.clockFilled",
                    icon: .clockFilled
                ),
                IconData(
                    name: "Clock Outlined",
                    iconDescriptor: "SourceIcon.clockOutlined",
                    icon: .clockOutlined
                ),
                IconData(
                    name: "Clock Baseline Small",
                    iconDescriptor: "SourceIcon.clockBaselineSmall",
                    icon: .clockBaselineSmall
                ),
                IconData(
                    name: "Timer",
                    iconDescriptor: "SourceIcon.timer",
                    icon: .timer
                ),
                IconData(
                    name: "Alarm Clock Filled",
                    iconDescriptor: "SourceIcon.alarmClockFilled",
                    icon: .alarmClockFilled
                ),
                IconData(
                    name: "Alarm Clock Outlined",
                    iconDescriptor: "SourceIcon.alarmClockOutlined",
                    icon: .alarmClockOutlined
                )
            ]
        ),
        IconSection(
            name: "Alerts & Information",
            icons: [
                IconData(
                    name: "Alert Triangle",
                    iconDescriptor: "SourceIcon.alertTriangle",
                    icon: .alertTriangle
                ),
                IconData(
                    name: "Alert Round",
                    iconDescriptor: "SourceIcon.alertRound",
                    icon: .alertRound
                ),
                IconData(
                    name: "Alert Phone",
                    iconDescriptor: "SourceIcon.alertPhone",
                    icon: .alertPhone
                ),
                IconData(
                    name: "Exclamation",
                    iconDescriptor: "SourceIcon.exclamation",
                    icon: .exclamation
                ),
                IconData(
                    name: "Info Round",
                    iconDescriptor: "SourceIcon.infoRound",
                    icon: .infoRound
                ),
                IconData(
                    name: "Notifications On",
                    iconDescriptor: "SourceIcon.notificationsOn",
                    icon: .notificationsOn
                ),
                IconData(
                    name: "Notifications Off",
                    iconDescriptor: "SourceIcon.notificationsOff",
                    icon: .notificationsOff
                )
            ]
        ),
        IconSection(
            name: "Documents & Files",
            icons: [
                IconData(
                    name: "Document",
                    iconDescriptor: "SourceIcon.document",
                    icon: .document
                ),
                IconData(
                    name: "Folder",
                    iconDescriptor: "SourceIcon.folder",
                    icon: .folder
                ),
                IconData(
                    name: "Folder Filled",
                    iconDescriptor: "SourceIcon.folderFilled",
                    icon: .folderFilled
                ),
                IconData(
                    name: "Note Filled",
                    iconDescriptor: "SourceIcon.noteFilled",
                    icon: .noteFilled
                ),
                IconData(
                    name: "Note Outlined",
                    iconDescriptor: "SourceIcon.noteOutlined",
                    icon: .noteOutlined
                ),
                IconData(
                    name: "Book Outlined",
                    iconDescriptor: "SourceIcon.bookOutlined",
                    icon: .bookOutlined
                ),
                IconData(
                    name: "Newspaper Archive",
                    iconDescriptor: "SourceIcon.newspaperArchive",
                    icon: .newspaperArchive
                )
            ]
        ),
        IconSection(
            name: "Bookmarks & Favorites",
            icons: [
                IconData(
                    name: "Bookmark Filled",
                    iconDescriptor: "SourceIcon.bookmarkFilled",
                    icon: .bookmarkFilled
                ),
                IconData(
                    name: "Bookmark Outlined",
                    iconDescriptor: "SourceIcon.bookmarkOutlined",
                    icon: .bookmarkOutlined
                ),
                IconData(
                    name: "Bookmark Cross",
                    iconDescriptor: "SourceIcon.bookmarkCross",
                    icon: .bookmarkCross
                ),
                IconData(
                    name: "Bookmark Round Filled",
                    iconDescriptor: "SourceIcon.bookmarkRoundFilled",
                    icon: .bookmarkRoundFilled
                ),
                IconData(
                    name: "Star",
                    iconDescriptor: "SourceIcon.star",
                    icon: .star
                ),
                IconData(
                    name: "Star Outline",
                    iconDescriptor: "SourceIcon.starOutline",
                    icon: .starOutline
                ),
                IconData(
                    name: "Pinned",
                    iconDescriptor: "SourceIcon.pinned",
                    icon: .pinned
                )
            ]
        ),
        IconSection(
            name: "Search & Filter",
            icons: [
                IconData(
                    name: "Magnifying Glass",
                    iconDescriptor: "SourceIcon.magnifyingGlass",
                    icon: .magnifyingGlass
                ),
                IconData(
                    name: "Magnifying Glass Plus",
                    iconDescriptor: "SourceIcon.magnifyingGlassPlus",
                    icon: .magnifyingGlassPlus
                ),
                IconData(
                    name: "Magnifying Glass Minus",
                    iconDescriptor: "SourceIcon.magnifyingGlassMinus",
                    icon: .magnifyingGlassMinus
                ),
                IconData(
                    name: "Filter",
                    iconDescriptor: "SourceIcon.filter",
                    icon: .filter
                ),
                IconData(
                    name: "Filter iOS App",
                    iconDescriptor: "SourceIcon.filterIOSApp",
                    icon: .filterIOSApp
                ),
                IconData(
                    name: "Filter Android App",
                    iconDescriptor: "SourceIcon.filterAndroidApp",
                    icon: .filterAndroidApp
                ),
                IconData(
                    name: "Sort",
                    iconDescriptor: "SourceIcon.sort",
                    icon: .sort
                )
            ]
        ),
        IconSection(
            name: "Shopping & Commerce",
            icons: [
                IconData(
                    name: "Shopping Basket",
                    iconDescriptor: "SourceIcon.shoppingBasket",
                    icon: .shoppingBasket
                ),
                IconData(
                    name: "Shopping List",
                    iconDescriptor: "SourceIcon.shoppingList",
                    icon: .shoppingList
                ),
                IconData(
                    name: "Credit Card",
                    iconDescriptor: "SourceIcon.creditCard",
                    icon: .creditCard
                ),
                IconData(
                    name: "Direct Debit",
                    iconDescriptor: "SourceIcon.directDebit",
                    icon: .directDebit
                ),
                IconData(
                    name: "PayPal Brand",
                    iconDescriptor: "SourceIcon.payPalBrand",
                    icon: .payPalBrand
                ),
                IconData(
                    name: "Gift",
                    iconDescriptor: "SourceIcon.gift",
                    icon: .gift
                )
            ]
        ),
        IconSection(
            name: "Text & Typography",
            icons: [
                IconData(
                    name: "Text Size",
                    iconDescriptor: "SourceIcon.textSize",
                    icon: .textSize
                ),
                IconData(
                    name: "Text Size Round Filled",
                    iconDescriptor: "SourceIcon.textSizeRoundFilled",
                    icon: .textSizeRoundFilled
                ),
                IconData(
                    name: "Text Large",
                    iconDescriptor: "SourceIcon.textLarge",
                    icon: .textLarge
                ),
                IconData(
                    name: "Text Small",
                    iconDescriptor: "SourceIcon.textSmall",
                    icon: .textSmall
                ),
                IconData(
                    name: "Quote",
                    iconDescriptor: "SourceIcon.quote",
                    icon: .quote
                )
            ]
        ),
        IconSection(
            name: "Settings & Tools",
            icons: [
                IconData(
                    name: "Settings",
                    iconDescriptor: "SourceIcon.settings",
                    icon: .settings
                ),
                IconData(
                    name: "Menu",
                    iconDescriptor: "SourceIcon.menu",
                    icon: .menu
                ),
                IconData(
                    name: "Ellipsis",
                    iconDescriptor: "SourceIcon.ellipsis",
                    icon: .ellipsis
                ),
                IconData(
                    name: "Padlock",
                    iconDescriptor: "SourceIcon.padlock",
                    icon: .padlock
                ),
                IconData(
                    name: "Padlock Locked",
                    iconDescriptor: "SourceIcon.padlockLocked",
                    icon: .padlockLocked
                ),
                IconData(
                    name: "Eye",
                    iconDescriptor: "SourceIcon.eye",
                    icon: .eye
                ),
                IconData(
                    name: "Eye Strike",
                    iconDescriptor: "SourceIcon.eyeStrike",
                    icon: .eyeStrike
                )
            ]
        ),
        IconSection(
            name: "Miscellaneous",
            icons: [
                IconData(
                    name: "Camera",
                    iconDescriptor: "SourceIcon.camera",
                    icon: .camera
                ),
                IconData(
                    name: "External",
                    iconDescriptor: "SourceIcon.external",
                    icon: .external
                ),
                IconData(
                    name: "Share Web",
                    iconDescriptor: "SourceIcon.shareWeb",
                    icon: .shareWeb
                ),
                IconData(
                    name: "Share Round Filled",
                    iconDescriptor: "SourceIcon.shareRoundFilled",
                    icon: .shareRoundFilled
                ),
                IconData(
                    name: "List",
                    iconDescriptor: "SourceIcon.list",
                    icon: .list
                ),
                IconData(
                    name: "Moon",
                    iconDescriptor: "SourceIcon.moon",
                    icon: .moon
                ),
                IconData(
                    name: "Crosswords",
                    iconDescriptor: "SourceIcon.crosswords",
                    icon: .crosswords
                ),
                IconData(
                    name: "Discover",
                    iconDescriptor: "SourceIcon.discover",
                    icon: .discover
                )
            ]
        )
    ]
}