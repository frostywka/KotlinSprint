package org.example.lesson_4_comparison

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 120

fun main() {

    val weightOne = 20
    val volumeOne = 80

    val weightTwo = 50
    val volumeTwo = 100

    val isCheckOne: Boolean =
        AVERAGE_WEIGHT_MIN < weightOne && weightOne <= AVERAGE_WEIGHT_MAX && AVERAGE_VOLUME > volumeOne
    val isCheckTwo: Boolean =
        AVERAGE_WEIGHT_MIN < weightTwo && weightTwo <= AVERAGE_WEIGHT_MAX && AVERAGE_VOLUME > volumeOne

    println("Груз с весом $weightOne кг и объемом $volumeOne л соответствует категории 'Average': $isCheckOne ")
    println("Груз с весом $weightTwo кг и объемом $volumeTwo л соответствует категории 'Average': $isCheckTwo")

}