package EstruturaCondicional

fun main(){
    print("Digite o valor juntado no ano: ")
    val saldo = readln().toDouble()

    if (saldo >= 10000){
        println("Parábens! Você pode fazer uma viagem internacional.")
    } else if (saldo >= 3000){
        println("Parábens! Você pode fazer uma viagem nacional.")
    } else {
        println("Fique em casa! Curta bons filmes nas férias.")
    }

    println("fim")
}