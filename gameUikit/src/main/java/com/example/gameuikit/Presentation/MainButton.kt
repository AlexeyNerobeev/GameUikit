package com.example.gameuikit.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//31.03.2026
//Алексей
//метод для отображения кноркию Принимает модификатор, текст, метод клика
@Composable
fun MainButton(
    modifier: Modifier = Modifier,
    onCLick: () -> Unit,
    text: String
) {
    Button(
        onClick = onCLick,
        modifier = modifier
            .heightIn(58.dp)
            .widthIn(210.dp)
            .clip(RoundedCornerShape(100.dp))
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFF6480),
                        Color(0xFFF22E63)
                    )
                )
            ),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        )
    ) {
        Text(text = text,
            color = Color.White,
            style = Theme.typography.caption2Bold,
            fontSize = 14.sp)
    }
}