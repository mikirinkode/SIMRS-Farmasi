package com.example.simrs.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.More
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simrs.R
import com.example.simrs.ui.theme.SIMRSTheme

@Composable
fun HomeScreen(
    navigateToMenu: () -> Unit,
    navigateToFeature: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor = Brush.verticalGradient(
        0f to Color.White,
        1000f to Color(red = 204, green = 217, blue = 247)
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = backgroundColor)
    ) {
        Column() {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.simrs),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .size(width = 84.dp, height = 64.dp)
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, bottom = 16.dp, end = 16.dp)
                ) {
                    Text(
                        text = "SIMRS BISA AI",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Integrated and Modern Hospital Information System",
                        textAlign = TextAlign.Center
                    )
                }
            }

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(menus) { menu ->
                    Card(
                        modifier = Modifier
                            .padding(18.dp)
                            .fillMaxHeight()
                            .shadow(elevation = 8.dp, shape = RoundedCornerShape(16.dp))
                            .clickable {
                                navigateToFeature(menu.route)
                            },
                        shape = RoundedCornerShape(16.dp),
                        border = BorderStroke(width = 1.dp, color = Color.Gray),
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(16.dp).height(72.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painterResource(id = menu.icon),
                                contentDescription = menu.title,
                                modifier = Modifier.size(25.dp)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = menu.title,
                                textAlign = TextAlign.Center,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

//@Composable
//fun RowMenuItem() {
//
//}
//
//@Composable
//fun CardMenuItem(
//    title: String,
//    icon: Int,
//) {
//    Card(
//        shape = RoundedCornerShape(16.dp),
//        modifier = Modifier
//            .padding(24.dp)
//            .shadow(elevation = 1.dp),
//        border = BorderStroke(width = 1.dp, color = Color.DarkGray),
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Icon(
//                painterResource(id = icon),
//                contentDescription = title,
//                modifier = Modifier.size(25.dp)
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Text(text = title, textAlign = TextAlign.Center)
//        }
//    }
//}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    SIMRSTheme {
        HomeScreen({}, {})
    }
}

//            LazyVerticalGrid(
//                columns = GridCells.Fixed(2),
//                modifier = Modifier.padding(8.dp)
//            ) {
//                items(menus) { menu ->
//                    Card(
//                        shape = RoundedCornerShape(16.dp),
//                        modifier = Modifier.padding(24.dp).shadow(elevation = 1.dp),
//                        border = BorderStroke(width = 1.dp, color = Color.DarkGray),
//                    ) {
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            modifier = Modifier.padding(16.dp)
//                        ) {
//                            Icon(
//                                painterResource(id = menu.icon),
//                                contentDescription = menu.title,
//                                modifier = Modifier.size(25.dp)
//                            )
//                            Spacer(modifier = Modifier.height(8.dp))
//                            Text(text = menu.title, textAlign = TextAlign.Center)
//                        }
//                    }
//                }
//            }