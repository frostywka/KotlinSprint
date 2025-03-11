package org.example.lesson_4_comparison

const val IS_WEATHER_SUNNY: Boolean = true
const val IS_TENT_OPEN = true
const val HIMIDITY = 20
const val SEASON = "Зима"

fun main() {

    val isWeatherSunnyToday = true
    val isTentOpenToday = true
    val himidityToday = 20
    val seasonToday = "Весна"

    val checkSun = IS_WEATHER_SUNNY == isWeatherSunnyToday
    val checkTent = IS_TENT_OPEN == isTentOpenToday
    val checkHimidity = HIMIDITY == himidityToday
    val checkSeason = SEASON == seasonToday

    val check = checkSun && checkTent && checkHimidity && checkSeason

    println("Благоприятные ли условия сейчас для роста бобовых? : $check ")
}