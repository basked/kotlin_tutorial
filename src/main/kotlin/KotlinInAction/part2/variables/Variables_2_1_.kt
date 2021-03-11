package KotlinInAction.part2.variables

import libBas.separTheme

fun main(args: Array<String>) {
    separTheme("ќбект можно мен€ть ссылку val нельз€")
    val age: Int;
    val name: String
    age = 29
    name = if (age < 30) {
        "Yang"
    } else {
        "Old"
    }
    println(name)  //Yang
    separTheme("ќбект можно мен€ть ссылку val нельз€")

    val colors = arrayListOf("Red")
    colors.add("Blue") // [Red, Blue]
    println(colors)

    var color="Yelow"
    // color=535 The integer literal does not conform to the expected type String
    separTheme("var обект $color можно мен€ть , его тип String на Int мен€ть нельз€")
     color="Yelow"
      color=535.toString()
    separTheme("var обект $color можно мен€ть если конвертированть новый тип в инициализиции")
    separTheme("—трока в строке, привет  ${if  (args.size  >  0)  args[0]  else  "basked"}!")

}