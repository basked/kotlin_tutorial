package l2.extensions

import libBas.separTheme

fun String.lastCharOf(): Char = this[this.length - 1]
fun String.lastCharOf2(): Char = get(length - 1)

//This type is final, so it cannot be inherited from
//class MyString:String(){
//
//}

// функция которая возвращает первый элемент листа
fun List<String>.getFirstElement() = get(0)

fun String.allMatchesOf(regExp: String): List<String> {
    val s = mutableListOf<String>()
    val found = regExp.toRegex().findAll(this)
    for (gr in found) {
        s.add(gr.value)
    }
    return s
}


fun main() {
    separTheme("Расширение типа String- последний символ строки")
    println("basket".lastCharOf())
    println("basked".lastCharOf2())
    separTheme("Расширение типа List- первый элемент списка")
    println(listOf("basket", "sony", "ice", "hip").getFirstElement())
    separTheme("Расширение типа String- list<String> по шаблону из строки")

   "<html><div></div></html>".allMatchesOf("""<[^>]+>""").forEach { println(it) }
}