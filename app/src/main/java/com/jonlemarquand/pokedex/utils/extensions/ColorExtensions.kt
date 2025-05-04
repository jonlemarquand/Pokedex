package utils.extensions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

fun Color.toLong(): Long = toArgb().toLong()

// Extension function to convert a Long value back to a Color
fun Long.toColor(): Color = Color(toInt())  // Convert Long back to Int, then to Color