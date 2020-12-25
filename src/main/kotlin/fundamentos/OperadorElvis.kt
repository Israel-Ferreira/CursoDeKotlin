package fundamentos

fun main(args: Array<String>){
    val opcional : String? =  "Feliz Natal"
    val obrigatorio : String = opcional ?: "Valor Padrão"

    println("$obrigatorio")
}