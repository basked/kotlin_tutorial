package l2

import l2.extensions.allMatchesOf
import l2.extensions.getFirstElement
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test

class TestExtension {
    @Test
    fun testExtList(){
     assertEquals("basket", listOf<String>("basket","ice","5ony").getFirstElement())
    }
    @Test
    fun testExtesionFunction(){
        assertIterableEquals(listOf("<html>","<div>","<table>","</table>","</div>","</html>"),"<html><div>bask<table></table></div></html>".allMatchesOf("""<[^>]+>"""))
    }
}