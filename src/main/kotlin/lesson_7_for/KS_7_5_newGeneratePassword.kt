package org.example.lesson_7_for

fun main() {
    println("Введите длину желаемого пароля, минимальная длина 6 символов: ")
    val length = readln().toInt()
    val numbers = 0..9
    val lower = 'a'..'z'
    val uppper = 'A'..'Z'

    var newPassword = ""

// решение 1
    val password = numbers + lower + uppper
    val size = password.shuffled().take(length).joinToString("")
    println("Пароль $size через решение номер 1")

// решение 2
    for ( i in length downTo 1){
        newPassword += (password).random()
    }
    println("Пароль $newPassword через решение номер 2")
}