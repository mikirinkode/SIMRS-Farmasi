package com.example.simrs.data.model

data class SalesTransaction(
    val transactionNumber: Int,
    val date: String,
    val salesItems: List<SalesItem>,
    val amountSalesItems: Int,
    val total: Float,
    val patientName: String,    //Temporary
    val patientAddress: String,  //Temporary
)
data class SalesItem(
    val medicineId: Int,
    val amount: Int,
    val howToUse: String,
)
