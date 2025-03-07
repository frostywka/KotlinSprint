package lesson_2_arithmetic

fun main() {

    val quantity = 4
    val studentOneGrade = 3
    val studentTwoGrade = 4
    val studentThreeGrade = 3
    val studentFourGrade = 5

    val arithmeticMean = ((studentOneGrade + studentTwoGrade + studentThreeGrade + studentFourGrade).toFloat() / quantity)
    println(arithmeticMean)
}