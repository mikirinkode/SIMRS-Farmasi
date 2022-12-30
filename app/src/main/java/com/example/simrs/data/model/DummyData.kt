package com.example.simrs.data.model

object DummyData {
    fun getDummyIndustries(): List<Industry> = listOf(
        Industry(10001, "Kimia Farma", "JL. Serayu Wetan", "Semarang", "082356278162"),
        Industry(10002, "Sanbe Farma", "JL. Serayu Wetan", "Semarang", "082356278162"),
        Industry(10003, "Graha Farma", "JL. Serayu Wetan", "Semarang", "082356278162"),
        Industry(10004, "Capri Farma", "JL. Serayu Wetan", "Semarang", "082356278162"),
        Industry(10005, "PT. Borneo Medika", "JL. Serayu Wetan", "Semarang", "082356278162"),
        Industry(10006, "PT", "JL. Serayu Wetan", "Semarang", "082356278162"),
        Industry(10007, "Kimia Farma", "JL. Serayu Wetan", "Semarang", "082356278162"),
    )

    fun getDummySuppliers(): List<Supplier> = listOf(
        Supplier(1111, "Supplier 1", "Alamat 1", "Kota 1", "1111", "Bank 1", "B1"),
        Supplier(2222, "Supplier 2", "Alamat 2", "Kota 2", "2222", "Bank 2", "B2"),
        Supplier(3333, "Supplier 3", "Alamat 3", "Kota 3", "3333", "Bank 3", "B3"),
        Supplier(4444, "Supplier 4", "Alamat 4", "Kota 4", "4444", "Bank 4", "B4"),
        Supplier(5555, "Supplier 5", "Alamat 5", "Kota 5", "5555", "Bank 5", "B5"),
        Supplier(6666, "Supplier 6", "Alamat 6", "Kota 6", "6666", "Bank 6", "B6"),
        Supplier(7777, "Supplier 7", "Alamat 7", "Kota 7", "7777", "Bank 7", "B7"),
    )

    fun getDummyMedicines(): List<Medicine> = listOf(
        Medicine(
            101,
            "Amoxicilin",
            "Type 1",
            "Category 1",
            "Kandungan 1",
            "Satuan 1",
            1,
            "1 - 11 - 2022",
            10000f,
            1000f,
            "Keterangan 1",
            10001,
            1111
        ),
        Medicine(
            202,
            "Aminofillin",
            "Type 2",
            "Category 2",
            "Kandungan 2",
            "Satuan 2",
            2,
            "2 - 12 - 2022",
            20000f,
            2000f,
            "Keterangan 2",
            10002,
            2222
        ),
        Medicine(
            303,
            "Asam Glikolat",
            "Type 3",
            "Category 3",
            "Kandungan 3",
            "Satuan 3",
            3,
            "23 - 3 - 2022",
            30000f,
            3000f,
            "Keterangan 3",
            10003,
            3333
        ),
        Medicine(
            404,
            "Domperidone",
            "Type 4",
            "Category 4",
            "Kandungan 4",
            "Satuan 4",
            4,
            "24 - 4 - 2022",
            40000f,
            4000f,
            "Keterangan 4",
            10004,
            4444
        ),
        Medicine(
            505,
            "Duloxetine",
            "Type 5",
            "Category 5",
            "Kandungan 5",
            "Satuan 5",
            5,
            "15 - 5 - 2022",
            50000f,
            5000f,
            "Keterangan 5",
            10005,
            5555
        ),
        Medicine(
            606,
            "Methadone",
            "Type 5",
            "Category 5",
            "Kandungan 5",
            "Satuan 5",
            5,
            "15 - 5 - 2022",
            50000f,
            5000f,
            "Keterangan 5",
            10005,
            5555
        ),
        Medicine(
            707,
            "Miconazole",
            "Type 5",
            "Category 5",
            "Kandungan 5",
            "Satuan 5",
            5,
            "15 - 5 - 2022",
            50000f,
            5000f,
            "Keterangan 5",
            10005,
            5555
        ),
    )

    fun getDummyMedicalPrescription(): List<MedicalPrescription> = listOf(
        MedicalPrescription(
            1,
            1,
            1,
            listOf(MedicineItem(101, 1, "1 x 1 sehari"), MedicineItem(202, 2, "2 x 2 sehari")),
            3
        ),
        MedicalPrescription(
            2,
            2,
            2,
            listOf(MedicineItem(303, 3, "3 x 3 sehari"), MedicineItem(202, 2, "2 x 2 sehari")),
            5
        ),
    )

    fun getDummyMedicineOrder(): List<MedicineOrder> = listOf(
        MedicineOrder(
            1, 1111, "6 - 1 - 2022", "Ahmad", listOf(
                OrderItem(101, 1),
                OrderItem(202, 2),
                OrderItem(303, 3),
            ),
            6, 0f, 140000f
        ),
    )

    fun getDummyMedicineDistribution(): List<MedicineDistribution> = listOf(
        MedicineDistribution(
            1001, "27 - 5 - 2020", "Faisal", listOf(DistributionItem(101, 1)), "Apotek", "Gudang"
        ),
        MedicineDistribution(
            1002, "28 - 5 - 2020", "Faisal", listOf(DistributionItem(101, 1)), "Apotek", "Gudang"
        ),
        MedicineDistribution(
            1004, "29 - 5 - 2020", "Faisal", listOf(DistributionItem(101, 1)), "Apotek", "Gudang"
        ),
    )

    fun getDummySalesTransaction(): List<SalesTransaction> = listOf(
        SalesTransaction(
            1101, "22 - 2 - 2021", listOf(
                SalesItem(101, 1, "1x1 Sehari"),
                SalesItem(202, 1, "2x2 Sehari"),
            ),
            2, 30000f
        )
    )
}