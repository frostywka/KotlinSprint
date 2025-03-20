package org.example.lesson_7_for

fun main() {
    val numbers = 1000..9999
    val generateCode = numbers.random()
    println("КОД авторизации из СМС: $generateCode")

    do {
        println("Введите ваш код для авторизации")
        val inputCode = readln().toInt()

    } while (generateCode != inputCode)
    println("Код подошел")
}



