package com.example.gameuikit.Presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gameuikit.R

//31.03.2026
//Алексей
//метод для отображения Pagination. Принимает модификатор, текущий прогресс
@Composable
fun CustomCard(
    modifier: Modifier = Modifier,
    title: String,
    text: String,
    onCLick: () -> Unit,
    image: Int
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(169.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFFFF6480),
                        Color(0xFFF22E63)
                    )
                ),
                shape = RoundedCornerShape(10.dp)
            )
            .clickable{
                onCLick()
            }
    ){
        Image(painter = painterResource(image),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 19.dp)
                .padding(end = 22.dp)
                .height(114.dp)
                .align(Alignment.BottomEnd),
            contentScale = ContentScale.FillHeight)
        Column(modifier = Modifier
            .padding(top = 30.dp)
            .padding(start = 24.dp)
            .fillMaxWidth(0.6f)) {
            Text(text = title,
                style = Theme.typography.caption2Bold,
                fontSize = 12.sp,
                color = Color.White)
            Text(text = text,
                style = Theme.typography.caption2Regular,
                fontSize = 10.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 14.dp),
                maxLines = 4,
                overflow = TextOverflow.Ellipsis)
        }
        Icon(painter = painterResource(R.drawable.forward_arrow),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 24.dp,
                    bottom = 24.dp))
    }
}