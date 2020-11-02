package libBas

import java.math.BigDecimal

/*
* Add String left and right '=' symbols
* */
fun separTheme(theme: String, length: Int=40) =
   println(theme.padStart(length + theme.length, '=').padEnd(2 * length + theme.length , '='))

fun testGreating(name:String):String{ return "Hello, $name"}

fun japaneseSalary(base: BigDecimal, years:Int):BigDecimal{
   require(base>BigDecimal.ZERO){"Base salary can't be negative"}
   return   base +years.toBigDecimal()*10_000.toBigDecimal();
}