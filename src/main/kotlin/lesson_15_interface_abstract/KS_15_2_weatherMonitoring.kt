package org.example.lesson_15_interface_abstract

abstract class WeatherStationStats()

class Temperature(val value: Int) : WeatherStationStats()

class PrecipitationAmount(val amount: Int) : WeatherStationStats()

class WeatherServer() {
    fun sendMessage(stat: WeatherStationStats) {
        when (stat) {
            is Temperature -> println("Температура: ${stat.value}С")
            is PrecipitationAmount -> println("Количество осадков: ${stat.amount}мм")
            else -> println("Неизвестные осадки")
        }
    }
}

fun main() {

    val amountRain = PrecipitationAmount(10)
    val temperature = Temperature(25)

    val server = WeatherServer()
    server.sendMessage(amountRain)
    server.sendMessage(temperature)
}