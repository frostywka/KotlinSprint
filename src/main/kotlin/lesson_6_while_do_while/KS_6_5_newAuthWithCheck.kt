package org.example.lesson_6_while_do_while

const val LOGIN1 = "mama"
const val PASSWORD1 = "papa"
const val MAX_COUNT = 3

fun main() {
    val intArray = 1..9
    val number = intArray.random()
    val math = number + number
    var decision: Int
    var count = 0

    do {
        println("Реши пример: $number + $number")
        println("Введи свое решение примера: ")
        decision = readln().toInt()
        if (decision != math) {
            println("Попробуй еще раз")
            count++
        }
    } while (decision != math && count < MAX_COUNT)

    if (decision != math) {
        println("Вы исчерпали максимальное количество попыток.")
        println("Доступ запрещен")
        return
    }

    do {
        println("Введите логин и пароль:")
        var login = readln()
        var password = readln()
    } while (login != LOGIN1 || password != PASSWORD1)
    println("Добро пожаловать")

}
