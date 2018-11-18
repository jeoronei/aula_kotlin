package Exercicio

import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseStringTeste{
    @Test fun reverseUsingSB(){
        assertEquals("bs niltok", reverseUsingSB("kotlin sb"))
    }

    @Test fun reverseUsingLoop(){
        assertEquals("pool niltok", reverseUsingLoop("kotlin loop"))
    }
}