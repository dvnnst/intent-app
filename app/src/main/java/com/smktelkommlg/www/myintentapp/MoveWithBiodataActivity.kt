package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithBiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_lengkap)

        val biodata: TextView =
            findViewById(R.id.tv_lengkap_received)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val alamat = intent.getStringExtra(EXTRA_ALAMAT)
        val sch = intent.getStringExtra(EXTRA_SCH)

        val text = "Name : $name, Your Age : $age, Alamat : $alamat, Sekolah : $sch"
        biodata.text = text
    }
    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ALAMAT ="extra_alamat"
        const val EXTRA_SCH = "extra_sch"
    }
}