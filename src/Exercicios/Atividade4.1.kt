package Exercicios

// Crie um algoritmo de contagem inteligente. Leia dois números, um inicial e outro final.
// Analise cada número e execute a seguinte tarefa. Se o número inicial for menor que o final,
//faça um contador crescente. Mas, caso o número inicial seja maior que o final, execute um contador decrescente
//Imprima o resultado do passo a passo do contador
// Condição e repetição

fun main(){
    print("Digite o primeiro número: ")
    val n1 = readln().toInt()
    print("Digite o segundo número: ")
    val n2 = readln().toInt()

    if (n1 < n2) {

        for (i in n1..n2)
            print("$i")

    }else if (n1 > n2) {

        for (i in n1 downTo n2) {
            print("$i ")
        }


    }else {
            print("Os números são iguais: $n1")
        }
    }
