package l1

import libBas.japaneseSalary
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

class TestSalary {
    @Test
    fun testJapanSalary() {
        assertEquals(40000.toBigDecimal(), japaneseSalary(10000.toBigDecimal(), 3))
    }

    @Test
    fun testNegativeSalary() {
        val thrown = assertThrows<IllegalArgumentException> {
            japaneseSalary((-10).toBigDecimal(), 1012 )
        }
        assertEquals("Base salary can't be negative",thrown.message)
    }
}

