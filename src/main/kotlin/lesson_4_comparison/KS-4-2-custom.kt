package org.example.lesson_4_comparison


fun main() {

    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageVolume = 120

    var weightOne = 20
    var volumeOne = 80
    val weightTwo = 50
    val volumeTwo = 100

    val checkOne: Boolean = averageWeightMin < weightOne && weightOne <= averageWeightMax && averageVolume > volumeOne
    val checkTwo: Boolean = averageWeightMin < weightTwo && weightTwo <= averageWeightMax && averageVolume > volumeOne

    println("Груз с весом $weightOne кг и объемом $volumeOne л соответствует категории 'Average': $checkOne ")
    println("Груз с весом $weightTwo кг и объемом $volumeTwo л соответствует категории 'Average': $checkTwo")

}