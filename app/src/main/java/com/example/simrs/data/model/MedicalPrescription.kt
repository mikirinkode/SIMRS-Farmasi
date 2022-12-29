package com.example.simrs.data.model

data class MedicalPrescription(
    val patientId: Int,
    val prescriptionId: Int,
    val doctorId: Int,
    val medicineList: List<MedicineItem>,
    val totalItems: Int,
)

data class MedicineItem(
    val medicineId: Int,
    val amount: Int,
    val howToUse: String,
)
