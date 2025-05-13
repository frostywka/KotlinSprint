package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

class Cube() {
    private val number: IntRange = 1..6

    fun printRandomNumber() {
        println(number.random())
    }
}

fun main() {

    val cube = Cube()
    cube.printRandomNumber()

}