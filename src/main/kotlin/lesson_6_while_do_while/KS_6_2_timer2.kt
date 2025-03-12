package org.example.lesson_6_while_do_while

fun main() {

    println("Введите кол-во секунд, которое надо засечь:")
    var second = readln().toInt()

    while (second > 0) {
        println("Осталось секунд: $second")
        Thread.sleep(1000)
        second--
    }
    println("Время вышло")

}