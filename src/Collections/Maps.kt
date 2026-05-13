package Collections

fun main(){

    val m1 = mapOf("A" to 1, "B" to 2)                    // Map<String, Int>
    val m2 = mutableMapOf("A" to 1, "B" to 2)            // MutableMap

    println(m1["A"])                                       //1
    println(m1.getOrDefault("Z", 0))    //0
    println(m1.getOrElse("Z") {-1})                 // -1 (lambda)

    println(m1)
    println(m2)

    println("###################")

    m2["C"] = 3                     //Adiciona/ Atualiza
    m2.putIfAbsent("B", 99)         // Não substitui se já existe
    m2.remove("A")
    println(m2)

    println("#################")

    for ((k, v) in m2) println("$k -> $v")
    println(m2.keys)                            //Conjunto de chaves
    println(m2.values)                          //Conjunto de valores
    println(m2.entries)                         //Pares chave-valor

}