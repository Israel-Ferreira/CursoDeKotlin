package fundamentos.controle

fun main(args: Array<String>){

    // For Crescente com Step 2
    for(num in 0..20 step 2){
        println("Número: $num, X2: ${num * 2}")
    }

    for(i in 0..100 step 5) {
        println("NUM: $i")
    }

    // For Decrescente com step 5
    for (j in 100 downTo 0 step 5){
        println("N: $j")
    }
}