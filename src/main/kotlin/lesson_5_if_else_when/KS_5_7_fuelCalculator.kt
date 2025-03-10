package org.example.lesson_5_if_else_when

const val HUNDRED_KILOMETER = 100

fun main() {
    println("Введите расстояние:")
    val distance = readln().toFloat()
    println("Введите Расход топлива на 100 км (в литрах):")
    val fuelСonsumption = readln().toFloat()
    println("Введите стоимость бензина за Литр:")
    val fuelPriceByLiter = readln().toFloat()

    val totalFuel = (distance * fuelСonsumption) / HUNDRED_KILOMETER
    val totalFuelPrice = totalFuel * fuelPriceByLiter

    println(
        """
        Общее кол-во необходимого топлива для поездки: ${String.format("%.2f", totalFuel)}
        Итоговая стоимость поездки: ${String.format("%.2f", totalFuelPrice)}
    """.trimIndent()
    )


}