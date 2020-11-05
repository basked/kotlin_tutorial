package l2.ui

//Первый интерфейс
interface View {
    fun click() // нужно переопредялть
    fun whoAmI() = println("I'm a view!") // можно переопредять
}

//Первый интерфейс
interface Shape {
    fun whoAmI() = println("I'm a shape")
}

// Первый клас которые наследуется от View
class Button : View, Shape {
    override fun click() {
        println("Button Click")
    }
    override fun whoAmI(){
      super<Shape>.whoAmI()
      super<View>.whoAmI()
    }

}

// Второй клас которые наследуется от View
class TextView : View {
    override fun click() {
        println("TextView Click")
    }

    override fun whoAmI() {
        println("I'm a textView!")
    }
}


fun main() {
//    val b = Button()
//    b.click()
//    b.whoAmI()
    val list: List<View> = mutableListOf(Button(), TextView())
    for (l in list) {
        l.click()
        l.whoAmI()
    }

}