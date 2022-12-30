package com.example.simrs.ui.screen

import androidx.annotation.DrawableRes
import com.example.simrs.R

data class MenuItem(
    val title: String,
    val route: String,
    @DrawableRes val icon: Int,
)

val menus = listOf(
    MenuItem("Industri Farmasi", Feature.INDUSTRI_FARMASI, R.drawable.home),
    MenuItem("Kelola Supplier", Feature.SUPPLIER,R.drawable.home),
    MenuItem("Data Obat", Feature.OBAT,R.drawable.home),
    MenuItem("Stok Obat", Feature.STOK_OBAT,R.drawable.home),
//    MenuItem("Penerimaan Obat", Feature.PENERIMAAN_OBAT,R.drawable.home),
    MenuItem("Distribusi Obat", Feature.DISTRIBUSI_OBAT,R.drawable.home),
    MenuItem("Resep Obat", Feature.RESEP_OBAT,R.drawable.home),
    MenuItem("Pemesanan Obat", Feature.PEMESANAN_OBAT,R.drawable.home),
    MenuItem("Penjualan Obat", Feature.PENJUALAN_OBAT,R.drawable.home),
//    MenuItem("Laporan Farmasi", Feature.LAPORAN_FARMASI,R.drawable.home),
)

object Feature{
    const val INDUSTRI_FARMASI = "IndustriFarmasi"
    const val SUPPLIER = "Supplier"
    const val OBAT = "Obat"
    const val STOK_OBAT = "StokObat"
    const val PENERIMAAN_OBAT = "PenerimaanObat"
    const val DISTRIBUSI_OBAT = "DistribusiObat"
    const val RESEP_OBAT = "ResepObat"
    const val PEMESANAN_OBAT = "PemesananObat"
    const val PENJUALAN_OBAT = "PenjualanObat"
    const val LAPORAN_FARMASI = "LaporanFarmasi"
}