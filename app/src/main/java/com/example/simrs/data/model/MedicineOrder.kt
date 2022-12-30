package com.example.simrs.data.model

data class MedicineOrder(
    val orderNumber: Int,
    val supplierId: Int,
    val supplierName: String,
    val date: String,
    val officer: String,
    val orderList: List<OrderItem>,
    val amountOrderItems: Int,
    val ppn: Float,
    val total: Float,
)

data class OrderItem(
    val medicineId: Int,
    val amount: Int,
)
