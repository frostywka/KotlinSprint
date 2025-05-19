package org.example.lesson_17_setters_getters

class Ship(
    val nameParam: String,
    val middleSpeedParam: Double,
    val portParam: String,
) {
    var name = nameParam
        set(value) {
            println("Значение неизменно")
        }
}

fun main() {

    val ship = Ship("FireFlight", 4000.24, "BlackStar")
    println("Оригинальное название корабля ${ship.name}")
    ship.name = "Sokol"
    println("При попытке изменить имя имя корабля стало: ${ship.name}")

}