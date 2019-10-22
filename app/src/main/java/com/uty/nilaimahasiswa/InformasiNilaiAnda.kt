package com.uty.nilaimahasiswa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_informasi_nilai_anda.*

class InformasiNilaiAnda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_nilai_anda)

        val intent = intent
        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getStringExtra("Nilai")
        val keterangan = intent.getStringExtra("Keterangan")

        layar2_nim.text = "Nim                : " + nim
        layar2_nama.text = "Nama             : " + nama
        layar2_nilai.text = "Nilai Angka    : " + nilai
        layar2_keterangan.text = "Keterangan   : " + keterangan
        }
    }