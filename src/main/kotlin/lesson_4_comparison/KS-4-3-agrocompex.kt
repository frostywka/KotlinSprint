package org.example.lesson_4_comparison

const val isWeatherSunny: Boolean = true
const val isTentOpen = true
const val himidity = 20
const val season = "Не Зима"

fun main() {

    val check = isWeatherSunny === true && isTentOpen === true && himidity === 20 && season === "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? : $check ")
}