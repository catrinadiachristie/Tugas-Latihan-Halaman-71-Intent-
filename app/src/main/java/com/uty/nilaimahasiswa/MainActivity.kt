package com.uty.nilaimahasiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NIM = findViewById<EditText>(R.id.txt_nim)
        val Nama = findViewById<EditText>(R.id.txt_nama)
        val Nilai = findViewById<EditText>(R.id.txt_nilai)

        button_proses.setOnClickListener() {
            val datanim = NIM.text.toString()
            val datanama = Nama.text.toString()
            val datanilai = Nilai.text.toString()

            val intent = Intent(this, InformasiNilaiAnda::class.java)
            intent.putExtra("NIM", datanim)
            intent.putExtra("Nama", datanama)
            intent.putExtra("Nilai", datanilai)
            if (datanilai.toInt() >= 80) {
                intent.putExtra("Keterangan", "A")
            } else if (datanilai.toInt() >= 60) {
                intent.putExtra("Keterangan", "B")
            } else if (datanilai.toInt() >= 40) {
                intent.putExtra("Keterangan", "C")
            } else if (datanilai.toInt() >= 20) {
                intent.putExtra("Keterangan", "D")
            } else {
                intent.putExtra("Keterangan", "E")
            }

            startActivity(intent)
        }
    }
}
