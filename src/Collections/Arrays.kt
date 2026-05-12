package Collections

fun main(){

    val a = arrayOf(10, 20, 30)
    println(a[1])
    a[1] = 99
    println(a)
    println(a.contentToString())

    println("###################################")

    val inteiros: IntArray = intArrayOf(1, 2, 3, 4)
    val reais: DoubleArray = doubleArrayOf(1.5, 2.3, 3.7)
    val caracteres: CharArray = charArrayOf('A', 'B', 'C')

    println(inteiros.contentToString())
    println(reais.contentToString())
    println(caracteres.contentToString())
}