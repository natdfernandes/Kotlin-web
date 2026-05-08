package NullSafetyExceções

fun calcularRaizQuadrada(numero: Int): Double{
    if (numero < 0){
        throw IllegalArgumentException( "Número não pode ser negativo")
    }
    return kotlin.math.sqrt(numero.toDouble())
}

fun main(){
    try {
        println(calcularRaizQuadrada(-9))
    } catch (e: IllegalArgumentException){
        println("Erro: ${e.message}")
    }
}

