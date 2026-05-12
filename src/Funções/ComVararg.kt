package Funções

fun soma(vararg numeros:Int): Int{
    var total = 0
    for (n in numeros){
        total += n
    }
    return total
}

fun main(){
    println(soma(1,2,3))    //6
    println(soma(10, 20))     //30
    println(soma())                   // 0 (nenhum argumento passado)
}
