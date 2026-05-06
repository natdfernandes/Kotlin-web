package EstruturaRepeticao

fun main(){
    for (x in 10 .. 40){
        if (x % 7 == 0){
            continue
        }

        if (x == 30){
            break
        }
        println(x)
    }
}