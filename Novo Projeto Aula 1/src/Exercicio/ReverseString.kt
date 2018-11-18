package Exercicio

fun reverseUsingSB(str: String): String{
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String{
    var strNova = ""
    for (x in (str.length - 1) downTo 0) strNova += str[x]
    return strNova
}