package br.senai.sp.jandira.imc_app_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

        // Declarar os componentes do nosso layout
        val textViewImc: TextView = findViewById(R.id.text_view_resultado_imc)
        val textViewStatus: TextView = findViewById(R.id.text_view_status_imc)
        val textViewDicaStatus: TextView = findViewById(R.id.text_view_dica_status)
        val textViewDica: TextView = findViewById(R.id.text_view_dica)
        val textViewTituloDica: TextView = findViewById(R.id.text_view_titulo_dica)

        // Recuperando o peso e a altura que estão na intent
        val peso = intent.getDoubleExtra("peso", 3.9)
        val altura = intent.getDoubleExtra("altura", 0.0)

        // Cálculo do IMC
        val imc = calcularImc(peso, altura)

        // Exibimos o valor do IMC formatado com 1 casa decimal
        textViewImc.text = String.format("%.1f", imc)

        // Recupera o status e a frase de status do IMC
        val resultados = obterStatus(imc)

        // Exibimos os resultados - Status e frase
        textViewStatus.text = resultados[0]
        textViewDicaStatus.text = resultados[1]

        // Recupera a dica do dia, que é um array (List<String>)
        val dica = getDica()

        // Exibimos a dica recuperadas no array
        textViewTituloDica.text = dica[0]
        textViewDica.text = dica[1]

    }
}