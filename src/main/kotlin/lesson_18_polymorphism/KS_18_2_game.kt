package org.example.lesson_18_polymorphism

import kotlin.random.Random

open class PlayingDice(val sides: Int) {
    open fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Бросок кубика с $sides гранями показал результат: $result")
    }
}

class DiceWithFourFaces : PlayingDice(4)
class DiceWithSixFaces : PlayingDice(6)
class DiceWithEightFaces : PlayingDice(8)

fun main() {

    val d4 = DiceWithFourFaces()
    val d6 = DiceWithSixFaces()
    val d8 = DiceWithEightFaces()

    val fourFaces = DiceWithFourFaces()
    println(fourFaces)

    val diceList: List<PlayingDice> = listOf(d4, d6, d8)

    for (dice in diceList) {
        dice.roll()
    }
}