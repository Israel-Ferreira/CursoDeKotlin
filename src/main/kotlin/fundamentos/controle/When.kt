package fundamentos.controle

fun main(args: Array<String>){
    val nota = -3.0

    when(nota){
        in 7.0..10.0 -> println("Fantastico")
        in 5.0..6.99 -> println("Dá para Recuperar")
        in 0.0..4.99 -> print("Reprovado")
        else -> println("Nota Inválida")
    }

}