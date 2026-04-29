package EstruturaCondicional

fun main(){
    print("Digite um valor juntado no ano: ")
    val saldo = readln().toDouble()

    val mensagem = when {      //'when' sem argumento
        saldo >= 10000 ->
            "Parábens! Você pode fazer uma viagem internacional."
        saldo >= 3000 ->
            "Parábens! Voê pode fazer uma viagem nacional."
        else ->
            "Fique em casa! curta bons filmes nas férias."
    }

    println(mensagem)       //um único println
    println("fim")
}