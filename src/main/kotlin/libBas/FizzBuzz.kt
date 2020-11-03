package libBas

// делится на 3 -> Fizz
// делится на 5 -> Buzz
// делится на 3 и 5 -> FizzBuzz
fun fizzBuzz(data: Int)=when {
        // первым проверяем двойное условие
        (data % 3) == 0 && (data % 5) == 0 ->  "$data: FizzBuzz"
        (data % 3) == 0 -> "$data: Fizz"
        (data % 5) == 0 ->  "$data: Buzz"
        else ->  "$data:"
}
fun main(){
    for (i in 1..30){
      println(  fizzBuzz(i))
    }
}
