package org.example.lesson_4_comparison

const val MIN_CREW = 55
const val MAX_CREW = 75
const val BOX = 50

fun main() {

    println("корабль имеет повреждений? true/false ")
    val isDamageInput = readln().toBoolean()

    println("Количество экипажа: Int ")
    val crewInput = readln().toInt()

    println("Количество ящиков на борту: Int ")
    val boxInput = readln().toInt()

    println("Погода: ")
    val isWeatherInput = readln().toBoolean()

    val isDamage = isDamageInput == true || isDamageInput == false
    val isCrew = crewInput in MIN_CREW..MAX_CREW
    val isBox = BOX < boxInput
    val isWeather = true == isWeatherInput || false == isWeatherInput

    val check = isDamage && isCrew && isBox && isWeather

    println("Кораблю разрешено выплыть: $check")

}