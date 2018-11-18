package Exercicio;

import junit.framework.Assert.assertEquals
import org.junit.Test


public class CountVowelsTest {

    @Test fun contarVowels(){
        assertEquals(11, contarVogais("Quantas vogais tem essa frase?"))
    }

    @Test fun contarConsonants(){
        assertEquals(21, contarConsoantes("Geralmente uma frase possui mais consoantes."))
    }

    @Test fun contarVowelsAndConsonants(){
        val phrase = "Estou gostando muito de aprender kotlin."
        assertEquals(15, contarVogais(phrase))
        assertEquals(19, contarConsoantes(phrase))

    }
}
