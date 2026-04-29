package Exercicios

//Elabore um algoritmo para ler o nome de um aluno, sua idade (em anos) e as quatro notas (de quatro bimestres).
//Calcular a média anual do aluno.
//Imprimir: nome, idade, notas e média

fun main(){
    print("Digite o nome do Aluno: ")
    val aluno = readln()

    print(" Qual a idade do aluno: ")
    val idade = readln().toInt()

    print("Digite a 1ª nota do aluno: ")
    val nota1 = readln().toDouble()
    print("Digite a 2º nota do aluno: ")
    val nota2 = readln().toDouble()
    print("Digite a 3º nota do aluno: ")
    val nota3 = readln().toDouble()
    print("Digite a 4º nota do aluno: ")
    val nota4 = readln().toDouble()
    val media = (nota1 + nota2 + nota3 + nota4)/4
    println(media)

    println("------------")
    println(aluno)
    println(idade)
    println(nota1)
    println(nota2)
    println(nota3)
    println(nota4)
    println(media)
}