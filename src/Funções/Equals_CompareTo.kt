package Funções

fun main(){
    val a = "Kotlin"
    val b = "Kotlin"
    println(a.equals(b))   //true
    println(a == b)        // true (em Kotlin, "==" já chama equals por baixo)

    val x = "apple"
    val y = "banana"
    println(x.compareTo(y))    //retorna negativo porque "apple" vem antes de "banana"
}

//Negativo -> a primeira string vem antes da segunda.
//Zero -> as duas strings são iguais.
//Positivo -> a primeira string vem depois da segunda.