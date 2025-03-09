package org.example.lesson_5_if_else_when

fun main() {

    val randomA = (0..42).random()
    val randomB = (0..42).random()
    val randomC = (0..42).random()

    println("Введите 3 победных числа для участия в лотереи из диапазона от 0 до 42 :")

    val inputA = readln().toInt()
    val inputB = readln().toInt()
    val inputC = readln().toInt()

    val listOfRandom = listOf(randomA, randomB, randomC)
    val listOfInput = listOf(inputA, inputB, inputC)

    val checkNumbers = listOfRandom.intersect(listOfInput.toSet()).size

    if (checkNumbers == 3) {
        println("Вы выиграли ДЖЕКПОТ. Список выигрышных комбинация $listOfRandom")
    } else if (checkNumbers == 2) {
        println("Два совпадения и Вы получаете крупный приз. Список выигрышных комбинация $listOfRandom")
    } else if (checkNumbers == 1) {
        println("ОДНО совпадение и Вы получаете утешительный приз. Список выигрышных комбинация $listOfRandom")
    } else {
        println(
            """
            Нет совпадений, Вы ничего не выиграли
            Список выигрышных комбинация $listOfRandom
            Список Ваших комбинация $listOfInput
            Решение через If Else
        """.trimIndent()
        )
    }

    println("-----------------------------")

    val examination = when (checkNumbers) {
        3 -> "Вы выиграли ДЖЕКПОТ"
        2 -> "Два совпадения и Вы получаете крупный приз"
        1 -> "ОДНО совпадение и Вы получаете утешительный приз"
        else -> "Нет совпадений, Вы ничего не выиграли"
    }
    println(
        """
        $examination
        Список выигрышных комбинация $listOfRandom
        Список Ваших комбинация $listOfInput
        Решение через WHEN
    """.trimIndent()
    )

}