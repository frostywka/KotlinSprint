package org.example.lesson_9_list

fun main() {
    val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
    println(mutableList)

    mutableList.add(42)
    println(mutableList)

    println(mutableList.isEmpty())
    println(mutableList.isNotEmpty())

    println("Индекс")
    println(mutableList.indexOf(42))
    println(mutableList.lastIndexOf(42))

    println("forEACH")
    mutableList.forEach {
        println(it)
    }

    val numbers = listOf(1, 2, 4, 5, 2, 1)
    val allNumbers = numbers.map { it * it }.sorted()

    println(allNumbers)
    println(allNumbers.reversed())
    println(allNumbers.filter {
        it == 1
    })

    /*
    Если используется интервал, следует использовать цикл for.
    Если используется коллекция, типа списка, то следует использовать forEach.
    Если есть необходимость использовать операторы continue или break, то удобнее всего делать это в цикле for.
     */
}
