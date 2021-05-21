package br.senai.sp.jandira.imc_app_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoNcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)

        // Declarar os componentes do nosso layout
        val textViewNcd: TextView = findViewById(R.id.text_view_resultado_ncd)
        val textViewDica: TextView = findViewById(R.id.text_view_dica)
        val textViewTituloDica: TextView = findViewById(R.id.text_view_titulo_dica)

        // Recuperando o peso, idade, sexo e o tipo de atividade que estão na intent
        val peso = intent.getIntExtra("peso", 0)
        val idade = intent.getIntExtra("idade", 0)
        val sexo = intent.getIntExtra("sexo", 0)
        val tipoAtividade = intent.getStringExtra("tipoAtividade")

        // Cálculo do NCD
        val ncd = calcularNcd(peso, idade, tipoAtividade!!, sexo)

        // Exibimos o valor do NCD formatado com 1 casa decimal
        textViewNcd.text = String.format("%.1f", ncd)

        // Recupera a dica do dia, que é um array (List<String>)
        val dica = getDica()

        // Exibimos a dica recuperadas no array
        textViewTituloDica.text = dica[0]
        textViewDica.text = dica[1]



    }
}