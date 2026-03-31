package com.example.gameuikit.Presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.gameuikit.R

//31.03.2026
//Алексей
//класс типографики
data class LibraryTypography(
    val title1Semibold: TextStyle = TextStyle(
        fontSize = 24.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_semibold
            )
        ),
        fontWeight = FontWeight(600)
    ),
    val title1ExtraBold: TextStyle = TextStyle(
        fontSize = 24.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_extrabold
            )
        ),
        fontWeight = FontWeight(800)
    ),
    val title2Regular : TextStyle = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_regular
            )
        ),
        fontWeight = FontWeight(400)
    ),
    val title2Semibold  : TextStyle = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_semibold
            )
        ),
        fontWeight = FontWeight(600)
    ),
    val title2Extrabold  : TextStyle = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_extrabold
            )
        ),
        fontWeight = FontWeight(800)
    ),
    val title3Regular: TextStyle = TextStyle(
        fontSize = 17.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_regular
            )
        ),
        fontWeight = FontWeight(400)
    ),
    val title3Medium: TextStyle = TextStyle(
        fontSize = 17.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_medium
            )
        ),
        fontWeight = FontWeight(500)
    ),
    val title3Semibold: TextStyle = TextStyle(
        fontSize = 17.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_semibold
            )
        ),
        fontWeight = FontWeight(600)
    ),
    val headlineRegular: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_regular
            )
        ),
        fontWeight = FontWeight(400)
    ),
    val headlineMedium: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_medium
            )
        ),
        fontWeight = FontWeight(500)
    ),
    val textRegular: TextStyle = TextStyle(
        fontSize = 15.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_regular
            )
        ),
        fontWeight = FontWeight(400)
    ),
    val textMedium: TextStyle = TextStyle(
        fontSize = 15.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_medium
            )
        ),
        fontWeight = FontWeight(400)
    ),
    val captionRegular: TextStyle = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_regular
            )
        ),
        fontWeight = FontWeight(400)
    ),
    val captionSemibold: TextStyle = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_semibold
            )
        ),
        fontWeight = FontWeight(600)
    ),
    val caption2Regular: TextStyle = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_regular
            )
        ),
        fontWeight = FontWeight(400)
    ),
    val caption2Bold: TextStyle = TextStyle(
        fontSize = 12.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_bold
            )
        ),
        fontWeight = FontWeight(700)
    )
)

private val LibraryTheme = staticCompositionLocalOf { LibraryTypography() }

//метод для определения темы типографики. Принимает @composable функцию
@Composable
fun AppTheme(
    content: @Composable () -> Unit
){
    CompositionLocalProvider(
        LibraryTheme provides LibraryTypography(),
        content = content
    )
}

object Theme{
    val typography: LibraryTypography
        @Composable get() = LibraryTheme.current
}