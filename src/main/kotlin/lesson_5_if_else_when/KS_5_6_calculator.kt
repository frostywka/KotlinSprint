package org.example.lesson_5_if_else_when

const val CENTIMETER_IN_METR = 100

fun main() {

    println("Введите ваш вес:")
    val myWeigth = readln().toDouble()
    println("Введите ваш Рост в сантиметрах:")
    val myHeight = readln().toFloat()

    val heightFromSmToMetr = myHeight / CENTIMETER_IN_METR
    val formulaImt = myWeigth / (heightFromSmToMetr * heightFromSmToMetr)

    val myIMT = when {
        formulaImt < 18.5 -> "Недостаточная масса тела"
        18.5 <= formulaImt && formulaImt < 25 -> "Нормальная масса тела"
        25 <= formulaImt && formulaImt < 30 -> "Избыточная масса тела"
        formulaImt >= 30 -> "Ожирение"
        else -> "вы умерли"
    }
    println(
        """
        Ваш ИМТ равен - ${String.format("%.2f", formulaImt)}
        $myIMT
    """.trimIndent()
    )

}