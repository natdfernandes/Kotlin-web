package NullSafetyExceções

fun main(){
    try {
        val result = 10 / 0
        println("Resultado: $result")
    } catch (e: ArithmeticException){
        println("Erro: Divisão por zero não é permitida")
    }
}