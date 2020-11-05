package l2.enums

import libBas.separTheme

enum class Day(val num: Int) {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    override fun toString() = when (this) {
        MONDAY -> "DAY MONDAY"
        TUESDAY -> "DAY TUESDAY"
        WEDNESDAY -> "DAY WEDNESDAY"
        THURSDAY -> "DAY THURSDAY"
        FRIDAY -> "DAY FRIDAY"
        SATURDAY -> "DAY SATURDAY"
        SUNDAY -> "DAY SUNDAY"
    }
}

fun main() {
    separTheme("Разные способы вывода перечислений")
    println(Day.FRIDAY)
    println("${Day.FRIDAY} \n${Day.valueOf("FRIDAY")} \n${Day.values().get(4)}")
    separTheme("Перечислим все дни")
    Day.values().forEach { println(it) }
}