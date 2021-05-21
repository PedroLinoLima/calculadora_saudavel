package br.senai.sp.jandira.imc_app_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val buttonCalcular: Button = findViewById(R.id.button_calcular_imc)
        val editTextPeso: EditText = findViewById(R.id.edit_text_peso)
        val editTextAltura: EditText = findViewById(R.id.edit_text_altura)

        buttonCalcular.setOnClickListener{

            if (editTextPeso.text.isEmpty()) {
                editTextPeso.error = "Você não me disse o seu peso!"
            } else if (editTextAltura.text.isEmpty()){
                editTextAltura.error = "Você não me disse a sua altura!"
            } else {
                val intent = Intent(this, ResultadoImcActivity::class.java)

                intent.putExtra("peso", editTextPeso.text.toString().toDouble())
                intent.putExtra("altura", editTextAltura.text.toString().toDouble())

                startActivity(intent)
            }


        }

    }
}