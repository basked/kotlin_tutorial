package other

class StaticsMethods {
    companion object{
        fun getName(){
          println(javaClass.name)
        }
    }
}


fun main() {
    StaticsMethods.getName()
}