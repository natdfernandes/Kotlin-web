package Collections

fun main(){

    //Somente leitura
    val numeros = setOf(1, 2, 3)
    println(numeros)                // [1, 2, 3]  (o número 3 é duplicado e ignorado

    //Mútavel
    val cores = mutableSetOf("Azul", "Verde")
    cores.add("Amarelo")
    cores.add("Azul")           //Azul já existe, não será duplicado
    println(cores)              // [Azul, Verde, Amarelo]

    println("################")

    val NumInteiros: Set<Int> = setOf(1, 2, 3, 4, 5)

    val pares = NumInteiros.filter {it % 2 == 0}.toSet()        //Filter: retorna um novo Set com elementos
    println("Pares: $pares")                                    //Pares: [2,4]

    val novoSet = NumInteiros + 6                               //Plus: adiciona elementos, retorna novo Set
    println("Original: $NumInteiros")                           // original: [1, 2, 3, 4, 5]
    println("Novo set: $novoSet")                               //Novo set: [1, 2, 3, 4, 5, 6]
    //novoSet.add()                                             //não mutável

    val semTres = NumInteiros - 3                              // minus: remove elementos, retorna novo Set
    println("Sem o 3: $semTres")                               // Sem o 3: [1, 2, 4]

}