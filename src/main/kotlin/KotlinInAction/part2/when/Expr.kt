package KotlinInAction.part2.`when`

import java.beans.Expression
import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
class Minus(val left: Expr, val right: Expr) : Expr
class Multiply(val left: Expr, val right: Expr) : Expr
class Divide(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when {
        e is Num -> e.value
        e is Sum -> eval(e.left) + eval(e.right)
        e is Minus -> eval(e.left) - eval(e.right)
        e is Divide -> eval(e.left) / eval(e.right)
        e is Multiply -> eval(e.left) * eval(e.right)

        else -> throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLog(e: Expr): Int =
    when {
        e is Num -> {
            println("num: ${e.value}")
            e.value
        }
        e is Sum -> {
            val left= evalWithLog(e.left)
            val right= evalWithLog(e.right)
            println("sum: $left + $right = ${left + right}")
            left+right
        }
        e is Minus ->{
            val left= evalWithLog(e.left)
            val right= evalWithLog(e.right)
            println("minus: $left - $right= ${left - right}")
            left-right
        }
        e is Divide ->  {
            val left= evalWithLog(e.left)
            val right= evalWithLog(e.right)
            println("devide: $left / $right = ${left / right}")
            left/right
        }
        e is Multiply ->  {
            val left= evalWithLog(e.left)
            val right= evalWithLog(e.right)
            println("multiply: $left * $right= ${left * right}")
            left*right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(
        eval(
            Divide(
                Multiply(
                    Minus(
                        Sum(
                            Sum(
                                Num(4),
                                Num(5)
                            ), Num(1)
                        ), Num(4)
                    ), Num(4)
                ), Num(3)
            )
        )
    )


    println(
        evalWithLog(
            Divide(
                Multiply(
                    Minus(
                        Sum(
                            Sum(
                                Num(4),
                                Num(5)
                            ), Num(1)
                        ), Num(4)
                    ), Num(4)
                ), Num(3)
            )
        )
    )



}



