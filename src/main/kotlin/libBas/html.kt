package libBas

fun html1(){
    val htmlText= "<html><head>Heading</head><body><div><p>Block <b>div1</div><div>Block div2</div></body></html>"
    val regExp="""<[^>]+>"""
    val found =regExp.toRegex().findAll(htmlText)
    for (gr in found){
        println(gr.value)
    }
}
fun main() {
    html1()
}