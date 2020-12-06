package l3.calc.over

interface Clickable {
    fun click()
}

/*ƒл€ наследовани€ необходимо объ€вл€тькласс как Open*/
open class RichButton() : Clickable {

   // final override fun click() {}      // final - нельз€ override

    override fun click() {               // override - можно override
        println(javaClass.simpleName + " Click")
    }

    open fun disable() {                 //есть open  - можно override
        println(javaClass.simpleName + " fun Disable")
    }

    fun focus() {                        // нет open  - нельз€ override
        println(javaClass.simpleName + " fun Focus")
    }

}

class AnimatedButton() : RichButton() {
    override fun click() {
        println(javaClass.simpleName + " Click")
    }

    override fun disable() {
        println(javaClass.simpleName + " fun  Disable")
    };
}


fun main() {
    val r = RichButton();
    r.click()
    r.disable()
    val a = AnimatedButton()
    a.click()
    a.disable()
}