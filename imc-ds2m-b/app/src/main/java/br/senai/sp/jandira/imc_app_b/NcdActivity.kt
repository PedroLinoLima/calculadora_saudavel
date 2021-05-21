package br.senai.sp.jandira.imc_app_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val buttonCalcular: Button = findViewById(R.id.button_calcular_ncd)
        val editTextPeso: EditText = findViewById(R.id.edit_text_peso)
        val editTextIdade: EditText = findViewById(R.id.edit_text_idade)
        val radioButton: RadioGroup = findViewById(R.id.radio_group_sexo)
        val spinner: Spinner = findViewById(R.id.spinner_tipo_exercicio)

        buttonCalcular.setOnClickListener{

            if (editTextPeso.text.isEmpty()) {
                editTextPeso.error = "Você não me disse o seu peso!"
            } else if (editTextIdade.text.isEmpty()){
                editTextIdade.error = "Você não me disse a sua idade!"
            } else {
                val intent = Intent(this, ResultadoImcActivity::class.java)

                intent.putExtra("peso", editTextPeso.text.toString().toDouble())
                intent.putExtra("idade", editTextIdade.text.toString().toDouble())

                startActivity(intent)
            }


        }

    }
}