package Funções

import kotlin.math.sqrt
import kotlin.random.Random
import kotlin.random.nextInt

fun main(){
     val resultado = sqrt(16.0)
     println(resultado)           //4.0

    val numero = Random.nextInt(1, 10)   // Número aleatório entre 1 e 9
    println(numero)

    val lista = listOf("A", "B", "C")
    println(lista.random())            //pega um item aleatório da lista
}