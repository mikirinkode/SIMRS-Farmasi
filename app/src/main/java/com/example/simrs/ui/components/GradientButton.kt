package com.example.simrs.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simrs.ui.theme.PrimaryGradient
import com.example.simrs.ui.theme.SIMRSTheme

@Composable
fun GradientButton(
    onClick: () -> Unit,
    backgroundColor: Brush,
    text: String,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onClick,
        modifier = modifier.wrapContentSize(),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
        ),
        contentPadding = PaddingValues(0.dp),
        elevation = ButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Text(
            text = text,
            modifier = Modifier
                .wrapContentSize()
                .background(
                    brush = backgroundColor,
                    shape = RoundedCornerShape(8.dp)
                )
                .align(Alignment.CenterVertically)
                .height(ButtonDefaults.MinHeight)
                .padding(horizontal = 17.dp, vertical = 7.dp),
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            color = Color.White
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GradientButtonPreview() {
    SIMRSTheme() {
        GradientButton(onClick = { /*TODO*/ }, backgroundColor = PrimaryGradient, text = "Gradient Button")
    }
}