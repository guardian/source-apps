//
//  PillarColorViewModel.swift
//  SourceSample
//
//  Created by Aoife McLaughlin on 04/07/2024.
//

import Foundation
import Source

struct ColorSection {
    let name: String
    let colors: [ColorSwatch]
}

struct PaletteViewModel {
    let sections = [
        ColorSection(name: "News", colors: [
            ColorSwatch(color: ColorPalette.news100, description: "100"),
            ColorSwatch(color: ColorPalette.news200, description: "200"),
            ColorSwatch(color: ColorPalette.news300, description: "300"),
            ColorSwatch(color: ColorPalette.news400, description: "400"),
            ColorSwatch(color: ColorPalette.news500, description: "500"),
            ColorSwatch(color: ColorPalette.news550, description: "550"),
            ColorSwatch(color: ColorPalette.news600, description: "600"),
            ColorSwatch(color: ColorPalette.news700, description: "700"),
            ColorSwatch(color: ColorPalette.news800, description: "800")
        ]),
        ColorSection(name: "Opinion", colors: [
            ColorSwatch(color: ColorPalette.opinion100, description: "100"),
            ColorSwatch(color: ColorPalette.opinion200, description: "200"),
            ColorSwatch(color: ColorPalette.opinion400, description: "400"),
            ColorSwatch(color: ColorPalette.opinion450, description: "450"),
            ColorSwatch(color: ColorPalette.opinion500, description: "500"),
            ColorSwatch(color: ColorPalette.opinion550, description: "550"),
            ColorSwatch(color: ColorPalette.opinion600, description: "600"),
            ColorSwatch(color: ColorPalette.opinion700, description: "700"),
            ColorSwatch(color: ColorPalette.opinion800, description: "800")
        ]),
        ColorSection(name: "Sport", colors: [
            ColorSwatch(color: ColorPalette.sport100, description: "100"),
            ColorSwatch(color: ColorPalette.sport200, description: "200"),
            ColorSwatch(color: ColorPalette.sport300, description: "300"),
            ColorSwatch(color: ColorPalette.sport400, description: "400"),
            ColorSwatch(color: ColorPalette.sport500, description: "500"),
            ColorSwatch(color: ColorPalette.sport600, description: "600"),
            ColorSwatch(color: ColorPalette.sport700, description: "700"),
            ColorSwatch(color: ColorPalette.sport800, description: "800")
        ]),
        ColorSection(name: "Culture", colors: [
            ColorSwatch(color: ColorPalette.culture50, description: "50"),
            ColorSwatch(color: ColorPalette.culture100, description: "100"),
            ColorSwatch(color: ColorPalette.culture200, description: "200"),
            ColorSwatch(color: ColorPalette.culture300, description: "300"),
            ColorSwatch(color: ColorPalette.culture400, description: "400"),
            ColorSwatch(color: ColorPalette.culture450, description: "450"),
            ColorSwatch(color: ColorPalette.culture500, description: "500"),
            ColorSwatch(color: ColorPalette.culture600, description: "600"),
            ColorSwatch(color: ColorPalette.culture700, description: "700"),
            ColorSwatch(color: ColorPalette.culture800, description: "800")
        ]),
        ColorSection(name: "Lifestyle", colors: [
            ColorSwatch(color: ColorPalette.lifestyle100, description: "100"),
            ColorSwatch(color: ColorPalette.lifestyle200, description: "200"),
            ColorSwatch(color: ColorPalette.lifestyle300, description: "300"),
            ColorSwatch(color: ColorPalette.lifestyle400, description: "400"),
            ColorSwatch(color: ColorPalette.lifestyle450, description: "450"),
            ColorSwatch(color: ColorPalette.lifestyle500, description: "500"),
            ColorSwatch(color: ColorPalette.lifestyle600, description: "600"),
            ColorSwatch(color: ColorPalette.lifestyle800, description: "800")
        ]),
        ColorSection(name: "Brand", colors: [
            ColorSwatch(color: ColorPalette.brand100, description: "100"),
            ColorSwatch(color: ColorPalette.brand300, description: "300"),
            ColorSwatch(color: ColorPalette.brand400, description: "400"),
            ColorSwatch(color: ColorPalette.brand500, description: "500"),
            ColorSwatch(color: ColorPalette.brand600, description: "600"),
            ColorSwatch(color: ColorPalette.brand800, description: "800")
        ]),
        ColorSection(name: "Brand Alt", colors: [
            ColorSwatch(color: ColorPalette.brandAlt200, description: "200"),
            ColorSwatch(color: ColorPalette.brandAlt300, description: "300"),
            ColorSwatch(color: ColorPalette.brandAlt400, description: "400"),
        ]),
        ColorSection(name: "Neutral", colors: [
            ColorSwatch(color: ColorPalette.neutral0, description: "0"),
            ColorSwatch(color: ColorPalette.neutral7, description: "7"),
            ColorSwatch(color: ColorPalette.neutral10, description: "10"),
            ColorSwatch(color: ColorPalette.neutral20, description: "20"),
            ColorSwatch(color: ColorPalette.neutral38, description: "38"),
            ColorSwatch(color: ColorPalette.neutral46, description: "46"),
            ColorSwatch(color: ColorPalette.neutral60, description: "60"),
            ColorSwatch(color: ColorPalette.neutral73, description: "73"),
            ColorSwatch(color: ColorPalette.neutral86, description: "86"),
            ColorSwatch(color: ColorPalette.neutral93, description: "93"),
            ColorSwatch(color: ColorPalette.neutral97, description: "97"),
            ColorSwatch(color: ColorPalette.neutral100, description: "100")
        ]),
        ColorSection(name: "Special Report", colors: [
            ColorSwatch(color: ColorPalette.specialReport100, description: "100"),
            ColorSwatch(color: ColorPalette.specialReport200, description: "200"),
            ColorSwatch(color: ColorPalette.specialReport300, description: "300"),
            ColorSwatch(color: ColorPalette.specialReport400, description: "400"),
            ColorSwatch(color: ColorPalette.specialReport450, description: "450"),
            ColorSwatch(color: ColorPalette.specialReport500, description: "500"),
            ColorSwatch(color: ColorPalette.specialReport700, description: "700"),
            ColorSwatch(color: ColorPalette.specialReport800, description: "800")
        ]),
        ColorSection(name: "Special Report Alt", colors: [
            ColorSwatch(color: ColorPalette.specialReportAlt100, description: "100"),
            ColorSwatch(color: ColorPalette.specialReportAlt200, description: "200"),
            ColorSwatch(color: ColorPalette.specialReportAlt300, description: "300"),
            ColorSwatch(color: ColorPalette.specialReportAlt700, description: "700"),
            ColorSwatch(color: ColorPalette.specialReportAlt800, description: "800")
        ]),
        ColorSection(name: "Labs", colors: [
            ColorSwatch(color: ColorPalette.labs100, description: "100"),
            ColorSwatch(color: ColorPalette.labs200, description: "200"),
            ColorSwatch(color: ColorPalette.labs300, description: "300"),
            ColorSwatch(color: ColorPalette.labs400, description: "400"),
            ColorSwatch(color: ColorPalette.labs500, description: "500"),
            ColorSwatch(color: ColorPalette.labs600, description: "600"),
            ColorSwatch(color: ColorPalette.labs700, description: "700")
        ]),
        ColorSection(name: "Error", colors: [
            ColorSwatch(color: ColorPalette.error400, description: "400"),
            ColorSwatch(color: ColorPalette.error500, description: "500")
        ]),
        ColorSection(name: "Success", colors: [
            ColorSwatch(color: ColorPalette.success300, description: "300"),
            ColorSwatch(color: ColorPalette.success400, description: "400"),
            ColorSwatch(color: ColorPalette.success500, description: "500")
        ]),
        ColorSection(name: "Notification Blue", colors: [
            ColorSwatch(color: ColorPalette.notificationBlue400, description: "400")
        ])
    ]
}
