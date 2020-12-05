package l3.calc


import l2.Person
import libBas.separTheme

fun Any.print(): String = when (this) {
    is String -> "String $this"
    is Int -> "Int $this"
    is Double -> "Double $this"
    is Float -> "Float $this"
    is Char -> "Char $this"
    else -> "Don't know: $this"
}

fun fib(n: Int): Int {
    if (n <= 1) {
        return n
    } else return fib(n - 1) + fib(n - 2)
}

fun fib2(n: Int): Int {
    var a = 1;
    var b = 1;
    var i = 3;
    while (i <= n) {
        val c = a + b
        a = b
        b = c
        i++
    }
    return b;
}

// Сумма всех значений List<Int>
fun List<Int>.sum(): Int {
    var res = 0;
    this.forEach() {
        res += it;
    }
    return res
}

// Функция проверки валтндных идентификаторов (начинаются с буквы или цифра, содержат буква или цфра и могут содержать _)
// Максимальная длина 8 символов
fun isValidId(str: String): Boolean {

    val line = "abc 123 def"
//    val regexp="\\d{3}"
    // есть ли три цифры подряд в строке

    return str.matches("""[a-zA-z0-9_]\w{4,8}""".toRegex())
}

// Класс животных говорящих на своем языке
interface Animal {
    fun say()
}

class Goat(val name: String = "Goat") : Animal {
    override fun say() {
        print("Meeee")
    }
}

class Dog(val name: String = "Dog") : Animal {
    override fun say() {
        println("Gavvvv")
    }
}

class Cow(val name: String = "Cow") : Animal {
    override fun say() {
        println("Myyyyyy")
    }
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
//    println(fib(3))
    println(fib2(77))
    separTheme("Функция рисширение сумма значенй List<Int>")
    println(listOf(1, 2, 32).sum())
    separTheme(" Проверка на валидность ID")
    println("""isValidId("test1")=${isValidId("test1")} """)
    println("""isValidId("te1")=${isValidId("te1")} """)
    println("""isValidId("test12345")=${isValidId("test123455")} """)
    println("""isValidId("")")=${isValidId("")} """)
    println("""isValidId("13")")=${isValidId("13")} """)
    println("""isValidId("abc 123")")=${isValidId("abc 123")} """)
    println("""isValidId("_abc")")=${isValidId("_abc")} """)

    separTheme(" Животные заговорили ")
    listOf<Animal>(Cow(), Dog(), Goat()).forEach() { animal -> "${animal.say()} " }


}
//TO BE CONTINUE 05.11.2020
//https://youtu.be/AbbKLvjLdm0?list=PL1osRk8H9xa4FGzIopBXXkv9tU4ndL6A5&t=2392

