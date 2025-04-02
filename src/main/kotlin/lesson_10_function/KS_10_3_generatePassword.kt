package org.example.lesson_10_function

fun main() {
    println("Задайте длину пароля:")
    val lengthPassword = readln().toInt()

    generatePassword(lengthPassword)
}

fun generatePassword(lengthPassword: Int) {
    val number = 0..9
    val symbols = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/')
    var newPassword: String = ""

    for (i in 0..lengthPassword) {
        if (i % 2 == 0) {
            newPassword += number.random()
        } else {
            newPassword += symbols.random()
        }
    }
    println(newPassword)
}