package l3.calc.over

interface Clickable {
    fun click()
}

/*��� ������������ ���������� �������������� ��� Open*/
open class RichButton() : Clickable {

   // final override fun click() {}      // final - ������ override

    override fun click() {               // override - ����� override
        println(javaClass.simpleName + " Click")
    }

    open fun disable() {                 //���� open  - ����� override
        println(javaClass.simpleName + " fun Disable")
    }

    fun focus() {                        // ��� open  - ������ override
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