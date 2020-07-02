package com.parasde.example.utils

import java.text.SimpleDateFormat
import java.util.*

object DateUtil {
    private val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA)
    fun now(): String {
        return formatter.format(Date())
    }
}