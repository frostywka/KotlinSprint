package org.example.lesson_3_arithmetic

fun main() {

    val quantity = 4
    val studentOneGrade = 3
    val studentTwoGrade = 4
    val studentThreeGrade = 3
    val studentFourGrade = 5

    val arithmeticMean: Float = (((studentOneGrade + studentTwoGrade + studentThreeGrade + studentFourGrade) / quantity).toFloat())
    println(String.format("%.2f".format(arithmeticMean)))
}