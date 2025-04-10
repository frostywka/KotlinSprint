package org.example.lesson_12_constructor_init.KS_12_2_weatherTwo

class WeatherTwo(_dayTemp: Int, _nightTemp: Int, _osadki: Boolean) {
    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var osadki = _osadki

    fun info() {
        println("Температура днем $dayTemp,Температура ночью $nightTemp, наличие остадков $osadki")
    }
}

fun main() {
    val weather1 = WeatherTwo(15,4,true)
    val weather2 = WeatherTwo(20,8,false)

    weather1.info()
    weather2.info()
}
