package EstruturaCondicional

fun main(){
    print("Digite um número de 1 a 12 para representar o mês: ")
    val mes = readln().toInt()

    val name = when (mes){
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês inválido"
    }

    println(name)
}