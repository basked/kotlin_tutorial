package KotlinInAction.part2.enums

import java.lang.Exception

enum class LMC(val nick: String) {
    basket("basket"),
    sony("sony"),
    ice("ice"),
    hip("hip");

    val nick_name: String
        get() {
            return nick
        }

    init {
        when (nick) {
            "basket" -> println("$nick -> Cool make HeadSpin")
            "sony" -> println("$nick -> Cool make Stlyle")
            "ice" -> println("$nick -> Cool make PowerMove")
            "hip" -> println("$nick -> Cool make Turtles")
        }
    }

    fun showInfo() {
        when (nick) {
            "basket" -> println("$nick -> Cool make HeadSpin")
            "sony" -> println("$nick -> Cool make Stlyle")
            "ice" -> println("$nick-> Cool make PowerMove")
            "hip" -> println("$nick-> Cool make Turtles")
        }
    }
}


enum class Colors(val r: Int, val g: Int, val b: Int) {

    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238),
    POPUR(54, 22, 488),
    LIGHT(65, 66, 2);

    fun rgb() = (r * 256 + g) * 256 + b

    fun getMnemonic() =
        when (name) {
            "POPUR", "LIGHT" -> "Пастельные цвета"
            "RED" -> "Каждый"
            "ORANGE" -> "Охотник"
            "YELLOW" -> "Желает"
            "GREEN" -> "Знать"
            "BLUE" -> "Где"
            "INDIGO" -> "Сидит"
            "VIOLET" -> "Фазан"
            else -> "NO COLOR"
        }

    init {
        // println("${name} = ${rgb()}")
    }

}

fun getMnemonic(color: Colors) =
    when (color) {
        Colors.POPUR, Colors.LIGHT -> "Пастельные цвета"
        Colors.RED -> "Каждый"
        Colors.ORANGE -> "Охотник"
        Colors.YELLOW -> "Желает"
        Colors.GREEN -> "Знать"
        Colors.BLUE -> "Где"
        Colors.INDIGO -> "Сидит"
        Colors.VIOLET -> "Фазан"
    }

fun mix(c1: Colors, c2: Colors) = when (setOf(c1, c2)) {
    setOf(Colors.RED, Colors.YELLOW) -> Colors.ORANGE
    setOf(Colors.YELLOW, Colors.BLUE) -> Colors.GREEN
    setOf(Colors.BLUE, Colors.VIOLET) -> Colors.INDIGO
    else -> throw Exception("Грязный цвет")
}


fun main() {
    println(Colors.RED.getMnemonic())
    println(Colors.POPUR.getMnemonic())
    println(getMnemonic(Colors.LIGHT))
    println(mix(Colors.VIOLET,Colors.BLUE ))
    try {
        println(mix(Colors.BLUE, Colors.POPUR))
    } catch (e: Exception) {
        println(e.toString())
    }

    /* LMC.basket.showInfo()
     println(LMC.basket.nick_name)*/
}