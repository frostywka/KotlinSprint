package org.example.work

fun main() {

    val numbers = arrayOf(7, 4, 3, 8, 3)
    val square = numbers.map { it * it }.toTypedArray()

    println(square.sorted()) // базовый метод
    println(numbers.reversed()) // базовый метод

    for (i in square.indices) {
        for (j in 0 until (square.size - 1 - i)) {
            if (square[j] > square[j + 1]) {
                val temp = square[j]
                square[j] = square[j + 1]
                square[j + 1] = temp

            }
        }
    }
    println(square.joinToString(prefix = "[", postfix = "]"))
}