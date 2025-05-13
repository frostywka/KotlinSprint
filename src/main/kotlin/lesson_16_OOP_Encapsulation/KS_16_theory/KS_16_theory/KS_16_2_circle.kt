package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

private const val PI = 3.14

class Circle(private val radius: Double = 7.0) {

    fun areaCircle() {
        val area = PI * radius * radius
        println("Площадь круга равна: $area")
    }

    fun perimeterCircle() {
        val perimeter = 2 * PI * radius
        println("Периметр круга равен $perimeter")

    }
}

fun main() {

    val circle = Circle()
    circle.areaCircle()
    circle.perimeterCircle()
}