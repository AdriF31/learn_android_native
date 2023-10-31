package com.example.learncompose.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextComponent(
    textValue: String,
    textSize: TextUnit,
    textColor: Color = Color.Black,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(text = textValue, fontSize = textSize, color = textColor, fontWeight = fontWeight)
}

@Preview(showBackground = true)
@Composable
fun TextComponentPreview() {
    TextComponent(textValue = "Hello everyone", textSize = 16.sp, textColor = Color.Blue)
}