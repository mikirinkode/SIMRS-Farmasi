package com.example.simrs.ui.screen

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simrs.ui.theme.SIMRSTheme
import com.example.simrs.R

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.background(color = Color(245, 246, 248))
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(color = Color.White)
            ) {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.TopStart)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_back),
                        contentDescription = "Back Button",
                        modifier = Modifier.size(24.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.sample_profile),
                        contentDescription = "user photo profile",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Sample User Name", textAlign = TextAlign.Center)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(231, 255, 174)),
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(16.dp)
                ) {
                    Text(text = "Logout")
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_background),
                    contentDescription = "Profile Background",
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .size(width = 147.dp, height = 427.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(48.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    ProfileTextField("Username")
                    ProfileTextField("Password Lama")
                    ProfileTextField("Password Baru")
                    ProfileTextField("Masukan Lagi")
                }
            }
        }
    }
}

@Composable
fun ProfileTextField(
    title: String
) {
    var value by remember {
        mutableStateOf("")
    }
    Column(

    ) {
        Text(text = title)
        OutlinedTextField(
            value = value,
            onValueChange = { newValue ->
                value = newValue
            },
            shape = RoundedCornerShape(16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreenPreview() {
    SIMRSTheme {
        ProfileScreen()
    }
}