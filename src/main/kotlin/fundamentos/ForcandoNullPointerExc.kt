package fundamentos

fun main(args: Array<String>){
    var a : Int? = null

    // Chamada com Safe Call Operator (variable?)
    println(a?.inc())

    // Chamada sem Safe Call e forçando um NullPointerException em tempo de Runtime
    println(a!!.inc())
}