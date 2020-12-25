package fundamentos

fun main(args: Array<String>){
    // Safe Call Operator: Evita e protege de problemas com NullPointerException no Código
    val a: Int? = null
    println(a?.dec())
}