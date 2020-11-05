package fundamentos


fun main(args: Array<String>){
    // Tipos Numéricos Inteiros
    val num1 : Byte =  127 // Valor Máximo Byte
    val num2 : Short =  32767 // Valor Máximo Short

    val num3 : Int =  Int.MAX_VALUE // Valor Máximo Int
    val num4 : Long =  Long.MAX_VALUE // Valor Máximo Long

    val tiposInteiros : Array<Any> = arrayOf(num1, num2,num3, num4)

    showVarTypes(tiposInteiros)

    // Tipos Númericos de Ponto Flutuante
    val numFloat : Float = 3.5F
    val numDouble : Double = 3.5

    showVarTypes(arrayOf(numFloat, numDouble))

    // Tipos Booleano
    val boolean : Boolean =  true
    showVarTypes(arrayOf(boolean))

    // Tipo Char
    val char : Char = '?'
    showVarTypes(arrayOf(char))

    println(2 is Int)
    println(10.times(2))
}

fun showVarTypes(arrVars : Array<Any>){
    val varTypes =  arrVars.map { vr -> getTypeName(vr) }
    for(x in varTypes) println(x)
}

fun getTypeName(typeVar : Any) : String {
    return typeVar.javaClass.simpleName
}