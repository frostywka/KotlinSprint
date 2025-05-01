package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_1

open class Liner(
    val name: String = "Лайнер",
    val numberOfPassengers: Int = 1000,
    val speed: Int = 5000,
    val loadCapacity: Int = 100,
    val breakingIce: Boolean = false,
)

class Cargo(
    name: String,
    numberOfPassengers: Int = 100,
    speed: Int = 500,
    loadCapacity: Int = 1000,
) : Liner(name, numberOfPassengers, speed, loadCapacity)
/*
Попробовал реализовать так. Поигрался по-разному, НО моя инициализация работает и так и этак. Какое правильно ??
Вариант с грузовым
class Cargo(
name: String,
): Liner(name, numberOfPassengers = 100, speed = 500, loadCapacity = 1000)

Вариант с ледоколом более гибкий и понятный, так можно переопределять значения для разных ледоколов,
не создавая новые параметры. Вариант с грузовым подходит, если много параметров имеют фиксированные значения,
но такие классы редко наследуются от кого-то.
*/

class Icebreaker(
    name: String,
    numberOfPassengers: Int = 50,
    speed: Int = 100,
    loadCapacity: Int = 50,
) : Liner(name, numberOfPassengers, speed, loadCapacity, breakingIce = true)

fun main() {

    val liner1 = Liner()
    val cargo1 = Cargo("CargoOne")
    val icebreaker1 = Icebreaker("Ледокол")
}