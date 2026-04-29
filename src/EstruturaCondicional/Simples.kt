package EstruturaCondicional

fun main(){
    print("Digite o valor juntado no ano: ")
    val saldo = readln().toDouble()

    if (saldo >= 10000) {
        println("Parábens! Você pode fazer uma viagem internacional.")
    }

    println("fim")
}