
import libBas.fizzBuzz
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestFizzBuzz {
    @Test
    fun TestFizzBuzz(){
         assertEquals("3: Fizz", fizzBuzz(3))
         assertEquals("5: Buzz", fizzBuzz(5))
         assertEquals("15: FizzBuzz", fizzBuzz(15))
         assertEquals("1:", fizzBuzz(1))
    }
}