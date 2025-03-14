package org.example.lesson_6_while_do_while

fun main() {

    println("Введите кол-во секунд, которое надо засечь:")
    val second = readln().toLong() * 1000

    val start = System.currentTimeMillis()
    Thread.sleep(second)
    val delta = System.currentTimeMillis() - start

    println("Прошло ${delta / 1000} секунд")

}