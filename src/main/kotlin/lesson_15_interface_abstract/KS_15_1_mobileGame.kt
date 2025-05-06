package org.example.lesson_15_interface_abstract

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class CrucianCarp(val name: String) : Swimming {
    override fun swim() {
        println("$name Тип передвижения: Плаванье")
    }
}

class Seagull(val name: String) : Flying {
    override fun fly() {
        println("$name, Тип передвижения: Полет")
    }
}

class Duck(val name: String) : Swimming, Flying {
    override fun swim() {
        println("$name, Тип передвижения: Плаванье")
    }

    override fun fly() {
        println("$name, Тип передвижения: Полет")
    }
}

fun main() {

    val seagull = Seagull("Чайка")
    seagull.fly()

    val duck = Duck("Утка")
    duck.fly()
    duck.swim()

    val crucianCarp = CrucianCarp("Карась")
    crucianCarp.swim()
}