package l2.enums

// Во франции есть Cru вина деляться на Cru(80%), Premier(90%), Grand(100%)
//
enum class Cru(val level: Int) {
    CRU(80), PREMIER(90), GRAND(100);

    // переопредлим функцию toString
    override fun toString() = when (this) {
        CRU -> "Base CRU"
        PREMIER -> "Premier CRU"
        GRAND -> "Grand CRU"
    }
}




fun main() {
    println(Cru.PREMIER)
    //-----------------------------------
    val cru = Cru.valueOf("GRAND")
    println(cru)
    //-----------------------------------
    Cru.values().forEach {
        println("""Enum '${it.name}' ->  ${it.level} =$it""")
    }
}