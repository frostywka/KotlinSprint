package org.example.lesson_12_constructor_init.KS_12_5_weatherSuper

const val QUANTITY = 30

class WeatherSuper(var daysTemp: Int, var nightsTemp: Int, var weatherPrecipitation: Boolean)

fun main() {

    val listOfWeather = mutableListOf<WeatherSuper>()

    for (i in 1..QUANTITY) {
        val tempDay = (1..40).random()
        val tempNight = (1..40).random()
        val isPrecip = listOf(true, false).random()
        val weatherSuper = WeatherSuper(tempDay, tempNight, weatherPrecipitation = isPrecip)
        listOfWeather.add(weatherSuper)
    }

    listOfWeather.forEach {
        println("дневная температура ${it.daysTemp}, ночная ${it.nightsTemp}, осадки ${it.weatherPrecipitation}")
    }

    println("---------вывод температуры-------")
    val allTemp = listOfWeather.map {
        listOf(it.daysTemp, it.nightsTemp)
    }

    val daysWithPrecipitation = listOfWeather.count {
        it.weatherPrecipitation
    }
    println("Количество дней с осадками = $daysWithPrecipitation")

    allTemp.forEach { temp ->
        println("дневная температура ${temp[0]}, ночная ${temp[1]}")
    }

    val averageDayTemp = listOfWeather.map {
        it.daysTemp
    }.average()

    val averageNightTemp = listOfWeather.map {
        it.nightsTemp
    }.average()

    println("Средняя дневная температура $averageDayTemp")
    println("Средняя ночная температура $averageNightTemp")
}
