package org.example.lesson_5_if_else_when

/*
Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
 Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.
 Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных.
 Оформить ввод текстовыми подсказками о том, что нужно вводить.
  Вывести отдельным сообщением, какие числа были нужны для победы.

- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
- если не угадано ничего, вывести “Неудача!”;
- программа должна учитывать ввод чисел в обратном порядке.
 */

const val WIN_NUMBER_ONE = 8
const val WIN_NUMBER_TWO = 19

fun main() {

    println("Введите второе число:")
    val secondNumber = readln().toInt()
    println("Введите первое число:")
    val firstNumber = readln().toInt()

    val isWinCombination = firstNumber == WIN_NUMBER_ONE && secondNumber == WIN_NUMBER_TWO || firstNumber == WIN_NUMBER_TWO && secondNumber == WIN_NUMBER_ONE
    val isCalmingCombination = firstNumber == WIN_NUMBER_ONE || secondNumber == WIN_NUMBER_TWO || firstNumber == WIN_NUMBER_TWO || secondNumber == WIN_NUMBER_ONE

    if (isWinCombination) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (isCalmingCombination) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

}