package org.example.lesson_9_list

const val YES = "да"
const val NEW_INGREDIENT = "банан"

fun main() {
    val ingredients = mutableListOf("яблоко", "груша", "киви")
    println("В рецепте есть базовые ингредиенты: $ingredients")

    println("Желаете добавить еще?")
    val answer = readln()
    if (YES.equals(answer, ignoreCase = true)) {
        println("Какой ингредиент хочешь добавить?")
        println("добавить ингредиент $NEW_INGREDIENT")
    } else {
        return
    }

    ingredients.add(NEW_INGREDIENT)
    ingredients.forEach {
        println("Теперь в рецепте есть следующие ингредиенты: [$it]")
    }

}