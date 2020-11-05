import l2.extensions.getFirstElement
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestExtension {
    @Test
    fun testExtList(){
     assertEquals("basket", listOf<String>("basket","ice","5ony").getFirstElement())
    }
}