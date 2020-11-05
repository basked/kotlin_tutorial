package l2.extensions

import libBas.separTheme

// для Strinng - доступен только метод чтения
val String.lastChar: Char
    get() = get(length - 1)

// для StrinngBuilder - доступен только метод чтения
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    separTheme("Расширяемое свойство для String(только get)")
    println("basked".lastChar)
    separTheme("Расширяемое свойство для StringBuiled (get и set)")
    val sb = StringBuilder("basket")
    println(sb.lastChar)
    sb.lastChar = 'd'
    println(sb)

}