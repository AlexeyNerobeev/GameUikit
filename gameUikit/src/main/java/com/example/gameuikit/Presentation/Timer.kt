package com.example.gameuikit.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//31.03.2026
//Алексей
//метод отображения таймера. Принимает модификатор, минуты, секунды,
@Composable
fun Timer(
    modifier: Modifier = Modifier,
    minutes: Int,
    seconds: Int
) {
    Box(
        modifier = modifier
            .heightIn(100.dp)
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFF6480),
                        Color(0xFFF22E63)
                    )
                ),
                shape = RoundedCornerShape(10.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(top = 7.dp)
                .padding(bottom = 16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Timer",
                style = Theme.typography.caption2Regular,
                color = Color.White
            )
            Text(
                text = if (minutes < 10) {
                    "0$minutes:"
                } else{
                    "$minutes:"
                } + if(seconds < 10){
                    "0$seconds"
                } else{
                    seconds.toString()
                },
                style = Theme.typography.caption2Bold,
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 14.dp)
            )
        }
    }
}