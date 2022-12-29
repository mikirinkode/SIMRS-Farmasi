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
}