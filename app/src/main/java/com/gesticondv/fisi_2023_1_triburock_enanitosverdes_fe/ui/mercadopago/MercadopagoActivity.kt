package com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.ui.mercadopago

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gesticondv.fisi_2023_1_triburock_enanitosverdes_fe.R

class MercadopagoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercadopago)
        supportActionBar?.hide()
    }
}