package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_2_gameTwo

class IcebreakerTwo (
    name: String,
    numberOfPassengers: Int,
    speed: Int,
    loadCapacity: Int,
): LinerTwo(name, numberOfPassengers, speed, loadCapacity,breakingIce = true) {

    override fun allInfo(){
        println("Имя: $name, кол-во пассажиров: $numberOfPassengers, скорость: $speed, грузоподъемность: $loadCapacity")
    }

    override fun loadingType(){
        println("Имя: $name: открывает ворота со стороны кормы")
    }
}