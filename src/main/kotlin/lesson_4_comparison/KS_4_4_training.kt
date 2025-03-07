package org.example.lesson_4_comparison

const val isTrainingForHandsAndPress: Boolean = true
const val isTrainingForLegsAndBack: Boolean = true

fun main() {

    var trainingDay = 5

    val evenTrainingDay = trainingDay == 5 && isTrainingForHandsAndPress == true
    val oddTrainingDay = trainingDay == 6 && isTrainingForLegsAndBack == true

    println(
        """
        Упражнения для рук:    $evenTrainingDay
        Упражнения для ног:    $oddTrainingDay
        Упражнения для спины:  $oddTrainingDay
        Упражнения для пресса: $evenTrainingDay
        
    """.trimIndent()
    )
}