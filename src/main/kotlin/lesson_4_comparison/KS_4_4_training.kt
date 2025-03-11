package org.example.lesson_4_comparison

fun main() {

    val trainingDay = 5
    val isEvenDay = ((trainingDay % 2) == 0)

    val evenTrainingDay = isEvenDay
    val oddTrainingDay = !isEvenDay

    println(
        """
        Упражнения для рук:    $evenTrainingDay
        Упражнения для ног:    $oddTrainingDay
        Упражнения для спины:  $oddTrainingDay
        Упражнения для пресса: $evenTrainingDay
        
    """.trimIndent()
    )

}