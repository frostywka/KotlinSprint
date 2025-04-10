package org.example.lesson_12_constructor_init.KS_12_3_weatherThree

const val ONE_CELSIUS_KELVINS = -272

class WeatherThree(_daysTempKelvins: Int, _nightsTempKelvins: Int, _weatherPrecipitationKelvins: Boolean) {
    var daysTemp = _daysTempKelvins+ONE_CELSIUS_KELVINS
    var nightsTemp = _nightsTempKelvins+ONE_CELSIUS_KELVINS
    var weatherPrecipitation = _weatherPrecipitationKelvins

    fun info() {
        println("Температура днем $daysTemp в Цельсиях,Температура ночью $nightsTemp в Цельсиях, наличие остадков $weatherPrecipitation")
    }
}

fun main() {
    val weather1 = WeatherThree(290, 260, true)
    val weather2 = WeatherThree(310, 280, false)

    weather1.info()
    weather2.info()
}