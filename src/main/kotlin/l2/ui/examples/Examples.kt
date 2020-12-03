package l2.ui.examples

import l2.classes.Person


class Department(val name: String = "") {
    enum class Professions(val profName: String) {
        BOSS("Начальник"),
        ADMIN("Системный администратор"),
        PROGER("Программист"),
        OPERATOR("Оператор"),
        SVYAZIST("Связист")
    }

    // перечислим все профессии
    fun printAllProfs() {
        println("В ${name} прописаны следующие проффессии:")
        Professions.values().forEach { println("- ${it.profName} [${it.name}]") }
    }

}




fun main() {
    val d = Department("БАСУПиИБ")
    d.printAllProfs()
}
