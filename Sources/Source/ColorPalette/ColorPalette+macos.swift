//
//  File.swift
//  
//
//  Created by Aoife McLaughlin on 05/07/2024.
//

#if os(macOS)
import AppKit
/**
 Module that defines the brand colours from [Source documentation](https://design.theguardian.com/#colour-palette).
 This currently only holds references to the colours and extensions to assist with defining colours elsewhere.
 */
public enum ColorPalette {
    // MARK: Brand
    public static let brand100 = NSColor(resource: .brand100)
    public static let brand300 = NSColor(resource: .brand300)
    public static let brand400 = NSColor(resource: .brand400)
    public static let brand500 = NSColor(resource: .brand500)
    public static let brand600 = NSColor(resource: .brand600)
    public static let brand800 = NSColor(resource: .brand800)

    // MARK: Alternative brand

    public static let brandAlt200 = NSColor(resource: .brandAlt200)
    public static let brandAlt300 = NSColor(resource: .brandAlt300)
    public static let brandAlt400 = NSColor(resource: .brandAlt400)

    // MARK: Culture
    public static let culture50 =  NSColor(resource: .culture50)
    public static let culture100 = NSColor(resource: .culture100)
    public static let culture200 = NSColor(resource: .culture200)
    public static let culture300 = NSColor(resource: .culture300)
    public static let culture400 = NSColor(resource: .culture400)
    public static let culture450 = NSColor(resource: .culture450)
    public static let culture500 = NSColor(resource: .culture500)
    public static let culture600 = NSColor(resource: .culture600)
    public static let culture700 = NSColor(resource: .culture700)
    public static let culture800 = NSColor(resource: .culture800)

    // MARK: Error
    public static let error400 = NSColor(resource: .error400)
    public static let error500 = NSColor(resource: .error500)

    // MARK: Labs
    public static let labs200 = NSColor(resource: .labs200)
    public static let labs300 = NSColor(resource: .labs300)
    public static let labs400 = NSColor(resource: .labs400)

    // MARK: Lifestyle
    public static let lifestyle100 = NSColor(resource: .lifestyle100)
    public static let lifestyle200 = NSColor(resource: .lifestyle200)
    public static let lifestyle300 = NSColor(resource: .lifestyle300)
    public static let lifestyle400 = NSColor(resource: .lifestyle400)
    public static let lifestyle450 = NSColor(resource: .lifestyle450)
    public static let lifestyle500 = NSColor(resource: .lifestyle500)
    public static let lifestyle600 = NSColor(resource: .lifestyle600)
    public static let lifestyle800 = NSColor(resource: .lifestyle800)

    // MARK: Neutral
    public static let neutral0 =  NSColor(resource: .neutral0)
    public static let neutral7 =  NSColor(resource: .neutral7)
    public static let neutral10 = NSColor(resource: .neutral10)
    public static let neutral20 = NSColor(resource: .neutral20)
    public static let neutral38 = NSColor(resource: .neutral38)
    public static let neutral46 = NSColor(resource: .neutral46)
    public static let neutral60 = NSColor(resource: .neutral60)
    public static let neutral73 = NSColor(resource: .neutral73)
    public static let neutral86 = NSColor(resource: .neutral86)
    public static let neutral93 = NSColor(resource: .neutral93)
    public static let neutral97 = NSColor(resource: .neutral97)
    public static let neutral100 = NSColor(resource: .neutral100)

    // MARK: News
    public static let news100 = NSColor(resource: .news100)
    public static let news200 = NSColor(resource: .news200)
    public static let news300 = NSColor(resource: .news300)
    public static let news400 = NSColor(resource: .news400)
    public static let news500 = NSColor(resource: .news500)
    public static let news550 = NSColor(resource: .news550)
    public static let news600 = NSColor(resource: .news600)
    public static let news800 = NSColor(resource: .news800)

    // MARK: Opinion
    public static let opinion100 = NSColor(resource: .opinion100)
    public static let opinion200 = NSColor(resource: .opinion200)
    public static let opinion400 = NSColor(resource: .opinion400)
    public static let opinion450 = NSColor(resource: .opinion450)
    public static let opinion500 = NSColor(resource: .opinion500)
    public static let opinion550 = NSColor(resource: .opinion550)
    public static let opinion600 = NSColor(resource: .opinion600)
    public static let opinion700 = NSColor(resource: .opinion700)
    public static let opinion800 = NSColor(resource: .opinion800)

    // MARK: Special Report
    public static let specialReport100 = NSColor(resource: .specialReport100)
    public static let specialReport200 = NSColor(resource: .specialReport200)
    public static let specialReport300 = NSColor(resource: .specialReport300)
    public static let specialReport400 = NSColor(resource: .specialReport400)
    public static let specialReport450 = NSColor(resource: .specialReport450)
    public static let specialReport500 = NSColor(resource: .specialReport500)
    public static let specialReport700 = NSColor(resource: .specialReport700)
    public static let specialReport800 = NSColor(resource: .specialReport800)

    // MARK: Special Report Alternative
    public static let specialReportAlt100 = NSColor(resource: .specialReportAlt100)
    public static let specialReportAlt200 = NSColor(resource: .specialReportAlt200)
    public static let specialReportAlt300 = NSColor(resource: .specialReportAlt300)
    public static let specialReportAlt700 = NSColor(resource: .specialReportAlt700)
    public static let specialReportAlt800 = NSColor(resource: .specialReportAlt800)

    // MARK: Sport
    public static let sport100 = NSColor(resource: .sport100)
    public static let sport200 = NSColor(resource: .sport200)
    public static let sport300 = NSColor(resource: .sport300)
    public static let sport400 = NSColor(resource: .sport400)
    public static let sport500 = NSColor(resource: .sport500)
    public static let sport600 = NSColor(resource: .sport600)
    public static let sport800 = NSColor(resource: .sport800)

    // MARK: Success
    public static let success300 = NSColor(resource: .success300)
    public static let success400 = NSColor(resource: .success400)
    public static let success500 = NSColor(resource: .success500)
}
#endif
