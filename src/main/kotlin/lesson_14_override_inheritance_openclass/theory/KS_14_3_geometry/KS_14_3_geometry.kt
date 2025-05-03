package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_3_geometry

const val PI = 3.14

abstract class Figure(
    val color: String,
) {
    abstract fun calculatingArea()
    abstract fun calculatingPerimeter()
}

abstract class Circle(
    color: String,
    val radius: Int = 5,
) : Figure(color) {

    override fun calculatingArea() {
       val calculatingArea = PI * radius * radius
    }
}

abstract class Triangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {

    override fun calculatingPerimeter() {
        val calculatingPerimeter = width * height
    }

}

fun main() {

}