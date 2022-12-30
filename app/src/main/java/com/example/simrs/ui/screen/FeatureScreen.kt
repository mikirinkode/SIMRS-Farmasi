package com.example.simrs.ui.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simrs.R
import com.example.simrs.data.model.DummyData
import com.example.simrs.ui.screen.distribution.ManageDistributionScreen
import com.example.simrs.ui.screen.industry.ManageIndustryScreen
import com.example.simrs.ui.screen.medicine.ManageMedicineScreen
import com.example.simrs.ui.screen.stock.ManageStockScreen
import com.example.simrs.ui.screen.supplier.ManageSupplierScreen
import com.example.simrs.ui.theme.SIMRSTheme

@Composable
fun FeatureScreen(
    navigateToFormScreen: () -> Unit,
    navigateBack: () -> Unit,
    featureName: String,
    modifier: Modifier = Modifier
) {


//    val list = when (featureName) {
//        Feature.INDUSTRI_FARMASI -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.SUPPLIER -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.OBAT -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.STOK_OBAT -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.PENERIMAAN_OBAT -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.DISTRIBUSI_OBAT -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.RESEP_OBAT -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.PEMESANAN_OBAT -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.PENJUALAN_OBAT -> {
//            DummyData.getDummyIndustries()
//        }
//        Feature.LAPORAN_FARMASI -> {
//            DummyData.getDummyIndustries()
//        }
//        else -> {
//            listOf()
//        }
//    }


    when (featureName) {
        Feature.INDUSTRI_FARMASI -> {
            ManageIndustryScreen(
                navigateToFormScreen = navigateToFormScreen,
                navigateBack = navigateBack
            )
        }
        Feature.SUPPLIER -> {
            ManageSupplierScreen(
                navigateToFormScreen = navigateToFormScreen,
                navigateBack = navigateBack
            )
        }
        Feature.OBAT -> {
            ManageMedicineScreen(
            navigateToFormScreen = navigateToFormScreen,
            navigateBack = navigateBack
        )
        }
        Feature.STOK_OBAT -> {
            ManageStockScreen(
                navigateToFormScreen = navigateToFormScreen,
                navigateBack = navigateBack
            )
        }
        Feature.PENERIMAAN_OBAT -> {
        }
        Feature.DISTRIBUSI_OBAT -> {
            ManageDistributionScreen(
                navigateToFormScreen = navigateToFormScreen,
                navigateBack = navigateBack
            )
        }
        Feature.RESEP_OBAT -> {
        }
        Feature.PEMESANAN_OBAT -> {
        }
        Feature.PENJUALAN_OBAT -> {

        }
        Feature.LAPORAN_FARMASI -> {
        }
        else -> {
        }
    }
}

@Composable
fun ItemCard(

) {
}

@Composable
fun SearchBar(
    query: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = query,
        onValueChange = onValueChange,
        placeholder = { Text(text = "Pencarian") },
        trailingIcon = {
            Icon(
                painterResource(id = R.drawable.ic_search),
                contentDescription = "Search Icon",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        },
        shape = RoundedCornerShape(16.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = Color.Transparent,
            textColor = Color.White,
            placeholderColor = Color.LightGray
        ),
        modifier = modifier
            .fillMaxWidth()
            .border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(16.dp))
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FeatureScreenPreview() {
    SIMRSTheme() {
        FeatureScreen(featureName = "FEATURE NAME", navigateToFormScreen = {}, navigateBack = {})
    }
}