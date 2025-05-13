package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

class Cube() {
    private val number: Int = (1..6).random()

    fun printRandomNumber() {
        println(number)
    }
}

fun main() {

    val cube = Cube()
    cube.printRandomNumber()

}