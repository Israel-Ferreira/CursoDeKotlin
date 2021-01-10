package fundamentos.imports

import fundamentos.imports.functions.*
import fundamentos.imports.models.Coisa

fun main(args: Array<String>){
    val something : Coisa = Coisa(nome = "Lápis")
    println(something.nome)

    val resultado : String = funcaoSimples(something.nome)
    println(resultado)

    println("${FaceMoeda.CARA}: ${FaceMoeda.CARA.description}")
    println("${FaceMoeda.COROA}: ${FaceMoeda.COROA.description}")

    val a: Int= 3
    val b: Int = 5

    println("\n Soma: ${soma(a, b)}, \n " +
            "Subtração: ${sub(a,b)}, \n " +
            "Multiplicacão: ${multi(a,b)}, \n " +
            "Divisão: ${divs(a, b)}")
}