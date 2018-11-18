package Exercicio

fun sumAllParameters(vararg numbers: Int) = numbers.sum()

fun <T> sumAllGenerics(vararg generics: T) : Double {
    var total = 0.00
    for(generic in generics){
        if(generic is Number)
            total += generic.toDouble()
    }
    return total
}