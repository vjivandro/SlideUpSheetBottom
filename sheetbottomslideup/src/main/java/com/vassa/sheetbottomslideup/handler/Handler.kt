package com.vassa.sheetbottomslideup.handler

/**
 * @Created by Vassa
 * Date: 6/11/2021
 * Time: 8:54 AM
 */
fun setUpColor_Alpha(percentage: Int): String {
    val decValue = percentage.toDouble() / 100 * 255
    val rawHexColor = "#000000".replace("#", "")
    val str = StringBuilder(rawHexColor)
    if (Integer.toHexString(decValue.toInt()).length == 1) str.insert(
        0,
        "#0" + Integer.toHexString(decValue.toInt())
    ) else str.insert(0, "#" + Integer.toHexString(decValue.toInt()))
    return str.toString()
}