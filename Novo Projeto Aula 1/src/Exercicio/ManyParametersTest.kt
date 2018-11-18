package Exercicio

import org.junit.Assert.assertEquals
import org.junit.Test

class ManyParametersTest {

    @Test fun sumAllParameters(){
        assertEquals(20, sumAllParameters(5, 5, 5, 5))
    }

    @Test fun sumAllGenerics(){
        assertEquals(10.0, sumAllGenerics(1, "", 2, "2", 2.0, "10", 5), .1)
    }
}