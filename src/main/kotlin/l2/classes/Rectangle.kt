package l2.classes

class Rectangle(val height: Int, val width: Int) {
    // создадим свойство(свойства не требуют инициализации)
    val isSquare: Boolean
        get() = height == width
    val area: Int
        get() = height * width
    var depth:Int=0
    set(value:Int){
        println("Old $field new $value")
        field = value
    }
}
fun main() {
    println(Rectangle(50, 50).isSquare)
    println(Rectangle(50, 50).area)
    val r=Rectangle(50, 50)
    r.depth=10;
}
