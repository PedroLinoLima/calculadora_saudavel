package br.senai.sp.jandira.imc_app_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ** Clique no card IMC
        val cardImc = findViewById<CardView>(R.id.card_imc)
        val cardNcd: CardView = findViewById(R.id.card_ncd)

        cardImc.setOnClickListener {
            val abrirImcActivity = Intent(this, ImcActivity::class.java)
            startActivity(abrirImcActivity)
        }

        cardNcd.setOnClickListener {
            val abrirNcdActivity = Intent(this, NcdActivity::class.java)
            startActivity(abrirNcdActivity)
        }

    }
}