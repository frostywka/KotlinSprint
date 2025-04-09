package org.example.lesson_12_constructor_init.KS_12_1_weather

class Weather {
    var tempDay = 0
    var tempNight = 0
    var isPrecipitation: Boolean? = null

    fun info() {
        println("Температура днем $tempDay,Температура ночью $tempNight, наличие остадков $isPrecipitation")
    }
}

fun main() {
    val weather1 = Weather()
    weather1.tempDay = 15
    weather1.tempNight = 4
    weather1.isPrecipitation = true

    val weather2 = Weather()
    weather2.tempDay = 20
    weather2.tempNight = 8
    weather2.isPrecipitation = false

    weather1.info()
    weather2.info()
}
