package Exercicios

//Um determinado clube de futebol pretende classificar seus atletas em categorias
// e para isto ele contratou um desenvolvedor para criar um programa que executasse esta tarefa.
// Para isso o clube criou uma tabela  que continha a faixa etária do atleta e a sua categoria
// Construa um programa que solicite o nome e a idade de um atleta e imprima a sua categoria
// Idade: 0 a 5, Categoria: Infantil
// Idade: 11 a 15, Categoria: Juvenil
// Idade: 16 a 20, Categoria: Junior
// Idade: 21 a 25, Categoria: Profissional

fun main(){
    print("Digite o nome do atleta: ")
    val atleta = readln()
    print("Digite a idade do atleta: ")
    val idade = readln().toInt()

    if (idade <= 5){
        println("Você é um atleta da categoria infantil.")
    } else if (idade <=15){
        println("Você é um atleta da categoria juvenil.")
    } else if (idade <=20) {
        println("Você é um atleta da categoria junior.")
    } else if (idade <=25){
        println("Você é um atleta na categoria profissional")
    } else{
        println("Você não  está em nenhuma categoria.")
    }

    println("fim")
}