package Variaveis

fun main(){
    print("Digite seu nome: ")
    val name = readln()
    print(name)

    print("Digite um número: ")
    val a = readln().toDouble()
    print("Digite outro número: ")
    val b = readln().toDouble()
    val result = a + b
    print(result)
}