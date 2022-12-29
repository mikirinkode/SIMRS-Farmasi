package com.example.simrs.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simrs.ui.theme.BlueGradient
import com.example.simrs.ui.theme.PrimaryGradient
import com.example.simrs.ui.theme.SIMRSTheme

@Composable
fun DeleteConfirmationMessage(
    onPositiveClick: () -> Unit,
    onNegativeClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(0f to Color.Black, 1000f to Color.Black),
                alpha = 0.5f
            )
    ) {
        Card(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(32.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .background(Color(0xffCADBFF), CircleShape)
                            .padding(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.QuestionMark,
                            contentDescription = "Question Icon",
                            tint = Color.White,
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = "Apakah anda yakin ingin menghapus data?")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    GradientButton(
                        onClick = onPositiveClick,
                        backgroundColor = PrimaryGradient,
                        text = "Oke",
                        modifier = modifier.wrapContentSize()
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    GradientButton(
                        onClick = onNegativeClick,
                        backgroundColor = BlueGradient,
                        text = "Batal",
                        modifier = modifier.wrapContentSize()
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DeleteMessagePreview() {
    SIMRSTheme() {
        DeleteConfirmationMessage(onPositiveClick = { /*TODO*/ }, onNegativeClick = { /*TODO*/ })
    }
}