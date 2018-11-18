package Exercicio

fun contarVogais(str: String) : Int{
    var countVowels = 0
    for(t in str.toLowerCase())
        if(charArrayOf('a', 'e', 'i', 'o', 'u').contains(t)) countVowels++
    return countVowels
}

fun contarConsoantes(str: String) : Int{
    var countConsonants = 0
    for(t in str.toLowerCase())
        if(charArrayOf('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v',
                        'x', 'y', 'z', 'w', 'ç').contains(t))  countConsonants++
    return countConsonants
}