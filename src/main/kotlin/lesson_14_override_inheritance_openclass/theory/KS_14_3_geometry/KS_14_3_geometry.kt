package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_3_geometry

const val WHITE = "white"
const val BLACK = "black"

abstract class Figure(
    val color: String,
) {
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
}

class Circle(
    color: String,
    val radius: Int = 5,
) : Figure(color) {

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Int = 4,
    val height: Int = 5,
) : Figure(color) {

    override fun getArea(): Double {
        return (width * height).toDouble()
    }

    override fun getPerimeter(): Double {
        return (2 * width + 2 * height).toDouble()
    }
}

fun main() {

    val figureList = mutableListOf<Figure>()

    figureList.add(Circle(WHITE, radius = 3))
    figureList.add(Circle(WHITE, radius = 5))
    figureList.add(Rectangle(BLACK, width = 3, height = 6))
    figureList.add(Rectangle(BLACK, width = 4, height = 5))

    var totalBlackPerimeter = 0.0
    var totalWhiteArea = 0.0

    figureList.forEach { figure ->
        when (figure) {
            is Rectangle -> {
                totalBlackPerimeter += figure.getPerimeter()
            }

            is Circle -> {
                totalWhiteArea += figure.getArea()
            }
        }
    }

    println("Сумма периметров всех черных фигур: $totalBlackPerimeter")
    println("Сумма площадей всех белых фигур: $totalWhiteArea")
}