package KotlinInAction.part2

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNumber(c: Char) = c in '0'..'9'
fun recognize(c: Char) = when (c) {
    in 'a'..'z', in 'A'..'Z' -> println("Is letter")
    in '0'..'9' -> println("Is number")
    else -> println("Unknown")
}


fun main() {
    println(isLetter('4'))
    println(isLetter('d'))
    // ==========================
    println(isNumber('1'))
    println(isNumber('f'))
    // ==========================
    recognize('3')
    recognize('d')
}