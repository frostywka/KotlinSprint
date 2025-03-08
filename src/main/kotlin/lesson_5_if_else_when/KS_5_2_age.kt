package org.example.lesson_5_if_else_when

const val CURRENT_YEAR = 2025
const val ADULT = 18

fun main() {

    val userBirthdayYear = readln().toInt()
    val checkBirthday = CURRENT_YEAR - userBirthdayYear

    if (checkBirthday >= ADULT) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран приложения, так как доступ ограничен для вашего возраста")
    }
}