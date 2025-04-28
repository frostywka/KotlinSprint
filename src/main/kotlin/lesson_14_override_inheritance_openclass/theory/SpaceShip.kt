package org.example.lesson_14_override_inheritance_openclass.theory

// базовый класс
// супер класс

// abstract -вместо open - Говорит о том, что мы закрываем возможность делать экз. этого класса
open class SpaceShip(  // OPEN - говорит о том, что открываем класс и разрешаем делать наследников
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false   // беспилотнкик
) {
    // базовый класс
    fun switchToWarpMode(){
        println("$name Переход в варм режим")
    }

    open fun runSystemDiagnostic(){
        println("$name Запущена диагностика корабля")
    }
}