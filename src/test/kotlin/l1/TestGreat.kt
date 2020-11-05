package l1
import libBas.testGreating
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestGreat{
    @Test
    fun GreatBasket(){
        assertEquals("Hello, basket", testGreating("basket"))
    }
//    @Test
//    fun `Приветствие по имени`(){
//        assertEquals("Hello, basket", testGreating("basket"))
//    }

}