package fundamentos

fun main(){
    val aprovados =  listOf<String>("Rubens", "Denilson", "Mariana", "Marcos")

    println("O primeiro colocado foi ${aprovados.first()}")
    aprovados.forEach { aluno -> println("O aluno ${aluno} foi aprovado") }
}