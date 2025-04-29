package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_2_gameTwo

open class LinerTwo (
    open val name: String = "Лайнер",
    open val numberOfPassengers: Int = 1000,
    open val speed: Int = 5000,
    open val loadCapacity: Int = 100,
    val breakingIce: Boolean = false
) {

    fun morePassengers() {
        println("$name: может вмещать наибольшее кол-во пассажиров")
    }

    open fun showInfo(){
        println("Имя: $name, кол-во пассажиров: $numberOfPassengers, скорость: $speed, грузоподъемность: $loadCapacity")
    }

    open fun printLoadingType(){
        println("Имя: $name: выдвигает горизонтальный трап со шкафута")
    }
}

class CargoTwo(
    name: String,
): LinerTwo(name, numberOfPassengers = 100, speed = 500, loadCapacity = 1000) {

    override fun showInfo() {
        println("Имя: $name, кол-во пассажиров: $numberOfPassengers, скорость: $speed, грузоподъемность: $loadCapacity")
    }

    override fun printLoadingType() {
        println("Имя: $name: активирует погрузочный кран")
    }
}

class IcebreakerTwo (
    name: String,
    numberOfPassengers: Int = 50,
    speed: Int = 100,
    loadCapacity: Int = 50,
): LinerTwo(name, numberOfPassengers, speed, loadCapacity,breakingIce = true) {

    override fun showInfo(){
        println("Имя: $name, кол-во пассажиров: $numberOfPassengers, скорость: $speed, грузоподъемность: $loadCapacity")
    }

    override fun printLoadingType(){
        println("Имя: $name: открывает ворота со стороны кормы")
    }
}

fun main() {

    val liner1 = LinerTwo()
    liner1.morePassengers()
    liner1.showInfo()
    liner1.printLoadingType()
    println()

    val cargo1 = CargoTwo("Грузовой")
    cargo1.showInfo()
    cargo1.printLoadingType()
    println()

    val icebreaker1 = IcebreakerTwo("Ледокол")
    icebreaker1.showInfo()
    icebreaker1.printLoadingType()
}