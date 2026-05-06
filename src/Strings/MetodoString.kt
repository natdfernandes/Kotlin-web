package Strings

fun main(){
    val name = "Jose Erinaldo"

    println(name.reversed())
    println(name.lowercase())
    println(name.uppercase())
    println(name.equals("Jose Erinaldo"))
    println(name.slice(indices = 0 .. 2))
    println(name.length)
    println(name.get(10)) //prefira name[10]
    println(name.startsWith(prefix = "Jo"))
    println(name.endsWith(suffix = "naldo"))
    println(name.substring(0,8))
    println(name.replace( "a",  "@"))

    val dados = "nome, email, telefone"
    val partes = dados.split( ",")
    println(partes)          //nome
    println(partes[0])
    println(partes[1])
}