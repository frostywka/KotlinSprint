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

    open fun allInfo(){
        println("Имя: $name, кол-во пассажиров: $numberOfPassengers, скорость: $speed, грузоподъемность: $loadCapacity")
    }

    open fun loadingType(){
        println("Имя: $name: выдвигает горизонтальный трап со шкафута")
    }

}