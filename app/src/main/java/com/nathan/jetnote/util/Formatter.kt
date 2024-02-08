package com.nathan.jetnote.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun formatDate(date: Date): String {
    val format = SimpleDateFormat("EEE, d MMM hh:mm aaa",
        Locale.getDefault())
    return format.format(date)
}