package org.example.lesson_5_if_else_when

fun main() {

    val inputResult = readln().toInt()
    val result = 2 + 2

    val check = if (inputResult == result) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен"
    }
    println(check)

}