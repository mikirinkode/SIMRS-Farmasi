package com.example.simrs.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.simrs.R

val PoppinsFamily = FontFamily(
    Font(R.font.poppins_thin, weight = FontWeight.Thin),
    Font(R.font.poppins_light, weight = FontWeight.Light),
    Font(R.font.poppins, weight = FontWeight.Normal),
    Font(R.font.poppins_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(R.font.poppins_medium, weight = FontWeight.Medium),
    Font(R.font.poppins_bold, weight = FontWeight.Bold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
//    body2 = TextStyle(
//        fontFamily = fonts,
//        fontWeight = FontWeight.Light,
//        fontSize = 16.sp
//    ),
//    h1 = TextStyle(
//        fontFamily = fonts,
//        fontWeight = FontWeight.Bold,
//        fontSize = 24.sp
//    ),
//    h2 = TextStyle(
//        fontFamily = fonts,
//        fontWeight = FontWeight.Normal,
//        fontSize = 20.sp
//    ),
//    h3 = TextStyle(
//        fontFamily = fonts,
//        fontWeight = FontWeight.Normal,
//        fontSize = 18.sp
//    ),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)