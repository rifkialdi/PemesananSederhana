package com.example.latihan_ujk.db

import android.provider.BaseColumns

class DatabaseContract {
    internal class NoteColumn : BaseColumns {
        companion object {
            const val TABLE_NAME = "pesanan"
            const val _ID = "_id"
            const val NOMER_PLAT = "nomer_plat"
            const val NAMA = "nama"
            const val HARGA = "harga"
            const val WAKTU = "waktu"
        }
    }
}