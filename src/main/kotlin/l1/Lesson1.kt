package l1/*
/*<COMMENTS*/

// One line comments

/*
*  Multiline comments
*
*/


/*
 /*Embeded comments*/
 /*  Basked
     from
     LMC
  */
*/

/*Comments>*/
 */
/*
/*<TYPES KOTLIN*/
val firstName: String = "Basked"
val lastName: String = "Teksab"
var age = 33
const val CREW = "LAST MOVE"
/*Types kotlin>*/
*/
/*
/*<STRING TEMPLATES*/
val firstName2 = "basket"
val lastnametName2 = "teksab"
val age2 = 34
/*STRING TEMPLATES >*/
*/
/*
/*<FUNCTIONS*/
/*1*/
fun greating(firstName: String, lastName: String) {
    println("[Ex1] Hello, $firstName, $lastName")
}

/*2 overload whith other param*/
fun greating(firstName: String, lastName: String, age: Int = 34) {
    println("[Ex2] Hello, $firstName, $lastName, $age")
}
/*3 Type and return syntacsis*/
/*
     fun greating(firstName: String, lastName: String, nick: String = "teksab"): String {
        return "[Ex3]$firstName, $lastName, $nick [Ex3]"
    }
 */

/*4* equivalent prev, if use one operator */
fun greating(firstName: String, lastName: String, nick: String = "teksab") =
    "[Ex4] Hello, $firstName, $lastName, $nick"

/*5 precoditions*/
fun greating(firstName: String) {
    require(!firstName.isBlank()) { "Укажите имя" }
    println("[Ex5] Hello, $firstName ")
}

/*6 precoditions*/
fun greating(firstName: String, age: Int = 0) {
    require(!firstName.isBlank()) { "Укажите имя" }
    //!!require(age=0) {"ds"} = TODO("Почему только с отрицанием  != работает ??")
    require(age != 0) { "Ещё не родился? Введи нужный возраст!" }
    println("[Ex6] Hello, $firstName, age=$age")
    //()=TODO("""Как работают остальные функции requireNotNull(), check(), assert()" +
}

/*<FUNCTIONS>*/
*/
/*
/*<LOOPS*/
var counter = 0

/*LOOPS>*/
*/
/*
/*<COLLECTIONS*/


/*COLLECTIONS>*/
*/

fun main(argd: Array<String>) {
/*
/*<TYPES KOTLIN */
    libBas.separTheme("TYPES", 50)
    age = 70
    var temperature = 1
    val condition1 = if (temperature < -5) "Холодно" else if (temperature < 5) "Около нуля" else "Жарко как в Ташкенте"
    temperature = 25
// when = if + switch (Предлагает Kotlin вместо предыдущего условия)
    val condition2 = when {
        temperature < -5 -> "Холодно"
        temperature < 5 -> "Около нуля"
        else -> "Жарко как в Ташкенте"
    }
    val ageType = when {
        age < 5 -> "Солобон"
        age in 6..12 -> "Школота"
        age in 13..18 -> "Задрот"
        age in 18..25 -> "18+"
        age in 26..63 -> "Трудяга"
        else -> "Пенс"
    }
    println(condition1)
    println(condition2)
    println("Мне ${age - 1} я - $ageType")
    //nullable -------------------------
    var position: String? = "programmer"
    position = null
    // Print
    /*1*/
    println("--------------------NULL---------------------------")
    if (position != null) {
        println("Exapmle1. Length is " + (position.length))
    } else println("Exapmle1. Length  is NULLL")
    /*2*/
    println("Exapmle2. Length is " + (position?.length))
    /*3*/
    println("Exapmle3. Length is ${position?.length ?: 0}")
    /*4*/
    //println("Exapmle4. Length is ${position!!.length}")
    /*5*/
    try {
        println("Exapmle4. Length is ${position!!.length}")
    } catch (e: Exception) {
        println("TRY CATCH EXCEPTION ${e.message}")
    }

// ----------------- SMATR CAST (Безопасное приведение)
    val obj: Any = "15"
    /*1*/// smart cast !is
    if (obj is String) {
        println("""$obj is String type with length=${obj.length}""")
        val obj2 = obj.toIntOrNull();
        println("Obj2=$obj2 is Int type in unsafe cast from String type")
    }
    /*2*/ //unsafe cast
    val obj3 = (obj as String)
    println("Obj3=$obj3 is Int type in unsafe cast from String type")
    /*3*/ // ClassCastException
    try {
        val obj4: String = age as String
        println(obj4)
    } catch (e: java.lang.ClassCastException) {
        println("Проблема приведения типа Int to String выдает java.lang.ClassCastException")
    }
    /*4*/// safe cast
    val obj4: String? = age as? String;
    println("Safe cast Int to String = $obj4. No exception!!!")
/*TYPES KOTLIN>*/
*/
/*
/*<STRING TEMPLATES*/

    libBas.separTheme("STRING TEMPLATES")
    println("Имя: " + firstName2 + ", фамилия: " + lastnametName2 + ",в возрасте: " + age2 + " лет зарабатывает 1500$")
    //equivalent for kotlin
    println("Имя: $firstName2, фамилия: $lastnametName2,в возрасте: ${age2 - 4} лет зарабатывал 2500$\$")

    libBas.separTheme("Интерполяция строк")
    //строки в которых не производится интерполяция /* java */
    println("\\\'My nickname is \"BASKED\"\'\\")
    //строки в которых не производится интерполяция /* kotlin */
    println("""\'My nickname is "BASKED"'\""")

    libBas.separTheme("Несколько строк")
    println(
        """
             One line
             Two line
             Three line
        """.trimIndent()
    )
    println(
        """
        |SELECT * FROM Users
        |WHERE gae>35
        |GROUP BY Name
    """.trimMargin()
    )
/*STRING TEMPLATES>*/
*/
/*
/*<FUNCTIONS*/
    libBas.separTheme("FUNCTION")
    /*1*/
    fun greating(firstName: String, lastName: String) {
        println("[Ex1] Hello, $firstName, $lastName")
    }

    /*2 overload whith other param*/
    fun greating(firstName: String, lastName: String, age: Int = 34) {
        println("[Ex2] Hello, $firstName, $lastName, $age")
    }
    /*3 Type and return syntacsis*/
    /*
         fun greating(firstName: String, lastName: String, nick: String = "teksab"): String {
            return "[Ex3]$firstName, $lastName, $nick [Ex3]"
        }
     */

    /*4* equivalent prev, if use one operator */
    fun greating(firstName: String, lastName: String, nick: String = "teksab") =
        "[Ex4] Hello, $firstName, $lastName, $nick"

    /*5 precoditions*/
    fun greating(firstName: String) {
        require(!firstName.isBlank()) { "Укажите имя" }
        println("[Ex5] Hello, $firstName ")
    }

    /*6 precoditions*/
    fun greating(firstName: String, age: Int = 0) {
        require(!firstName.isBlank()) { "Укажите имя" }
        //!!require(age=0) {"ds"} = TODO("Почему только с отрицанием  != работает ??")
        require(age != 0) { "Ещё не родился? Введи нужный возраст!" }
        println("[Ex6] Hello, $firstName, age=$age")
        //()=TODO("""Как работают остальные функции requireNotNull(), check(), assert()" +

    }
    /*IMPLEMENTATIONS FUNCTION*/
    /*1*/greating("basked", "teksab")
    /*2*/greating(age = 33, firstName = "basked", lastName = "teksab")
    /*3*/println(greating("basked", "teksab", "bas"))
    /*5*/
    try {
        greating("")
    } // Exception in thread "l1.main" java.lang.IllegalArgumentException: Ук ажите имя}
    catch (e: Exception) {
        println("""[Ex5] Exception in thread "l1.main" java.lang.IllegalArgumentException: Укажите имя""")
    }
    /*5-1*/ greating("[Ex5-1] basked")

    /*6*/
    try {
        greating("basked", 0)
    } catch (e: Exception) {
        println("""[Ex6] Exception in thread "l1.main" java.lang.IllegalArgumentException: Ещё не родился? Введи нужный возраст!""")
    }
    /*6-1*/ greating("[Ex6-1] basked", 35)

/*FUNCTION>*/
*/
/*
/*<LOOPS*/
    while (counter < 31) {
        println("December ${++counter}")
    }
// выполниться условие хотябы один раз
    /*do {
        val command = readLine();
        println("command: $command")
    } while (command != "quit")
    Process finished with exit code -1073741819 (0xC0000005)=TODO('Валится с ошибкой')
    */

    //DIAPAZONS
    val oneToFive = 1..5
    val letters = 'a'..'z'
    val words = "kotlin".."Yaml"
    val words2 = "Kotlin".."Yaml"

    /*1*/
    if (3 in oneToFive) {
        println("3 in diapazone 1..5")
    } else println("3 not in diapazone 1..5")
    /*2*/
    if ('d' in letters) {
        println("'d' in diapazone 'a'..'z'")
    } else println("'d' not in diapazone 'a'..'z'")
    /*3*/
    if ("Kotlin" in words) {
        println("Kotlin in word")
    } else {
        println("Kotlin not in word")
    }
    /*3-1*/
    if ("Kotlin" in words2) {
        println("Kotlin in word")
    } else {
        println("Kotlin not in word")
    }
    for (letter in letters) {
        print(letter)
    }
    println()
/*LOOPS>*/
*/
/*
/*<COLLECTIONS*/
    // ARRAYS
    val array1: Array<Int> = arrayOf<Int>(1, 2, 3, 4)
    // equivalent
    val array2 = arrayOf(1, 2, 3, 4)
// array= arrayOf(5)// Val cannot be reassigned (ссылка не может ссылаться на другой массив)
// но можно изменить элемент массива
    array1[3] = 34
    array2[3] = 34
    println("${array1[3]},${array2[3]}")
    //LISTS
    val list = listOf("One", "Two", "Tree")
// list.add, list[0]="Onne" добавить нельзя
// но можно изменить
    val mutableList = mutableListOf("One", "Two", "")
    mutableList[2] = "Tree"
    mutableList.add("Four")
    for (ml in mutableList) {
        println(ml)
    }
// PAIR
    val pair = Pair("One", "Two")
    println("first=${pair.first},second=${pair.second}")
    val infixPair = 1 to "One"
    val daysOfWeek = mutableMapOf(
        1 to "M",
        2 to "T",
        3 to "W",
        4 to 'S',
        5 to "T",
        6 to "S",
        7 to "S"
    )
    for ((f, s) in daysOfWeek) {
        println("Fist pair $f, Second $s")
    }
 // TRIPLETS
 val (a,b,c) = Triple(32,"Basked", listOf(1,2,3))
/*COLLECTIONS>*/
*/
    println("Hello, World")
}


/*
31.10.2020
to be continued with
https://youtu.be/ArvUrjnvK-w?list=PL1osRk8H9xa4FGzIopBXXkv9tU4ndL6A5&t=3717
*/

/*
01.11.2020
to be continued with
https://youtu.be/ArvUrjnvK-w?t=4761
 */

