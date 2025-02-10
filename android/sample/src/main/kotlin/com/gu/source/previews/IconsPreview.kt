package com.gu.source.previews

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.components.buttons.SourceButton
import com.gu.source.components.buttons.SourceIconButton
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.icons.*
import com.gu.source.presets.palette.Neutral0
import com.gu.source.presets.palette.Neutral100
import com.gu.source.presets.typography.HeadlineBold20
import com.gu.source.presets.typography.TextSansBold15

private val icons = listOf(
    Source.Icons.Base.AlertPhone,
    Source.Icons.Base.AlertRound,
    Source.Icons.Base.AppleBrand,
    Source.Icons.Base.ArrowContract,
    Source.Icons.Base.ArrowDownStraight,
    Source.Icons.Base.ArrowExpand,
    Source.Icons.Base.ArrowLeftStraight,
    Source.Icons.Base.ArrowOutdent,
    Source.Icons.Base.ArrowPopOut,
    Source.Icons.Base.ArrowRightStraight,
    Source.Icons.Base.ArrowScroll,
    Source.Icons.Base.ArrowUpAndDownSmall,
    Source.Icons.Base.ArrowUpStraight,
    Source.Icons.Base.ArrowUpStraightSmall,
    Source.Icons.Base.Asterisk,
    Source.Icons.Base.Audio,
    Source.Icons.Base.AudioMute,
    Source.Icons.Base.BookmarkCross,
    Source.Icons.Base.BookmarkFilled,
    Source.Icons.Base.BookmarkRoundFilled,
    Source.Icons.Base.Calendar,
    Source.Icons.Base.Camera,
    Source.Icons.Base.Checkmark,
    Source.Icons.Base.ChevronDownDouble,
    Source.Icons.Base.ChevronDownSingle,
    Source.Icons.Base.ChevronLeftDouble,
    Source.Icons.Base.ChevronLeftSingle,
    Source.Icons.Base.ChevronLeftSmall,
    Source.Icons.Base.ChevronRightDouble,
    Source.Icons.Base.ChevronRightSingle,
    Source.Icons.Base.ChevronRightSmall,
    Source.Icons.Base.ChevronUpDouble,
    Source.Icons.Base.ChevronUpSingle,
    Source.Icons.Base.ClockBaselineSmall,
    Source.Icons.Base.ClockFilled,
    Source.Icons.Base.ClockOutlined,
    Source.Icons.Base.CreditCard,
    Source.Icons.Base.Cross,
    Source.Icons.Base.Crosswords,
    Source.Icons.Base.DirectDebit,
    Source.Icons.Base.Document,
    Source.Icons.Base.Download,
    Source.Icons.Base.DragHandle,
    Source.Icons.Base.Edit,
    Source.Icons.Base.Ellipsis,
    Source.Icons.Base.Envelope,
    Source.Icons.Base.Exclamation,
    Source.Icons.Base.External,
    Source.Icons.Base.Eye,
    Source.Icons.Base.EyeStrike,
    Source.Icons.Base.Facebook,
    Source.Icons.Base.FacebookBrand,
    Source.Icons.Base.FacebookMessenger,
    Source.Icons.Base.Filter,
    Source.Icons.Base.FilterAndroidAppSmall,
    Source.Icons.Base.Gift,
    Source.Icons.Base.Gps,
    Source.Icons.Base.HandPointed,
    Source.Icons.Base.HeadphonesRoundFilled,
    Source.Icons.Base.HomeHouseFilled,
    Source.Icons.Base.HouseCross,
    Source.Icons.Base.HousePlus,
    Source.Icons.Base.HouseSetting,
    Source.Icons.Base.Indent,
    Source.Icons.Base.InfoRound,
    Source.Icons.Base.Ingredient1,
    Source.Icons.Base.LinkedIn,
    Source.Icons.Base.List,
    Source.Icons.Base.LocationMarker,
    Source.Icons.Base.MagnifyingGlass,
    Source.Icons.Base.MagnifyingGlassMinus,
    Source.Icons.Base.MagnifyingGlassPlus,
    Source.Icons.Base.MagnifyingGlassSadFace,
    Source.Icons.Base.MediaControlsBack,
    Source.Icons.Base.MediaControlsForward,
    Source.Icons.Base.MediaControlsPause,
    Source.Icons.Base.MediaControlsPlay,
    Source.Icons.Base.MediaControlsStop,
    Source.Icons.Base.Menu,
    Source.Icons.Base.Minus,
    Source.Icons.Base.Moon,
    Source.Icons.Base.Newsletter,
    Source.Icons.Base.NewspaperArchive,
    Source.Icons.Base.NotificationsOff,
    Source.Icons.Base.NotificationsOn,
    Source.Icons.Base.Padlock,
    Source.Icons.Base.PartyOfThree,
    Source.Icons.Base.PayPalBrand,
    Source.Icons.Base.Person,
    Source.Icons.Base.PersonCross,
    Source.Icons.Base.PersonPlus,
    Source.Icons.Base.PersonTick,
    Source.Icons.Base.Phone,
    Source.Icons.Base.Pinterest,
    Source.Icons.Base.Plus,
    Source.Icons.Base.Quote,
    Source.Icons.Base.Reload,
    Source.Icons.Base.Settings,
    Source.Icons.Base.ShareCallout,
    Source.Icons.Base.ShareRoundFilled,
    Source.Icons.Base.ShareWeb,
    Source.Icons.Base.SpeechBubble,
    Source.Icons.Base.SpeechBubbleCross,
    Source.Icons.Base.SpeechBubblePlus,
    Source.Icons.Base.Star,
    Source.Icons.Base.TextLarge,
    Source.Icons.Base.TextSize,
    Source.Icons.Base.TextSizeRoundFilled,
    Source.Icons.Base.TextSmall,
    Source.Icons.Base.TickRound,
    Source.Icons.Base.TransparentArrowLeftStraightRound,
    Source.Icons.Base.Upload,
    Source.Icons.Base.Video,
    Source.Icons.Base.WhatsApp,
)

@Composable
internal fun IconsPreview(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = AppColour(Source.Palette.Neutral100, Source.Palette.Neutral0).current,
        contentColor = AppColour(Source.Palette.Neutral0, Source.Palette.Neutral100).current,
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(vertical = 8.dp),
        ) {
            item(span = { GridItemSpan(2) }) {
                Text(
                    text = "Icons",
                    style = Source.Typography.HeadlineBold20,
                    modifier = Modifier.padding(8.dp),
                )
            }
            items(icons) { icon ->
                Row(
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    SourceIconButton(
                        icon = icon,
                        priority = SourceButton.Priority.TertiaryOnWhite,
                        contentDescription = null,
                        onClick = {},
                        size = SourceButton.Size.XSmall,
                    )
                    Text(
                        text = icon.name,
                        style = Source.Typography.TextSansBold15,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                    )
                }
            }
        }
    }
}

@Preview(device = "spec:width=1080px,height=8340px,dpi=440")
@Composable
private fun Preview() {
    AppColourMode {
        IconsPreview()
    }
}