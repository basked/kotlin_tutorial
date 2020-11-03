import libBas.date
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TestRegexp {
    @Test
    fun regexpTest() {
        assertTrue(date("10 SEP 1986"))
        assertFalse(date("10 SSP 1986"))
    }
}