package fundamentos

import kotlin.math.pow

fun main(args : Array<String>) {
    var a : Double = 1.0
    var b = 2

    b *= 2

    a = 2.0.pow(b)

    /*
    * Para interpolar uma variavel ou uma constante
    * numa string, basta adicionar o cifrão + nome da variavel
    * */
    println("O resultado é: $a")
}