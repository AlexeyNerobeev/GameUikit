package com.example.gameuikit.Presentation

import androidx.compose.foundation.clickable
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.gameuikit.R

//31.03.2026
//Алексей
//метод для отображения кнопки выхода. Принимает модификатор, метод клика
@Composable
fun LogoutButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Icon(painter = painterResource(R.drawable.logout_button),
        contentDescription = null,
        tint = Color.Unspecified,
        modifier = modifier
            .clickable{
                onClick()
            }
    )
}