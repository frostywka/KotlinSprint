package org.example.lesson_3_strings

const val STEP = "D2-D4;0"

fun main() {

    val (move, number) = STEP.split(";")
    val (from, to) = move.split("-")

    println(
        """
        откуда $from
        куда $to
        номер шага $number 
    """.trimIndent()
    )
}