package com.gu.source.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.Source
import com.gu.source.daynight.AppColour
import com.gu.source.daynight.AppColourMode
import com.gu.source.foundation.icons.base.AddToBasket
import com.gu.source.foundation.icons.base.AiIndicator
import com.gu.source.foundation.icons.base.AlarmClockFilled
import com.gu.source.foundation.icons.base.AlarmClockOutlined
import com.gu.source.foundation.icons.base.AlarmClockSounded
import com.gu.source.foundation.icons.base.AlertPhone
import com.gu.source.foundation.icons.base.AlertRound
import com.gu.source.foundation.icons.base.AlertTriangle
import com.gu.source.foundation.icons.base.AllRecipes
import com.gu.source.foundation.icons.base.AppleBrand
import com.gu.source.foundation.icons.base.ArrowContract
import com.gu.source.foundation.icons.base.ArrowDownStraight
import com.gu.source.foundation.icons.base.ArrowExpand
import com.gu.source.foundation.icons.base.ArrowLeftStraight
import com.gu.source.foundation.icons.base.ArrowOutdent
import com.gu.source.foundation.icons.base.ArrowPopOut
import com.gu.source.foundation.icons.base.ArrowRightStraight
import com.gu.source.foundation.icons.base.ArrowScroll
import com.gu.source.foundation.icons.base.ArrowUpAndDownSmall
import com.gu.source.foundation.icons.base.ArrowUpStraight
import com.gu.source.foundation.icons.base.ArrowUpStraightSmall
import com.gu.source.foundation.icons.base.Asterisk
import com.gu.source.foundation.icons.base.Audio
import com.gu.source.foundation.icons.base.AudioMute
import com.gu.source.foundation.icons.base.Bin
import com.gu.source.foundation.icons.base.BookOutlined
import com.gu.source.foundation.icons.base.BookmarkCross
import com.gu.source.foundation.icons.base.BookmarkFilled
import com.gu.source.foundation.icons.base.BookmarkOutlined
import com.gu.source.foundation.icons.base.BookmarkRoundFilled
import com.gu.source.foundation.icons.base.BookmarkRoundOutlined
import com.gu.source.foundation.icons.base.Calendar
import com.gu.source.foundation.icons.base.Camera
import com.gu.source.foundation.icons.base.CameraRoundOutlined
import com.gu.source.foundation.icons.base.CameraSmall
import com.gu.source.foundation.icons.base.Checkmark
import com.gu.source.foundation.icons.base.Chef
import com.gu.source.foundation.icons.base.ChevronDownDouble
import com.gu.source.foundation.icons.base.ChevronDownSingle
import com.gu.source.foundation.icons.base.ChevronDownSingleSmall
import com.gu.source.foundation.icons.base.ChevronDownSingleXsmall
import com.gu.source.foundation.icons.base.ChevronLeftDouble
import com.gu.source.foundation.icons.base.ChevronLeftSingle
import com.gu.source.foundation.icons.base.ChevronLeftSmall
import com.gu.source.foundation.icons.base.ChevronRightDouble
import com.gu.source.foundation.icons.base.ChevronRightSingle
import com.gu.source.foundation.icons.base.ChevronRightSmall
import com.gu.source.foundation.icons.base.ChevronUpAndDownSmall
import com.gu.source.foundation.icons.base.ChevronUpDouble
import com.gu.source.foundation.icons.base.ChevronUpSingle
import com.gu.source.foundation.icons.base.ChevronUpSingleSmall
import com.gu.source.foundation.icons.base.ClockBaselineSmall
import com.gu.source.foundation.icons.base.ClockFilled
import com.gu.source.foundation.icons.base.ClockOutlined
import com.gu.source.foundation.icons.base.CreditCard
import com.gu.source.foundation.icons.base.Cross
import com.gu.source.foundation.icons.base.CrossRoundFilled
import com.gu.source.foundation.icons.base.CrossRoundOutlined
import com.gu.source.foundation.icons.base.CrossSmall
import com.gu.source.foundation.icons.base.CrossedOutCloud
import com.gu.source.foundation.icons.base.Crosswords
import com.gu.source.foundation.icons.base.Cuisine
import com.gu.source.foundation.icons.base.Diets
import com.gu.source.foundation.icons.base.DirectDebit
import com.gu.source.foundation.icons.base.DirectDebitWide
import com.gu.source.foundation.icons.base.Discover
import com.gu.source.foundation.icons.base.Document
import com.gu.source.foundation.icons.base.Download
import com.gu.source.foundation.icons.base.DragHandle
import com.gu.source.foundation.icons.base.Edit
import com.gu.source.foundation.icons.base.Ellipsis
import com.gu.source.foundation.icons.base.Envelope
import com.gu.source.foundation.icons.base.Exclamation
import com.gu.source.foundation.icons.base.External
import com.gu.source.foundation.icons.base.Eye
import com.gu.source.foundation.icons.base.EyeStrike
import com.gu.source.foundation.icons.base.Facebook
import com.gu.source.foundation.icons.base.FacebookBrand
import com.gu.source.foundation.icons.base.FacebookMessenger
import com.gu.source.foundation.icons.base.Filter
import com.gu.source.foundation.icons.base.FilterAndroidApp
import com.gu.source.foundation.icons.base.FilterAndroidAppSmall
import com.gu.source.foundation.icons.base.FilterIosApp
import com.gu.source.foundation.icons.base.FilterIosAppSmall
import com.gu.source.foundation.icons.base.FilterOutlinedWeb
import com.gu.source.foundation.icons.base.Folder
import com.gu.source.foundation.icons.base.FolderFilled
import com.gu.source.foundation.icons.base.Gift
import com.gu.source.foundation.icons.base.Globe
import com.gu.source.foundation.icons.base.GoogleBrand
import com.gu.source.foundation.icons.base.Gps
import com.gu.source.foundation.icons.base.GuessPuzzles
import com.gu.source.foundation.icons.base.HandPointed
import com.gu.source.foundation.icons.base.HeadphonesFilled
import com.gu.source.foundation.icons.base.HeadphonesOutlined
import com.gu.source.foundation.icons.base.HeadphonesRoundFilled
import com.gu.source.foundation.icons.base.HeadphonesRoundOutlined
import com.gu.source.foundation.icons.base.HomeHouseFilled
import com.gu.source.foundation.icons.base.HomeHouseOutlined
import com.gu.source.foundation.icons.base.HomeSquareFilled
import com.gu.source.foundation.icons.base.HomeSquareOutlined
import com.gu.source.foundation.icons.base.HouseCross
import com.gu.source.foundation.icons.base.HousePlus
import com.gu.source.foundation.icons.base.HouseSetting
import com.gu.source.foundation.icons.base.Indent
import com.gu.source.foundation.icons.base.InfoRound
import com.gu.source.foundation.icons.base.Ingredient1
import com.gu.source.foundation.icons.base.Ingredient2
import com.gu.source.foundation.icons.base.Ingredient3
import com.gu.source.foundation.icons.base.KnifeAndFork
import com.gu.source.foundation.icons.base.LinkedIn
import com.gu.source.foundation.icons.base.List
import com.gu.source.foundation.icons.base.LocationMarker
import com.gu.source.foundation.icons.base.MagnifyingGlass
import com.gu.source.foundation.icons.base.MagnifyingGlassMinus
import com.gu.source.foundation.icons.base.MagnifyingGlassPlus
import com.gu.source.foundation.icons.base.MagnifyingGlassSadFace
import com.gu.source.foundation.icons.base.MealTypes
import com.gu.source.foundation.icons.base.MediaControlsBack
import com.gu.source.foundation.icons.base.MediaControlsForward
import com.gu.source.foundation.icons.base.MediaControlsPause
import com.gu.source.foundation.icons.base.MediaControlsPlay
import com.gu.source.foundation.icons.base.MediaControlsStop
import com.gu.source.foundation.icons.base.Menu
import com.gu.source.foundation.icons.base.Message
import com.gu.source.foundation.icons.base.MessageRound
import com.gu.source.foundation.icons.base.Minus
import com.gu.source.foundation.icons.base.Moon
import com.gu.source.foundation.icons.base.Newsletter
import com.gu.source.foundation.icons.base.NewsletterOutlined
import com.gu.source.foundation.icons.base.NewspaperArchive
import com.gu.source.foundation.icons.base.NoteFilled
import com.gu.source.foundation.icons.base.NoteOutlined
import com.gu.source.foundation.icons.base.NotificationsOff
import com.gu.source.foundation.icons.base.NotificationsOffRound
import com.gu.source.foundation.icons.base.NotificationsOn
import com.gu.source.foundation.icons.base.NotificationsOnRound
import com.gu.source.foundation.icons.base.Padlock
import com.gu.source.foundation.icons.base.PadlockLocked
import com.gu.source.foundation.icons.base.PadlockUnlocked
import com.gu.source.foundation.icons.base.PartyOfThree
import com.gu.source.foundation.icons.base.PartyPopperFilled
import com.gu.source.foundation.icons.base.PartyPopperOutlined
import com.gu.source.foundation.icons.base.PayPalBrand
import com.gu.source.foundation.icons.base.Person
import com.gu.source.foundation.icons.base.PersonCross
import com.gu.source.foundation.icons.base.PersonPlus
import com.gu.source.foundation.icons.base.PersonRoundFilled
import com.gu.source.foundation.icons.base.PersonRoundOutlined
import com.gu.source.foundation.icons.base.PersonTick
import com.gu.source.foundation.icons.base.Phone
import com.gu.source.foundation.icons.base.Pinned
import com.gu.source.foundation.icons.base.Pinterest
import com.gu.source.foundation.icons.base.Plus
import com.gu.source.foundation.icons.base.PlusOnRound
import com.gu.source.foundation.icons.base.Quote
import com.gu.source.foundation.icons.base.Reload
import com.gu.source.foundation.icons.base.Settings
import com.gu.source.foundation.icons.base.ShareApp
import com.gu.source.foundation.icons.base.ShareAppSmall
import com.gu.source.foundation.icons.base.ShareCallout
import com.gu.source.foundation.icons.base.ShareRoundFilled
import com.gu.source.foundation.icons.base.ShareRoundOutline
import com.gu.source.foundation.icons.base.ShareWeb
import com.gu.source.foundation.icons.base.ShoppingBasket
import com.gu.source.foundation.icons.base.ShoppingList
import com.gu.source.foundation.icons.base.SignalBrand
import com.gu.source.foundation.icons.base.Sort
import com.gu.source.foundation.icons.base.SpeechBubble
import com.gu.source.foundation.icons.base.SpeechBubbleCross
import com.gu.source.foundation.icons.base.SpeechBubblePlus
import com.gu.source.foundation.icons.base.Star
import com.gu.source.foundation.icons.base.StarOutline
import com.gu.source.foundation.icons.base.TelegramBrand
import com.gu.source.foundation.icons.base.TextLarge
import com.gu.source.foundation.icons.base.TextSize
import com.gu.source.foundation.icons.base.TextSizeRoundFilled
import com.gu.source.foundation.icons.base.TextSizeRoundOutline
import com.gu.source.foundation.icons.base.TextSmall
import com.gu.source.foundation.icons.base.TickRound
import com.gu.source.foundation.icons.base.Timer
import com.gu.source.foundation.icons.base.TransparentArrowLeftStraightRound
import com.gu.source.foundation.icons.base.Trophy
import com.gu.source.foundation.icons.base.Twitter
import com.gu.source.foundation.icons.base.Upload
import com.gu.source.foundation.icons.base.Video
import com.gu.source.foundation.icons.base.WhatsApp
import com.gu.source.foundation.icons.base.WhatsAppBrand
import com.gu.source.foundation.icons.base.WhiteArrowLeftStraightRound
import com.gu.source.foundation.palette.Brand400
import com.gu.source.foundation.palette.Neutral97
import com.gu.source.foundation.typography.TextSans15

private val icons = listOf(
    Source.Icons.Base.AddToBasket,
    Source.Icons.Base.AiIndicator,
    Source.Icons.Base.AlarmClockFilled,
    Source.Icons.Base.AlarmClockOutlined,
    Source.Icons.Base.AlarmClockSounded,
    Source.Icons.Base.AlertPhone,
    Source.Icons.Base.AlertRound,
    Source.Icons.Base.AlertTriangle,
    Source.Icons.Base.AllRecipes,
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
    Source.Icons.Base.Bin,
    Source.Icons.Base.BookmarkCross,
    Source.Icons.Base.BookmarkFilled,
    Source.Icons.Base.BookmarkOutlined,
    Source.Icons.Base.BookmarkRoundFilled,
    Source.Icons.Base.BookmarkRoundOutlined,
    Source.Icons.Base.BookOutlined,
    Source.Icons.Base.Calendar,
    Source.Icons.Base.Camera,
    Source.Icons.Base.CameraRoundOutlined,
    Source.Icons.Base.CameraSmall,
    Source.Icons.Base.Checkmark,
    Source.Icons.Base.Chef,
    Source.Icons.Base.ChevronDownDouble,
    Source.Icons.Base.ChevronDownSingle,
    Source.Icons.Base.ChevronDownSingleSmall,
    Source.Icons.Base.ChevronDownSingleXsmall,
    Source.Icons.Base.ChevronLeftDouble,
    Source.Icons.Base.ChevronLeftSingle,
    Source.Icons.Base.ChevronLeftSmall,
    Source.Icons.Base.ChevronRightDouble,
    Source.Icons.Base.ChevronRightSingle,
    Source.Icons.Base.ChevronRightSmall,
    Source.Icons.Base.ChevronUpAndDownSmall,
    Source.Icons.Base.ChevronUpDouble,
    Source.Icons.Base.ChevronUpSingle,
    Source.Icons.Base.ChevronUpSingleSmall,
    Source.Icons.Base.ClockBaselineSmall,
    Source.Icons.Base.ClockFilled,
    Source.Icons.Base.ClockOutlined,
    Source.Icons.Base.CreditCard,
    Source.Icons.Base.Cross,
    Source.Icons.Base.CrossedOutCloud,
    Source.Icons.Base.CrossRoundFilled,
    Source.Icons.Base.CrossRoundOutlined,
    Source.Icons.Base.CrossSmall,
    Source.Icons.Base.Crosswords,
    Source.Icons.Base.Cuisine,
    Source.Icons.Base.Diets,
    Source.Icons.Base.DirectDebit,
    Source.Icons.Base.DirectDebitWide,
    Source.Icons.Base.Discover,
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
    Source.Icons.Base.FilterAndroidApp,
    Source.Icons.Base.FilterAndroidAppSmall,
    Source.Icons.Base.FilterIosApp,
    Source.Icons.Base.FilterIosAppSmall,
    Source.Icons.Base.FilterOutlinedWeb,
    Source.Icons.Base.Folder,
    Source.Icons.Base.FolderFilled,
    Source.Icons.Base.Gift,
    Source.Icons.Base.Globe,
    Source.Icons.Base.GoogleBrand,
    Source.Icons.Base.Gps,
    Source.Icons.Base.HandPointed,
    Source.Icons.Base.HeadphonesFilled,
    Source.Icons.Base.HeadphonesOutlined,
    Source.Icons.Base.HeadphonesRoundFilled,
    Source.Icons.Base.HeadphonesRoundOutlined,
    Source.Icons.Base.HomeHouseFilled,
    Source.Icons.Base.HomeHouseOutlined,
    Source.Icons.Base.HomeSquareFilled,
    Source.Icons.Base.HomeSquareOutlined,
    Source.Icons.Base.HouseCross,
    Source.Icons.Base.HousePlus,
    Source.Icons.Base.HouseSetting,
    Source.Icons.Base.Indent,
    Source.Icons.Base.InfoRound,
    Source.Icons.Base.Ingredient1,
    Source.Icons.Base.Ingredient2,
    Source.Icons.Base.Ingredient3,
    Source.Icons.Base.KnifeAndFork,
    Source.Icons.Base.LinkedIn,
    Source.Icons.Base.List,
    Source.Icons.Base.LocationMarker,
    Source.Icons.Base.MagnifyingGlass,
    Source.Icons.Base.MagnifyingGlassMinus,
    Source.Icons.Base.MagnifyingGlassPlus,
    Source.Icons.Base.MagnifyingGlassSadFace,
    Source.Icons.Base.MealTypes,
    Source.Icons.Base.MediaControlsBack,
    Source.Icons.Base.MediaControlsForward,
    Source.Icons.Base.MediaControlsPause,
    Source.Icons.Base.MediaControlsPlay,
    Source.Icons.Base.MediaControlsStop,
    Source.Icons.Base.Menu,
    Source.Icons.Base.Message,
    Source.Icons.Base.MessageRound,
    Source.Icons.Base.Minus,
    Source.Icons.Base.Moon,
    Source.Icons.Base.Newsletter,
    Source.Icons.Base.NewsletterOutlined,
    Source.Icons.Base.NewspaperArchive,
    Source.Icons.Base.NoteFilled,
    Source.Icons.Base.NoteOutlined,
    Source.Icons.Base.NotificationsOff,
    Source.Icons.Base.NotificationsOffRound,
    Source.Icons.Base.NotificationsOn,
    Source.Icons.Base.NotificationsOnRound,
    Source.Icons.Base.Padlock,
    Source.Icons.Base.PadlockLocked,
    Source.Icons.Base.PadlockUnlocked,
    Source.Icons.Base.PartyOfThree,
    Source.Icons.Base.PartyPopperFilled,
    Source.Icons.Base.PartyPopperOutlined,
    Source.Icons.Base.PayPalBrand,
    Source.Icons.Base.Person,
    Source.Icons.Base.PersonCross,
    Source.Icons.Base.PersonPlus,
    Source.Icons.Base.PersonRoundFilled,
    Source.Icons.Base.PersonRoundOutlined,
    Source.Icons.Base.PersonTick,
    Source.Icons.Base.Phone,
    Source.Icons.Base.Pinned,
    Source.Icons.Base.Pinterest,
    Source.Icons.Base.Plus,
    Source.Icons.Base.PlusOnRound,
    Source.Icons.Base.Quote,
    Source.Icons.Base.Reload,
    Source.Icons.Base.Settings,
    Source.Icons.Base.ShareApp,
    Source.Icons.Base.ShareAppSmall,
    Source.Icons.Base.ShareCallout,
    Source.Icons.Base.ShareRoundFilled,
    Source.Icons.Base.ShareRoundOutline,
    Source.Icons.Base.ShareWeb,
    Source.Icons.Base.ShoppingBasket,
    Source.Icons.Base.ShoppingList,
    Source.Icons.Base.SignalBrand,
    Source.Icons.Base.Sort,
    Source.Icons.Base.SpeechBubble,
    Source.Icons.Base.SpeechBubbleCross,
    Source.Icons.Base.SpeechBubblePlus,
    Source.Icons.Base.Star,
    Source.Icons.Base.StarOutline,
    Source.Icons.Base.TelegramBrand,
    Source.Icons.Base.TextLarge,
    Source.Icons.Base.TextSize,
    Source.Icons.Base.TextSizeRoundFilled,
    Source.Icons.Base.TextSizeRoundOutline,
    Source.Icons.Base.TextSmall,
    Source.Icons.Base.TickRound,
    Source.Icons.Base.Timer,
    Source.Icons.Base.TransparentArrowLeftStraightRound,
    Source.Icons.Base.Twitter,
    Source.Icons.Base.Upload,
    Source.Icons.Base.Video,
    Source.Icons.Base.WhatsApp,
    Source.Icons.Base.WhatsAppBrand,
    Source.Icons.Base.WhiteArrowLeftStraightRound,
    Source.Icons.Base.Trophy,
    Source.Icons.Base.GuessPuzzles,
)

@Composable
internal fun IconsPreview(
    onBackPress: () -> Unit,
    modifier: Modifier = Modifier,
) {
    PreviewScaffold(
        "Icons",
        modifier = modifier,
        onBackPress = onBackPress,
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(getGridCount()),
            modifier = it,
        ) {
            items(icons) { icon ->
                Row(
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = AppColour(Source.Palette.Brand400, Source.Palette.Neutral97).current,
                        modifier = Modifier.height(24.dp),
                    )
                    Text(
                        text = icon.name,
                        style = Source.Typography.TextSans15,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                    )
                }
            }
        }
    }
}

@Preview(device = "spec:width=2160px,height=8340px,dpi=440")
@Composable
private fun Preview() {
    AppColourMode {
        IconsPreview({})
    }
}