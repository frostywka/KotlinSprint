package org.example.lesson_8_array

const val SIZE_ARRAY = 3

fun main() {
    val array = arrayOf("","","","")

    for (i in 0..SIZE_ARRAY) {
        println("Название ингредиенты №${i+1}:")
        val ingredient = readln()
        println("Название ингредиента №${i+1} [$ingredient]")
        array[i] = ingredient
    }
    for (j in array)
        println(j)
}