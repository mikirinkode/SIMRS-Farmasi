package com.example.simrs.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simrs.R
import com.example.simrs.ui.theme.Pink
import com.example.simrs.ui.theme.SIMRSTheme

@Composable
fun MenuScreen(
    navigateToFeatureScreen: () -> Unit,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    val menus = listOf(
        "Industri Farmasi",
        "Kelola Supplier",
        "Data Obat",
        "Stok Obat",
        "Penerimaan Obat",
        "Permintaan Distribusi Obat",
        "Resep Obat",
        "Permintaan Obat Ke Supplier",
        "Penjualan Obat Bebas",
        "Laporan Farmasi",
    )
    LazyColumn(
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "Menu", color = MaterialTheme.colors.primary, fontSize = 16.sp)
                IconButton(onClick = navigateBack) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close),
                        contentDescription = "Close Button",
                        tint = MaterialTheme.colors.primary,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
        items(menus) { menu ->
            TextButton(
                onClick = navigateToFeatureScreen,
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
            ) {
                Text(
                    text = menu,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Left,
                    color = MaterialTheme.colors.onSurface,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuScreenPreview() {
    SIMRSTheme {
        MenuScreen({}, {})
    }
}