package org.example.lesson_2_arithmetic

const val MIN_IN_HOUR = 60
const val HOUR_IN_DAY = 24

fun main() {

    val startTimeHours = 9
    val startTimeMinutes = 39
    val travelTime = 457

    val totalMinutes = startTimeHours * MIN_IN_HOUR + travelTime + startTimeMinutes
    val arrivalTimeHours = (totalMinutes / MIN_IN_HOUR) % HOUR_IN_DAY
    val arrivalTimeMinutes = totalMinutes % MIN_IN_HOUR

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