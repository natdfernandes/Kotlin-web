package Funções

fun saudacaoPersonalizada(nome: String = "Aluno"){
    println("Olá, $nome!")
}
fun main(){
    saudacaoPersonalizada()    //Saída: Olá, Aluno!
    saudacaoPersonalizada("Erinaldo")    //Saída: Olá Erinaldo!
}