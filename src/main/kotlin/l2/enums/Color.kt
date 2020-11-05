package l2.enums

enum class Color
    (val r:Int=0,val g:Int=0,val b:Int=0){
    //если есть конструктор то нужно определить и в самом цвете
    RED(255,0,0), GREEN(0,255,0), BLUE(0,0,255);
    // произвольная функция в класс перечисления
    fun rgb()=r*256*256+g*256+b

}

fun main() {

}