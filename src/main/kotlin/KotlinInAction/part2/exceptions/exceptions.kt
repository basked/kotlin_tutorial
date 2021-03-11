package KotlinInAction.part2.exceptions

import java.io.BufferedReader
import java.io.FileReader
import java.io.Reader
import java.io.StringReader
import java.lang.NumberFormatException


fun readNumber(reader: BufferedReader): Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}

fun readUniversalNumber(reader: Reader):Int? {
    var resSum:Int=0
    try {
        val line: String
        when (reader) {
            is StringReader -> {
                line =reader.readText()
                resSum=Integer.parseInt(line)
            }
            is BufferedReader -> {
                line = reader.readLine()
                resSum=Integer.parseInt(line)
            }
            is FileReader -> {
                reader.forEachLine {
                    try {
                        resSum += Integer.parseInt(it)
                    }
                    catch (e: NumberFormatException){
                        resSum +=0
                    }
                }
            }
        }
    } catch (e: NumberFormatException) {
       0
    } finally {
        reader.close()
    }
    return resSum
}


fun main() {

    val sReader = BufferedReader(StringReader("23d9"))
    println(readNumber(sReader))
    val fileName =  "D:\\MY_PROJ\\KOTLIN\\kotlin_tutorial\\src\\main\\kotlin\\KotlinInAction\\part2\\exceptions\\data.txt"
    println(readUniversalNumber(FileReader(fileName)))
    println(readUniversalNumber(StringReader("123")))
    println(readUniversalNumber(BufferedReader(StringReader("456"))))
}

