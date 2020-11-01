package libBas
/*
* Add String left and right '=' symbols
* */
fun separTheme(theme: String, length: Int=40) =
   println(theme.padStart(length + theme.length, '=').padEnd(2 * length + theme.length , '='))

