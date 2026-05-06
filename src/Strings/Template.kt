package Strings

fun main(){
    val firstName = "Jose Erinaldo"
    val lastName = "Da Fonseca"
    val fullName = "$firstName $lastName"
    println(fullName)

    println("Digite as notas do aluno $fullName")
    println("Nota 1: ")
    val nota1 = readln().toDouble()
    println("Nota 2: ")
    val nota2 = readln().toDouble()
    println("A media de $nota1 e $nota2 é: ${nota1 + nota2}")
}