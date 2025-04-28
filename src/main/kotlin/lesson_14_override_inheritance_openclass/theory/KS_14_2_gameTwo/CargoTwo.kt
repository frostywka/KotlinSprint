package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_2_gameTwo

class CargoTwo(
    name: String,
    numberOfPassengers: Int,
    speed: Int,
    loadCapacity: Int,
): LinerTwo(name, numberOfPassengers, speed, loadCapacity) {

    override fun allInfo(){
        println("Имя: $name, кол-во пассажиров: $numberOfPassengers, скорость: $speed, грузоподъемность: $loadCapacity")
    }

    override fun loadingType(){
        println("Имя: $name: активирует погрузочный кран")
    }

}