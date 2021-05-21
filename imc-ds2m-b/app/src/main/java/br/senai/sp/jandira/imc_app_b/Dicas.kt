package br.senai.sp.jandira.imc_app_b

import java.util.*


fun getDica() : List<String> {

    val dicas = listOf(
        listOf("Alimente-se melhor", "Reduza alimentos com gordura, açúcar e sal. Tenha sempre frutas, verduras e legumes na alimentação diária."),
        listOf("Movimente-se", "Inicie uma atividade física. Evite escadas rolantes e elevadores e suba a pé."),
        listOf("Beba água", "Não espere ter sede para beber água. Quando você tem sede, significa que o corpo já está desidratado."),
        listOf("Durma bem", "Crie um ritual, deixe o ambiente escuro e silencioso. Quem dorme pouco e tem uma qualidade de sono ruim, tem mais chances de aumentar o peso.")
    )

    val sorteio = Random()
    val dicaDoDia = sorteio.nextInt(dicas.size)

    return dicas[dicaDoDia]

}