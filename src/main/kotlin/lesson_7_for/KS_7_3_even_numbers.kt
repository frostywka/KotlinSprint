package org.example.lesson_7_for

fun main() {
    println("ввести число:")
    val number = readln().toInt()

    for (i in 0..number) {
        if (i == 0) {
            continue
        } else if (i % 2 == 0) {
            println(i)
        }
    }
}
