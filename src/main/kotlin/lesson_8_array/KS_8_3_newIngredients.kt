package org.example.lesson_8_array

fun main() {

    val ingredients = arrayOf("яйцо", "картофель", "морковь", "горошек", "огурец", "майонез", "колбаса докторская")
    println("Какой ингредиент оливье вы хотите найти ?")
    val ingredient = readln()

    if (ingredient in ingredients){
        println("Ингредиент [$ingredient] в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}