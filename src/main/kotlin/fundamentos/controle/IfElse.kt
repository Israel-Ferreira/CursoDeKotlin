package fundamentos.controle

fun main(args: Array<String>){
    val nota: Double = 8.3


    /**
    * If e Else em uma unica linha em Kotlin.
    * Em kotlin, não há operadores ternários e como forma de substituir
    * você pode usar o If/Else em uma unica linha ou em comparações envolvendo
    * comparação entre nulo e uma variável, o operador Elvis(:?)
    * if(nota >= 7) println("Aprovado") else println("Reprovado")
    *
     */


    if(nota >= 7){
        println("Aprovado")
    }else{
        println("Reprovado")
    }
}