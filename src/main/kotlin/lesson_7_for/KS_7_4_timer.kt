package org.example.lesson_7_for

fun main() {
    println("Введите кол-во секунд для отчета:")
    val second = readln().toInt()

    for (i in second downTo 0) {
        if (i != 0) {
            println("Осталось до конца $i секунд")
        }
    }
    println("Время вышло")
}


