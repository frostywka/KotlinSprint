package org.example.lesson_2_arithmetic

import kotlin.math.pow

const val SUM = 70000
const val PERCENT = 16.7
const val YEARS = 20
const val ONE_CONST = 1

fun main() {

    val formula = SUM * (ONE_CONST + PERCENT / 100).pow(YEARS)

    println(String.format("%.3f", formula))

}