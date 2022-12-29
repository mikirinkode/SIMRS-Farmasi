package com.example.simrs.data.model

data class Medicine(
    val code: Int,
    var name: String,
    var type: String,   // jenis
    var category: String,   // kategori
    var drugContent: String, // kandungan
    var unit: String,   // satuan,
    var minimumStock: Int,
    var expiredDate: String,
    var sellingPrice: Float,
    var purchasePrice: Float,
    var description: String,
    var industryCode: Int,
    var supplierCode: Int,

)
