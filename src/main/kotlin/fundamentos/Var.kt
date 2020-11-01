package fundamentos

import kotlin.math.pow

fun main(args : Array<String>){
    // Declaração de uma váriavel em Kotlin
    var num1 : Int  = 3
    var num2 : Double = 4.5

    // Declaração de uma constante em Kotlin
    val MEU_PI : Double =  3.1495

    // Variável com inferência de Tipo
    var area = MEU_PI * (num1 * num2).pow(2)

    println(area)
}