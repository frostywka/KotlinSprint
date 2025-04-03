package org.example.lesson_9_list

const val COUNT = 5

fun main() {

    println("Введите название 5 ингредиентов: ")
    var ingredient: String
    val set = mutableSetOf<String>()

    for (i in 0 until COUNT) {
        ingredient = readln()
        set.add(ingredient)
    }

    val sortSet = set.sorted().toMutableList()
    sortSet[0] = sortSet[0].replaceFirstChar { it.uppercase() }

    println(sortSet)
}