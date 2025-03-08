package org.example.lesson_4_comparison

fun main() {
    val isTrainingForHandsAndPress: Boolean = true
    val isTrainingForLegsAndBack: Boolean = true

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