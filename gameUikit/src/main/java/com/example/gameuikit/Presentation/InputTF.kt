package com.example.gameuikit.Presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameuikit.R

//31.03.2026
//Алексей
//метод отображения инпута. Принимает модификатор, значение, метод изменения значения
//флаг отображения пароля, плейсхолдер
@Composable
fun InputTF(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    withTrailingIcon: Boolean,
    placeholder: String
) {
    val visualTransformation = remember { mutableStateOf(true) }
    BasicTextField(
        value = value,
        modifier = modifier,
        onValueChange = {
            onValueChange(it)
            Log.i("input", it)
        },
        visualTransformation = if(withTrailingIcon && visualTransformation.value){
            PasswordVisualTransformation()
        } else{
            VisualTransformation.None
        },
        decorationBox = { innerTextFiled ->
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        if (value.isEmpty()) {
                            Text(
                                text = placeholder,
                                style = Theme.typography.caption2Regular,
                                color = Color.Black
                            )
                        }
                        innerTextFiled()
                    }

                    if (withTrailingIcon) {
                        Icon(
                            painterResource(R.drawable.visible_icon),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier
                                .padding(end = 6.dp)
                                .clickable {
                                    visualTransformation.value = !visualTransformation.value
                                })
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .height(1.dp)
                        .fillMaxWidth()
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    Color(0xFFFF6480),
                                    Color(0xFFF22E63)
                                )
                            )
                        )
                )
            }
        }
    )
}

@Preview
@Composable
fun jsklgd(){
    InputTF(
        value = "ваывав",
        onValueChange = {},
        withTrailingIcon = true,
        placeholder = "placeholder"
    )
}