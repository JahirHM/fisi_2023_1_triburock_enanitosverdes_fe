package com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.qr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.R
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.yape.YapeActivity

class QrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr)
        supportActionBar?.hide()
        val btnYape: Button = findViewById(R.id.btnYape)
        btnYape.setOnClickListener {
            val intent = Intent(this, YapeActivity::class.java)
            startActivity(intent)
        }
    }
}