package org.example.lesson_5_if_else_when

const val NUMBER = 2

fun main() {

    val inputResult = readln().toInt()
    val result = NUMBER + NUMBER

    val check = if (inputResult == result) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }
    println(check)

}