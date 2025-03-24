package org.example.lesson_9_list

fun main() {
    val ingredients = listOf("картошка","яйцо","морковь","огурец","колбаса")

    ingredients.forEach {
        println("В рецепте есть следующие ингредиенты: [$it]")
    }
}