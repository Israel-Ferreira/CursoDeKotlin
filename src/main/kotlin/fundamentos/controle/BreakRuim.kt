package fundamentos.controle

fun main(args: Array<String>) {

    /*
        O Código abaixo segue pessimas práticas  de programaçãq
        Usando a instrução BREAK de maneira rotulada, algo fora do recomendado

        Notas - Aula 40 - Break #2
     */

    loop@for (i in 1..15){
        for(j in 1..15){
            if(i  == 2 && j == 9) break@loop

            println("I: $i, J: $j")
        }
    }
}