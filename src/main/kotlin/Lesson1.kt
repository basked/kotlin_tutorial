/*
/*<Comments*/

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
/*<Types kotlin*/
val firstName: String = "Basked"
val lastName: String = "Teksab"
var age = 33
const val CREW = "LAST MOVE"
/*Types kotlin>*/
*/

/*< STRING TEMPLATES*/
val firstName2 = "basket"
val lastnametName2 = "teksab"
val age2 = 34

/*STRING TEMPLATES >*/

fun main(argd: Array<String>) {
/*
/*
/*< TYPES KOTLIN */
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
/*< STRING TEMPLATES*/
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

    libBas.separTheme("basket", 40)
    libBas.separTheme("Интерполяция строк", 40)
    println("Hello, World")
}


/*
31.10.2020
to be continued with
https://youtu.be/ArvUrjnvK-w?list=PL1osRk8H9xa4FGzIopBXXkv9tU4ndL6A5&t=3717
*/