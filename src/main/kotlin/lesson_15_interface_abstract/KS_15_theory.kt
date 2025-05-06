package org.example.lesson_15_interface_abstract

interface Moveble {
    fun startEngine() {
        println("Двигатель запущен")
    }

    fun prepareForTakeoff()
    fun prepareForLanding()
}

interface Shootable {

    fun startShooting()
    fun reloadingGuns()
}

abstract class SpaceShuttle : Moveble, Shootable {

    abstract val tankSize: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSize: Int) : SpaceShuttle() {
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeoff() {
        println("Развернуть крылья")
    }

    override fun prepareForLanding() {
        println("Свернуть крылья")
    }

    override fun startShooting() {
        println("Начать стрельбу")
    }

    override fun reloadingGuns() {
        println("Перезарядить оружие N")
    }
}

fun main() {

    val upsilonShuttle = Upsilon(50)
    upsilonShuttle.runDiagnostic()
    upsilonShuttle.prepareForTakeoff()
    upsilonShuttle.prepareForLanding()
    upsilonShuttle.startShooting()
    upsilonShuttle.reloadingGuns()
}