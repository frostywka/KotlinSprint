package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_1

class Icebreaker(
     name: String,
     numberOfPassengers: Int,
     speed: Int,
     loadCapacity: Int,
): Liner(name, numberOfPassengers, speed, loadCapacity,breakingIce = true) {

    override fun allInfo(){
        println("Имя: $name, кол-во пассажиров: $numberOfPassengers, скорость: $speed, грузоподъемность: $loadCapacity")
    }
}