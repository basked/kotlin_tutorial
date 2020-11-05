package l2.classes

class Person(val name: String, val isMarried: Boolean? = null) {
    var address: String = "Makchnovicha,21"
        set(value) {
            println(
                """
            Address for $name was change whith $field on $value
        """.trimIndent()
            )
            field = value
        }
        get() {
            println("Was read address $field for $name")
            return field
        }
fun getPersonInfo() {
    println(
        "Person ${this.name} is ${
            when (this.isMarried) {
                true -> "Married"
                false -> "Not married"
                else -> "Love is Dead"
            }
        } lived on address $address"
    )
}
}


fun main() {
    val bas = Person("Bas")
    bas.getPersonInfo()
    bas.address = "ul.Moskovskaya 362"
}