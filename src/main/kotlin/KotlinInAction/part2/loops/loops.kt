package KotlinInAction.part2.loops

import java.time.Month

enum class Months(val num: Int) {
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);

    fun getNumMonth() = num
}

val months = mapOf(
    1 to Months.January,
    2 to Months.February,
    3 to Months.March,
    4 to Months.April,
    5 to Months.May,
    6 to Months.June,
    7 to Months.July,
    8 to Months.August,
    9 to Months.September,
    10 to Months.October,
    11 to Months.November,
    12 to Months.December
)


fun main() {
    var i = 1;
    // Âûגמה גסו לוסÿצוא
    while (i <= 12) {
        println(months.get(i))
        i++
    }
    i=12
    do {
        println(months.get(i))
        i--
    } while (i>0)
    //========= FOR ==========================
    for (i in 1..10) {
        print(i)
    }
    //========= FOR DOWN TO==========================
    println()
    for (i in 10 downTo 1 ) {
        print(i)
    }
    println()
    for (i in 0..10 step 2) {
        print("$i-")
    }
    println()
    for (i in 10 downTo 0 step 2) {
        print("$i-")
    }
}
