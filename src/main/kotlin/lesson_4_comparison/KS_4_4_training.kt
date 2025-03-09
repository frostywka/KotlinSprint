package org.example.lesson_4_comparison

const val IS_TRAINING_FOR_HANDS_AND_PRESS: Boolean = true
const val IS_TRAINING_FOR_LEGS_AND_BACK: Boolean = true

fun main() {

    var trainingDay = 5

    val evenTrainingDay = trainingDay == 5 && IS_TRAINING_FOR_HANDS_AND_PRESS == true
    val oddTrainingDay = trainingDay == 6 && IS_TRAINING_FOR_LEGS_AND_BACK == true

    println(
        """
        Упражнения для рук:    $evenTrainingDay
        Упражнения для ног:    $oddTrainingDay
        Упражнения для спины:  $oddTrainingDay
        Упражнения для пресса: $evenTrainingDay
        
    """.trimIndent()
    )
}