package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

class User {
    val login = "Hello"
    private val password = "World"

    fun checkPassword(inputPassword: String): Boolean {
        return inputPassword == password
    }
}

fun main() {
    val user = User()
    val inputPassword = "World"

    if (user.checkPassword(inputPassword)) {
        println("Пароль введен Верно")
    } else {
        println("Пароль введен не Верно")
    }

}