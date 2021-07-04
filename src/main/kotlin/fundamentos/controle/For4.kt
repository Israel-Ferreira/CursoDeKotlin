package fundamentos.controle

class Aluno(var nome: String, var nota: Double)

fun main(args: Array<String>){
    val alunos = arrayListOf<Aluno>(
        Aluno("Israel", 8.2),
        Aluno("Rubens", 9.0),
        Aluno("Thiago", 8.5),
        Aluno("Fernanda", 8.7)
    )

    for((index,aluno) in alunos.withIndex()){
        println("${index + 1} - Nome do Aluno: ${aluno.nome}, Nota: ${aluno.nota}")
    }
}