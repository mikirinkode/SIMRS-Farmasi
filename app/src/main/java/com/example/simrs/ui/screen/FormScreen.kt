package com.example.simrs.ui.screen.industry

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simrs.R
import com.example.simrs.ui.components.GradientButton
import com.example.simrs.ui.screen.Feature
import com.example.simrs.ui.screen.supplier.SupplierForm
import com.example.simrs.ui.theme.BlueGradient
import com.example.simrs.ui.theme.PrimaryGradient
import com.example.simrs.ui.theme.SIMRSTheme
import com.example.simrs.ui.theme.SecondaryGradient

@Composable
fun FormScreen(
    feature: String,
    navigateBack: () -> Unit,
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
        Box(
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(0f to Color.Black, 1000f to Color.Black),
                    alpha = 0.5f,
                    shape = RoundedCornerShape(
                        bottomStart = 69.dp,
                        bottomEnd = 69.dp
                    ),
                )
                .fillMaxWidth()
                .height(300.dp)
        )
        Card(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Center),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .background(brush = PrimaryGradient)
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Silahkan isi form data baru", color = Color.White)
                    IconButton(onClick = navigateBack) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close),
                            contentDescription = "Close Button",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentPadding = PaddingValues(24.dp)
                ) {
                    item {
                        when (feature) {
                            Feature.INDUSTRI_FARMASI -> {
                                IndustryForm()
                            }
                            Feature.SUPPLIER -> {
                                SupplierForm()
                            }
                            Feature.OBAT -> {
                            }
                            Feature.STOK_OBAT -> {
                            }
                            Feature.PENERIMAAN_OBAT -> {
                            }
                            Feature.DISTRIBUSI_OBAT -> {
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
                        Spacer(modifier = Modifier.height(32.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(24.dp)
                        ) {
                            GradientButton(
                                onClick = { /*TODO*/ },
                                backgroundColor = PrimaryGradient,
                                text = "Simpan",
                                modifier = modifier.wrapContentSize()
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            GradientButton(
                                onClick = {/*TODO*/ },
                                backgroundColor = BlueGradient,
                                text = "Batal",
                                modifier = modifier.wrapContentSize()
                            )
                        }
                    }
                }

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FormPreview() {
    SIMRSTheme {
        FormScreen("", {})
    }
}