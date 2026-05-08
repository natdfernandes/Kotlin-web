package NullSafetyExceções

fun main(){
    // Non-nullable type
    val nonNullableValue: String = "Hello, Kotlin!"

    // tente atribuir um valor nulo para ver o erro
    //Descomentar a linha abaixo resultará em um erro de compilação
    val anotherValue: String = "Olá, Kotlin"

    println("Value: $nonNullableValue")
    println("Value: $anotherValue")
}