package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_1

fun main() {

    val liner1 = Liner()
    liner1.morePassengers()
    liner1.allInfo()
    println()

    val cargo1 = Cargo("Грузовой", 100,500,1000)
    cargo1.allInfo()
    println()

    val icebreaker = Icebreaker("Ледокол", 50, 100,50)
    icebreaker.allInfo()
}