package com.example.myintentapp


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.smktelkommlg.www.myintentapp.R

class MainActivity : AppCompatActivity(), View.OnClickListener {


    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

        val btnBiodata : Button = findViewById(R.id.btn_my_data)
        btnBiodata.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveWithDataIntent =
                    Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "dv")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 17)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_my_data -> {
                val bbio =
                    Intent(this@MainActivity, MoveWithBiodataActivity::class.java)
                bbio.putExtra(MoveWithBiodataActivity.EXTRA_NAME, "dv")
                bbio.putExtra(MoveWithBiodataActivity.EXTRA_AGE, 17)
                bbio.putExtra(MoveWithBiodataActivity.EXTRA_ALAMAT, "malang")
                bbio.putExtra(MoveWithBiodataActivity.EXTRA_SCH, "SMK Telkom Malang")
                startActivity(bbio)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "088989896699"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }


    }
}