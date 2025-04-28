package org.example.lesson_14_override_inheritance_openclass.theory

class Scout (
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int,
) : SpaceShip(name, speed) {

    fun handleDataFromRadar(){
        println("$name Обработка данных с радара")
    }

    fun runAfterburner(){
        println("$name форсаж запущен")
    }
}