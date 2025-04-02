package org.example.lesson_10_function

const val validationLength = 4

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    checkLength(login, password)
}

fun checkLength(login: String, password: String) {
    if (login.length < validationLength || password.length < validationLength){
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Вы можете продолжить регистрацию")
    }

}