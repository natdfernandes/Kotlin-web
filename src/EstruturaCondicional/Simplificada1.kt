package EstruturaCondicional

fun main(){
    print("Digite o valor juntado no ano: ")
    val saldo = readln().toDouble()

    val message = if (saldo >= 10000){
        "Parábens! Você pode fazer uma viagem internacional."
    } else if (saldo >= 3000){
        "Parábens! Você pode fazer uma viagem nacional."
    } else {
        "Fique em casa! Curta bons filmes nas férias. "
    }
    println(message)
}