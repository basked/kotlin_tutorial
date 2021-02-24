package other

fun lfun(p: Int): Int {
    return p * 100
}


fun main() {
    val sum = { a: Int, b: Int -> a + b }
    println(sum(5, 44))
    val pr = { s: String -> println(s) }
    pr("basked")
   println( lfun(sum(5,5)))
}