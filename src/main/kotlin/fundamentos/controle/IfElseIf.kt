package fundamentos.controle

fun main(args: Array<String>){
    val nota: Double = 8.5

    if(nota in 7.0..10.0){
        println("Aprovado")
    }else if(nota in  5.0..6.99){
        println("Exame")
    }else if(nota in 0.0..4.99){
        println("Reprovado")
    }else{
        println("Nota Inválida")
    }
}