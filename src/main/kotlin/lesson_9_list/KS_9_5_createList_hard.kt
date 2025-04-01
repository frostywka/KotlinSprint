package org.example.lesson_9_list

const val COUNT = 5

fun main() {

    println("Введите название 5 ингредиентов: ")
    var ingredient: String
    val list = mutableListOf<String>()

    for (i in 0 until COUNT) {
        ingredient = readln()
        list.add(ingredient)
    }

    val sortList = list.sorted().toMutableList()
    sortList[0] = sortList[0].replaceFirstChar { it.uppercase() }

    println(sortList.distinct())

}