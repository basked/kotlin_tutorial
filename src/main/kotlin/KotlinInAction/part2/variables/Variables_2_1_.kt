package KotlinInAction.part2.variables

import libBas.separTheme

fun main(args: Array<String>) {
    separTheme("����� ����� ������ ������ val ������")
    val age: Int;
    val name: String
    age = 29
    name = if (age < 30) {
        "Yang"
    } else {
        "Old"
    }
    println(name)  //Yang
    separTheme("����� ����� ������ ������ val ������")

    val colors = arrayListOf("Red")
    colors.add("Blue") // [Red, Blue]
    println(colors)

    var color="Yelow"
    // color=535 The integer literal does not conform to the expected type String
    separTheme("var ����� $color ����� ������ , ��� ��� String �� Int ������ ������")
     color="Yelow"
      color=535.toString()
    separTheme("var ����� $color ����� ������ ���� ��������������� ����� ��� � �������������")
    separTheme("������ � ������, ������  ${if  (args.size  >  0)  args[0]  else  "basked"}!")

}