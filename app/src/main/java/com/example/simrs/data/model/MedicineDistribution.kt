package com.example.simrs.data.model

data class MedicineDistribution(
    val distributionNumber: Int,
    val date: String,
    val officer: String,
    val distributionItemList: List<DistributionItem>,
    val destinationUnit: String,
    val originUnit: String
)

data class DistributionItem(
    val medicineId: Int,
    val amount: Int,
)