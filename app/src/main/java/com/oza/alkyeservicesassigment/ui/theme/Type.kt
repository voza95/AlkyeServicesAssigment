package com.oza.alkyeservicesassigment.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.oza.alkyeservicesassigment.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val strawfordFontFamily = FontFamily(
    Font(R.font.strawford_black, FontWeight.Black),
    Font(R.font.strawford_bold, FontWeight.Bold),
    Font(R.font.strawford_extralight, FontWeight.ExtraLight),
    Font(R.font.strawford_light, FontWeight.Light),
    Font(R.font.strawford_medium, FontWeight.Medium),
    Font(R.font.strawford_regular, FontWeight.Normal),
    Font(R.font.strawford_thin, FontWeight.Thin)
)

val scillaFontFamily = FontFamily(
    Font(R.font.scilla_regular, FontWeight.Normal),
    Font(R.font.scilla_regular_italic, FontWeight.Thin),
    Font(R.font.scillanarrow_regular, FontWeight.ExtraBold),
    Font(R.font.scillanarrow_regular_italic, FontWeight.ExtraLight)
)