package org.example.lesson_8_array

fun main() {
    val ingredients = arrayOf("яйцо", "картофель", "морковь", "горошек", "огурец", "майонез", "колбаса докторская")
    println("Какой ингредиент оливье вы хотите найти ?")
    val ingredient = readln()

    for (i in ingredients) {
        if (i == ingredient) {
            println("Ингредиент [$i] в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет.")
}


