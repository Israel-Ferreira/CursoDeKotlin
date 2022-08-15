package fundamentos

fun main() {
    val num1 = 5
    val num2 = 9

    val resultadoSoma =  soma(num1, num2)
    val resultadoDiv = divisao(num1,num2)

    val resultadoMulti = multiplicacao(num1, num2)

    println("Resultado com param. Padrão: ${soma(num1)}")

    println("Resultados: \n Soma: $resultadoSoma \n Divisão: $resultadoDiv")

    println("Resultado Multiplicacao: $resultadoMulti")
}

fun soma(num1: Int, num2: Int = 1) : Int {
    return num1 + num2
}

fun divisao(num1: Int, num2: Int) : Double {
    return (num1.toDouble()) / (num2.toDouble())
}

fun multiplicacao(num1: Int, num2: Int) : Int   {
    return num1 * num2
}