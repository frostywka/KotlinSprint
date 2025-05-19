package org.example.lesson_17_setters_getters

class Ship(
    val nameParam: String,
    val middleSpeedParam: Double,
    val portParam: String,
) {
    var name = nameParam
        get() = field
        set(value) {
            field = "Поле с Именем - Неизменно"
        }
}

fun main() {

    val ship = Ship("FireFlight", 4000.24, "BlackStar")
    println("Оригинальное название корабля ${ship.name}")
    ship.name = "Sokol"
    println("При попытке изменить имя имя корабля стало: ${ship.name}")

}