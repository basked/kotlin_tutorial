package KotlinInAction.part2.classes

import java.lang.reflect.Modifier
import java.text.DateFormat
import java.time.Instant
import java.util.*

fun getDate()=Date.from(Instant.now()).toString()

class Person(val name: String, val isMaried: Boolean) {
    val isRegularSex: Boolean
        get() {
            return isMaried
        }
    /*or  get() =  isMaried */
    fun showInfo() {
        println("Name=$name, IsMaried=$isMaried, RegularSex=$isRegularSex")
    }
}

fun main(args: Array<String>) {
    val p = Person("Basked", false)
    p.showInfo()
}
