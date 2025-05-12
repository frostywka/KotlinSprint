package org.example.lesson_15_interface_abstract

interface Search {
    fun startSearch() {
        println("Выполняется поиск")
    }
}

open class Products(val name: String, val quantity: Int)

class Instrument(
    name: String,
    quantity: Int
) : Search, Products(name, quantity)

class Accessories(
    name: String,
    quantity: Int
) : Products(name, quantity)

fun main() {

    val instrument = Instrument("Guitar", 9)
    instrument.startSearch()
}