package com.example.gameuikit.Presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gameuikit.R

//31.03.2026
//Алексей
//метод для отображения нижней навигации. Принимает модификатор, методы для клика на на кнопки
@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    onStatisticsClick: () -> Unit,
    onDiscoverClick: () -> Unit,
    onChatClick: () -> Unit,
    onProfileClick: () -> Unit,
    onScheduleClick: () -> Unit,
    currentScreen: Int
) {
    val row1 = listOf(
        BottomRowData(
            icon = R.drawable.statistics_icon,
            text = "Statistics",
            click = onStatisticsClick,
            currentScreen = 1
        ),
        BottomRowData(
            icon = R.drawable.location_icon,
            text = "Discover",
            click = onDiscoverClick,
            currentScreen = 2
        )
    )
    val row2 = listOf(
        BottomRowData(
            icon = R.drawable.chat_icon,
            text = "Chat",
            click = onChatClick,
            currentScreen = 3
        ),
        BottomRowData(
            icon = R.drawable.profile_icon,
            text = "Profile",
            click = onProfileClick,
            currentScreen = 4
        )
    )
    Box(modifier = modifier
        .height(120.dp)
        .fillMaxWidth()) {
        Image(
            painter = painterResource(R.drawable.bottombar_container),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter)
        )
        Row(
            modifier = Modifier
                .padding(bottom = 29.dp)
                .padding(top = 45.dp)
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                row1.forEach {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clickable {
                                    if(currentScreen != it.currentScreen) {
                                        it.click
                                    }
                                }) {
                            Icon(
                                painter = painterResource(it.icon),
                                contentDescription = null,
                                tint = Color.White
                            )
                            Text(
                                text = it.text,
                                style = Theme.typography.caption2Regular,
                                fontSize = 10.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(top = 4.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier
                    .width(56.dp))
                row2.forEach {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .clickable {
                                    if(currentScreen != it.currentScreen) {
                                        it.click
                                    }
                                }) {
                            Icon(
                                painter = painterResource(it.icon),
                                contentDescription = null,
                                tint = Color.White
                            )
                            Text(
                                text = it.text,
                                style = Theme.typography.caption2Regular,
                                fontSize = 10.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(top = 4.dp)
                            )
                        }
                    }
                }
            }
        }
        Box(modifier = Modifier
            .align(Alignment.TopCenter)
            .padding(top = 15.dp)
            .border(5.dp,
                color = Color.White,
                shape = CircleShape
            )
            .size(56.dp)
            .clickable{
                onScheduleClick()
            },
            contentAlignment = Alignment.Center){
            Icon(painter = painterResource(R.drawable.schedule_icon),
                contentDescription = null,
                tint = Color.White)
        }
    }
}

//класс данных для row из иконок
data class BottomRowData(
    val icon: Int,
    val text: String,
    val click: () -> Unit,
    val currentScreen: Int
)