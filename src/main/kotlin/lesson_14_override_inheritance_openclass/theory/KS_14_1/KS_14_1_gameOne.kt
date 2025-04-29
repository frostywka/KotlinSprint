package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_1

open class Liner(
    val name: String = "Лайнер",
    val numberOfPassengers: Int = 1000,
    val speed: Int = 5000,
    val loadCapacity: Int = 100,
    val breakingIce: Boolean = false,
) {
}

class Cargo(
    name: String,
): Liner(name, numberOfPassengers = 100, speed = 500, loadCapacity = 1000) {
}

class Icebreaker(
    name: String,
    numberOfPassengers: Int = 50,
    speed: Int = 100,
    loadCapacity: Int = 50,
): Liner(name, numberOfPassengers, speed, loadCapacity, breakingIce = true) {
}

fun main() {

    val liner1 = Liner()
    val cargo1 = Cargo("CargoOne")
    val icebreaker1 = Icebreaker("Ледокол")
}