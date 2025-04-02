package org.example.lesson_9_list

fun main() {
    println("Введи в строчку список ингредиентов :")

    val mutableList = readln().split(", ").sorted()

    mutableList.forEach {
        println(it)
    }

}