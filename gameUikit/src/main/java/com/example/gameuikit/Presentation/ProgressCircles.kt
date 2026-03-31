package com.example.gameuikit.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//31.03.2026
//Алексей
//метод для отображения Pagination. Принимает модификатор, текущий прогресс
@Composable
fun ProgressCircles(
    modifier: Modifier = Modifier,
    currentCircle: Int
) {
    val pagination = listOf(
        1,
        2,
        3
    )
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        pagination.forEach {
            Box(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(10.dp)
                    .background(
                        color = if (it == currentCircle) {
                            Color(0xFFFA5075)
                        } else{
                            Color.LightGray
                        },
                        shape = CircleShape
                    )
            )
        }
    }
}