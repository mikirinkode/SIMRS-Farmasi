package com.example.simrs.ui.screen

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simrs.data.model.DummyData
import com.example.simrs.ui.theme.Pink
import com.example.simrs.ui.theme.SIMRSTheme
import com.example.simrs.ui.theme.SecondaryGradient

@Composable
fun FeatureScreen(
    featureName: String,
    modifier: Modifier = Modifier
) {
    var query by remember {
        mutableStateOf("")
    }

    val list = when (featureName) {
        Feature.INDUSTRI_FARMASI -> {
            DummyData.getDummyIndustries()
        }
        Feature.SUPPLIER -> {
            DummyData.getDummyIndustries()
        }
        Feature.OBAT -> {
            DummyData.getDummyIndustries()
        }
        Feature.STOK_OBAT -> {
            DummyData.getDummyIndustries()
        }
        Feature.PENERIMAAN_OBAT -> {
            DummyData.getDummyIndustries()
        }
        Feature.DISTRIBUSI_OBAT -> {
            DummyData.getDummyIndustries()
        }
        Feature.RESEP_OBAT -> {
            DummyData.getDummyIndustries()
        }
        Feature.PEMESANAN_OBAT -> {
            DummyData.getDummyIndustries()
        }
        Feature.PENJUALAN_OBAT -> {
            DummyData.getDummyIndustries()
        }
        Feature.LAPORAN_FARMASI -> {
            DummyData.getDummyIndustries()
        }
        else -> {
            listOf()
        }
    }
    Box(
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .background(
                    shape = RoundedCornerShape(
                        bottomStart = 69.dp,
                        bottomEnd = 69.dp
                    ),
                    brush = SecondaryGradient
                )
                .fillMaxWidth()
                .height(300.dp)
        )
        Column(
            modifier = modifier
                .padding(24.dp)
        ) {
            SearchBar(query = query, onValueChange = { newValue -> query = newValue })
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = featureName, fontSize = 18.sp)
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFF49BEFF),
                        contentColor = Color.White
                    )
                ) {
                    Text(text = "Input Data")
                }
            }
            LazyColumn() {
                items(list) { list ->
                    ItemCard()
                }
            }
        }
    }
}

@Composable
fun ItemCard(

) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FeatureScreenPreview() {
    SIMRSTheme() {
        FeatureScreen(featureName = "FEATURE NAME")
    }
}