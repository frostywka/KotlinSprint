package org.example.lesson_9_list

fun main() {
    val listOfIngredientsForOnePortion = listOf(2, 50, 15)

    println("Сколько порций необходимо приготовить?")
    val quantity = readln().toInt()

    val totalIngredients = listOfIngredientsForOnePortion.map {
        it * quantity
    }

    println("На [$quantity] порций вам понадобится: Яиц ${totalIngredients[0]}шт, молока - ${totalIngredients[1]}мл, сливочного масла - ${totalIngredients[2]}гр")

}