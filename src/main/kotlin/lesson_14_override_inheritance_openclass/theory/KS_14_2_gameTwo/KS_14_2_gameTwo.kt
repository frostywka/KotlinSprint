package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_2_gameTwo

/*
Каждый тип корабля обладает уникальным способом погрузки:

- лайнер выдвигает горизонтальный трап со шкафута;
- грузовой корабль активирует погрузочный кран;
- ледокол открывает ворота со стороны кормы.

Реализуй методы погрузки, специфичные для каждого вида корабля.

Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.
 */

fun main() {

    val liner1 = LinerTwo()
    liner1.morePassengers()
    liner1.allInfo()
    liner1.loadingType()
    println()

    val cargo1 = CargoTwo("Грузовой", 100,500,1000)
    cargo1.allInfo()
    cargo1.loadingType()
    println()

    val icebreaker1 = IcebreakerTwo("Ледокол", 50, 100,50)
    icebreaker1.allInfo()
    icebreaker1.loadingType()
}