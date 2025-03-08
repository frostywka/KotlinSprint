package org.example.lesson_5_if_else_when

const val WIN_NUMBER_ONE = 8
const val WIN_NUMBER_TWO = 19

fun main() {

    println("Введите первое число:")
    val firstNumber = readln().toInt()
    println("Введите второе число:")
    val secondNumber = readln().toInt()

    val isWinCombination =
        firstNumber == WIN_NUMBER_ONE && secondNumber == WIN_NUMBER_TWO || firstNumber == WIN_NUMBER_TWO && secondNumber == WIN_NUMBER_ONE
    val isCalmingCombination =
        firstNumber == WIN_NUMBER_ONE || secondNumber == WIN_NUMBER_TWO || firstNumber == WIN_NUMBER_TWO || secondNumber == WIN_NUMBER_ONE

    if (isWinCombination) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (isCalmingCombination) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

}