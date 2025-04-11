package org.example.lesson_12_constructor_init

class WeatherFour(daysTemp: Int, nightsTemp: Int, weatherPrecipitation: Boolean) {

    init {
        println("Температура днем $daysTemp в Цельсиях, Температура ночью $nightsTemp в Цельсиях, наличие остадков $weatherPrecipitation")
    }
}

fun main() {
    WeatherFour(30, 15, true)
    WeatherFour(20, 10, false)
}