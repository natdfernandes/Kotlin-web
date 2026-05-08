package NullSafetyExceções

fun main(){
    val nullableValue: String? = null
    val result = nullableValue ?: "Default Value"

    println("Result: $result")
}