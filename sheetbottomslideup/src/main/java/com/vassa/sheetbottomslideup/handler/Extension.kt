package com.vassa.sheetbottomslideup.handler

import android.content.Context
import android.util.DisplayMetrics
import android.view.View

/**
 * @Created by Vassa
 * Date: 6/11/2021
 * Time: 8:55 AM
 */

fun Float?.orZero() = this ?: 0f

fun Int?.orZero() = this ?: 0

fun View?.visible() {
    this?.visibility = View.VISIBLE
}

fun View?.gone() {
    this?.visibility = View.GONE
}

fun View?.invisible() {
    this?.visibility = View.GONE
}

fun Int.toDp(context: Context): Int {
    val metrics: DisplayMetrics = context.resources.displayMetrics
    return (this / (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)).toInt()
}

fun Int.toPx(context: Context): Int {
    val metrics = context.resources.displayMetrics
    return (this * (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)).toInt()
}