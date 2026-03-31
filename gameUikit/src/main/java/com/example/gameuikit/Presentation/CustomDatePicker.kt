package com.example.gameuikit.Presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gameuikit.R

//31.03.2026
//Алексей
//метод для отображения выбоа даты. Принимает модификатор, название, значение, метод клика на элемент
@Composable
fun CustomDatePicker(
    modifier: Modifier = Modifier,
    title: String,
    value: String,
    onCLick: () -> Unit
) {
    Column(modifier = modifier
        .clickable{
            onCLick()
        }) {
        Text(text = title,
            style = Theme.typography.caption2Regular,
            color = Color(0xFFFA5075),
            fontSize = 8.sp)
        Row(modifier = Modifier
            .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Text(text = value,
                style = Theme.typography.caption2Regular,
                fontSize = 12.sp,
                color = Color.Black)
            Icon(painter = painterResource(R.drawable.dropdown_icon),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier
                    .padding(start = 16.dp))
        }
    }
}