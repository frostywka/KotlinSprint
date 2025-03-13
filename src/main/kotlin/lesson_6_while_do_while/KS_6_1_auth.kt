package org.example.lesson_6_while_do_while

const val LOGIN = "hello"
const val PASSWORD = "world"

fun main() {

    do {
        println("Введите логин и пароль:")
        var login = readln()
        var password = readln()
    } while (login != LOGIN || password != PASSWORD)
    println("Авторизация прошла успешно")

}