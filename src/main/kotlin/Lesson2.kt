class Person(val firstName:String, val age:Int){
    fun getFullInfo(){
        println("FirstName=${this.firstName}, age=${this.age}")
    }

}
fun main(){
   val p=Person("\"basked\"", 35)
    p.getFullInfo()
}