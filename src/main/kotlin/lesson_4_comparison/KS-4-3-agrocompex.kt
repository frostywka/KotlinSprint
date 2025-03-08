package org.example.lesson_4_comparison

const val IS_WEATHER_SUNNY: Boolean = true
const val IS_TENT_OPEN = true
const val HIMIDITY = 20
const val SEASON = "Не Зима"

fun main() {

    val check = IS_WEATHER_SUNNY === true && IS_TENT_OPEN === true && HIMIDITY === 20 && SEASON === "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? : $check ")
}