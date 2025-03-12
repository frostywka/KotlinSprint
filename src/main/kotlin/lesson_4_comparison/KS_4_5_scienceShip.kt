package org.example.lesson_4_comparison

const val MIN_CREW = 55
const val MAX_CREW = 75
const val RECOMMENDATION_CREW = 70
const val BOX = 50

fun main() {

    println("корабль имеет повреждений? (true/false) ")
    val isDamage = readln().toBoolean()

    println("Количество экипажа: Int ")
    val crewInput = readln().toInt()

    println("Количество ящиков на борту: Int ")
    val boxInput = readln().toInt()

    println("Погода Ясная: (true/false)")
    val isWeatherFine = readln().toBoolean()

    val isCrew = crewInput in MIN_CREW..MAX_CREW
    val isBox = BOX < boxInput
    val isRecommendationCrew = RECOMMENDATION_CREW == crewInput

    val checkOne = !isDamage && isCrew && isBox
    val checkTwo = isRecommendationCrew && isWeatherFine && isBox

    val totalCheck = checkOne || checkTwo
    println("$checkOne $checkTwo")

    println("Кораблю разрешено выплыть: $totalCheck")

}
