package org.example.lesson_6_while_do_while

fun main() {

    println("Введите кол-во секунд, которое надо засечь:")
    var second = readln().toInt()
    val save = second

    while (second > 0 )  {
        println("ТИК-ТАК")
        Thread.sleep(1000)
        second--
    }
    println("Прошло $save секунд")


}