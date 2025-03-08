package org.example.lesson_2_arithmetic

const val DENOMINATOR_FOR_PERCENT = 100f

fun main() {
    val krystal = 7
    val iron = 11
    val percent = 20
    val buff = percent / DENOMINATOR_FOR_PERCENT

    val krystalUnderBuff: Int = ((krystal * buff).toInt())
    val ironUnderBuff: Int = (iron * buff).toInt()

    println(
        """
        Количество кристалов получаемых "сверху" под бафом: $krystalUnderBuff
        Количество руды получаемой "сверху" под бафом: $ironUnderBuff
    """.trimIndent()
    )

}