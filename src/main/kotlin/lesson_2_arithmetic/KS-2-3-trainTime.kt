package org.example.lesson_2_arithmetic

import kotlin.concurrent.timer


/*
. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

fun main() {

    val startTimeHours = 9
    val startTimeMinutes = 39
    val travelTime = 457

    val totalMinutes = startTimeHours * 60 + travelTime + startTimeMinutes
    val arrivalTimeHours = (totalMinutes / 60) % 24
    val arrivalTimeMinutes = totalMinutes % 60

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