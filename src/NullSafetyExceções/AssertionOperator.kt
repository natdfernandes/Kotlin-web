package NullSafetyExceções

fun main(){
    val nullableValue: String? = "Hello"
    val nonNullableValue = nullableValue!! //Como nullableValue não é nulo, isso funciona

    println("Value: $nonNullableValue")

    // val anotherNullableValue: String? = null
    // val anotherNonNullableValue = anotherNullableValue!! // Isso lançará um NullPointerException
}