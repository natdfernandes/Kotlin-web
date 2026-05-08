package NullSafetyExceções

fun main(){
    val nullableValue: String? = null   //Tente alterar isso para um valor não nulo
    val length = nullableValue?.length
    println("Length of value: $length")

}