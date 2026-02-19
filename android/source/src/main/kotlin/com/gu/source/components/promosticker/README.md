# Promo stickers

The Promo Sticker is a visual indicator used to signal new products, limited time offers, best value
and recommended products. It appears on the outside top edge of product cards, but can also sit 
within text or within cards or beside text in certain use cases. 

It is a minimal yet effective way to draw user attention to new or recommended products without 
disrupting the interface.

| Light|Dark|
|---|---|
|![Light](https://github.com/user-attachments/assets/aa4f42e9-6c3e-4372-bbf7-c4cfc6bc364a)|![Dark](https://github.com/user-attachments/assets/2cb1b459-2338-4d19-89a3-5a274bf19799)|

### Details

Source designs & documentation in [Figma][1].

* Two sizes - `Small` and `Large`.
* 4 styles - `Info`, `Success`, `Error` and `Lifestyle`.
* Long text is truncated with an ellipsis.
* They are non-interactive elements so do not support click events, selected states, or multi-select 
   modes.

### Usage

The `PromoSticker` component implements the sticker design. See full [API documentation here][2].

Small sticker with `Info` style:
```kotlin
PromoSticker(
    text = "New",
    size = PromoStickerSize.Small,
    style = PromoStickerStyle.Info,
)
```

A large sticker with `Error` style:
```kotlin
PromoSticker(
    text = "New",
    size = PromoStickerSize.Large,
    style = PromoStickerStyle.Error,
)
```

[1]: https://www.figma.com/design/kSmjgtoTWiG8N7HXxFoGEE/%E2%97%90-Apps-library?node-id=15923-9318&t=ZvV0tz2sai766MUo-11
[2]: https://guardian.github.io/source-apps/android/docs/-source%20for%20-android/com.gu.source.components.promosticker/-promo-sticker.html