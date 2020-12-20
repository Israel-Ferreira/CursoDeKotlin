package fundamentos

fun main(args: Array<String>) {
    println("Digite o primeiro numero: ")
    val num1: Int = readLine()!!.toInt()

    println("Digite o segundo numero:  ")
    val num2: Int = readLine()!!.toInt()

    imprimirSoma(num1, num2)
}

fun imprimirSoma(num1: Int, num2: Int){
    val soma = num1 + num2
    println("O resultado da soma é $soma")
}