package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_3_geometry

const val PI = 3.14

abstract class Figure(
    val color: String,
) {
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
}

class White(
    color: String,
    val radius: Int = 5,
) : Figure(color) {

    override fun getArea(): Double {
        return PI * radius * radius
    }

    override fun getPerimeter(): Double {
        return 2 * PI * radius
    }
}

class Black(
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

    val colorList = mutableListOf<Figure>()

    colorList.add(White("white", radius = 3))
    colorList.add(White("white", radius = 5))
    colorList.add(Black("black", width = 3, height = 6))
    colorList.add(Black("black", width = 4, height = 5))

    var totalBlackPerimeter = 0.0
    var totalWhiteArea = 0.0

    for (figure in colorList) {
        when (figure) {
            is Black -> {
                totalBlackPerimeter += figure.getPerimeter()
            }

            is White -> {
                totalWhiteArea += figure.getArea()
            }
        }
    }

    println("Сумма периметров всех черных фигур: $totalBlackPerimeter")
    println("Сумма площадей всех белых фигур: $totalWhiteArea")

}