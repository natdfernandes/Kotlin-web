package Collections

fun main(){
    val l1 = listOf("A", "B", "C")           // List<String> (read-only)
    val l2 = mutableListOf(10, 20, 30)       // MutableList<Int>
    println(l1[0])                           // "A"
    println(l2)                              // Imprime a lista

    println("#######################")

    l2.add(40)     // [10, 20, 30, 40]
    println(l2)
    l2[1] = 99    // [10, 99, 30, 40]
    println(l2)
    l2.remove(0)  // [99, 30, 40]
    println(l2)

    println("######################")

    for ((i, v) in l2.withIndex()) println("[$i] = $v")

    val nums = listOf(1, 2, 3, 4, 5)
    val paresDobro = nums.filter { it % 2 == 0 }.map { it * 2 }   // [4, 8]
    val soma = nums.sum()                                        //15

    println(paresDobro)
    println(soma)

    println("#####################")

    val nova = l1 + "D" + "E"        // Cria nova lista: ["A", "B", "C", "D", "E"]
    println(nova)                   // l1 permanece igual (operação não muta a lista original)

}