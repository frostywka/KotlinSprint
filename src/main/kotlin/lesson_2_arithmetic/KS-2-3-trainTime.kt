package org.example.lesson_2_arithmetic

const val minInHour = 60
const val hourInDay = 24

fun main() {

    val startTimeHours = 9
    val startTimeMinutes = 39
    val travelTime = 457

    val totalMinutes = startTimeHours * minInHour + travelTime + startTimeMinutes
    val arrivalTimeHours = (totalMinutes / minInHour) % hourInDay
    val arrivalTimeMinutes = totalMinutes % minInHour

    val formatStartTime = String.format("%02d:%02d", startTimeHours, startTimeMinutes)
    val formatArrivalTime = String.format("%02d:%02d", arrivalTimeHours, arrivalTimeMinutes)

    println(
        """
        Время отправления поезда: $formatStartTime
        Время в пути , в минутах: $travelTime
        Время прибытия: $formatArrivalTime
    """.trimIndent()
    )

}