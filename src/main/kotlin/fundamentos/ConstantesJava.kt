package fundamentos

import kotlin.math.pow

fun main(args: Array<String>) {
    // Usando a constante PI do Pacote Math do Java
    val PI = Math.PI

    println("Digite o raio da circuferência")

    /*
    * Entrada de dados do Teclado em Kotlin
    * Outro detalhe no código abaixo, são as exclamações
    * que é um modificador que indica que a função chamada
    * não aceita valores nulos e gera NullPointerException */
    var raio = readLine()!!.toDouble()

    var areaCircuferencia = PI * (raio.pow(2))

    println("A área da circuferência é: $areaCircuferencia")

}
