package NullSafetyExceções

fun main(){
    // Nullable type
    val nullableValue: String? = null

    // Tente alterar o valor para uma string não nula
    val length = nullableValue?.length
    // Diferente de null
    if (length != null){
        println("Length of value:  $length")
    } else{
        println("Value is null")
    }
}