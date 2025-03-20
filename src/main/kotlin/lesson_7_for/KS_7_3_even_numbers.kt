package org.example.lesson_7_for

fun main() {
    println("ввести число:")
    val number = readln().toInt()

    for (i in 1..number) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
