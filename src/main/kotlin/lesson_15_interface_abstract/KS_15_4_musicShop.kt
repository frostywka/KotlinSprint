package org.example.lesson_15_interface_abstract

interface Search {
    fun startSearch() {
//        println("Выполняется поиск") // можно так, а можно с реализацией через класс(лучше через класс)
//    }
    }

    open class Products(val name: String, val quantity: Int)

    class Instrument(
        name: String,
        quantity: Int
    ) : Search, Products(name, quantity) {
        override fun startSearch() {
            println("Выполняется поиск")
        }
    }

    class Accessories(
        name: String,
        quantity: Int
    ) : Products(name, quantity)

    fun main() {

        val instrument = Instrument("Guitar", 9)
        instrument.startSearch()
    }
}