package l3.calc

import libBas.separTheme

fun Any.print(): String = when(this) {
     is String -> "String $this"
     is Int -> "Int $this"
     is Double -> "Double $this"
     is Float -> "Float $this"
     is Char -> "Char $this"
    else -> "Don't know: $this"
}
fun fib(n:Int):Int{
    if (n<=1){
        return n
    } else return fib(n-1)+ fib(n-2)
}

fun main() {
    separTheme("Дополнение к уроку про типы")
    val long: Long = 222
    val int: Int = long.toInt()
    val int1: Int = "123".toInt()
    println("int: Int = long.toInt()=$int")
    println("""int1: Int = "123".toInt()=$int1""")

    separTheme("Функция расширение")
    1.print()
    println(1.print())
    println("basket".print())
    println('a'.print())
    println(12.2f.print())
    println(12.2.print())
    println(true.print())
    separTheme("Функция фибоначчи")
    println(fib(5))
}
//TO BE CONTINUE 05.11.2020
//https://youtu.be/AbbKLvjLdm0?list=PL1osRk8H9xa4FGzIopBXXkv9tU4ndL6A5&t=2392