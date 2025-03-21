package org.example.lesson_7_for

fun main() {
    println("Введите кол-во секунд для отчета:")
    val second = readln().toInt()

    for (i in second downTo 1) {
            println("Осталось до конца $i секунд")
        }
    println("Время вышло")
}


