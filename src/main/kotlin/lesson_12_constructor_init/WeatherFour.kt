package org.example.lesson_12_constructor_init

class WeatherFour(val daysTemp: Int, var nightsTemp: Int, val weatherPrecipitation: Boolean) {

    init {
        println("Температура днем $daysTemp в Цельсиях,Температура ночью $nightsTemp в Цельсиях, наличие остадков $weatherPrecipitation")
    }
}

fun main() {
    val weather1 = WeatherFour(30, 15, true)
    val weather2 = WeatherFour(20, 10, false)
}