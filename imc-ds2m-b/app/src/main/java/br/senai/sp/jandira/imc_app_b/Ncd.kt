package br.senai.sp.jandira.imc_app_b

fun tipoAtividade(tipoAtividade: String, sexo: Int): Double {
    var valor = 0.0
    if (sexo == 1) {
        if (tipoAtividade == "Leve") {
            valor = 1.5
        } else if (tipoAtividade == "Moderada") {
            valor = 1.8
        } else if (tipoAtividade == "Intensa") {
            valor = 2.1
        }
    } else if (sexo == 2) {
        if (tipoAtividade == "Leve") {
            valor = 1.6
        } else if (tipoAtividade == "Moderada") {
            valor = 1.6
        } else if (tipoAtividade == "Intensa") {
            valor = 1.8
        }
    }
    return valor
}

fun calcularNcd (peso: Int, idade: Int, tipoAtividade: String, sexo: Int): Double {

    var valor = tipoAtividade(tipoAtividade, sexo)
    var ncdResultado = 0.0

    if (sexo == 1) {
        if (idade > 16 && idade <= 30) {
            ncdResultado = (15.3 * peso + 679) * valor
        }else if (idade > 31 && idade <= 60) {
            ncdResultado = (11.6 * peso + 879) * valor
        }else if (idade < 61) {
            ncdResultado = (13.5 * peso + 487) * valor
        }
    }else if (sexo == 2) {
        if (idade > 18 && idade <= 30) {
            ncdResultado = (14.7 * peso + 496) * valor
        }else if (idade > 31 && idade <= 60) {
            ncdResultado = (8.7 * peso + 829) * valor
        }else if (idade > 61) {
            ncdResultado = (10.5 * peso + 596) * valor
        }
    }

    return ncdResultado

}