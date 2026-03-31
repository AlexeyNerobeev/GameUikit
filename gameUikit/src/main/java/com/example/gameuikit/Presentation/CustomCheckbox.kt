package com.example.gameuikit.Presentation

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gameuikit.R

//31.03.2026
//Алексей
//метод для отображения Pagination. Принимает модификатор, флаг отображения галочки, метод изменения состояния
@Composable
fun CustomCheckbox(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: () -> Unit
) {
    Box(
        modifier = modifier
            .size(14.dp)
            .border(1.dp,
                color = Color(0xFFFA5075),
                shape = RoundedCornerShape(2.dp)
            )
            .clickable{
                onCheckedChange()
            },
        contentAlignment = Alignment.Center
    ){
        if(checked){
            Icon(painter = painterResource(R.drawable.checkmark_icon),
                contentDescription = null,
                tint = Color.Unspecified)
        }
    }
}