package org.example.lesson_7_for

fun main() {


// Диапозон
    val range1 = 42..442
    val range2 = 42 until 442 // отличается в диапазон не включается последнее значение
    val range3 = 42L..442L
    val charRange = 'a'..'z'

// шаг
    val range7: IntProgression = 42..442 step 2 // шаг будет 2
    val range8: IntProgression = 442 downTo 42 step 2 // в обратную сторону с шагом 2

// in , !in

    val a = 52 in range1
    val b = 52 !in range1
    println(a) // вернет тру если in есть в диапазоне
    println(b) // вернет тру если in Нет в диапазоне


// for, Если известно какое количество итераций цикла нужно совершить, то следует использовать for.
// Если количество заранее не известно или условие меняется по ходу сценария программы – тогда рекомендуется while (или do-while).
// break , continue , return

    for (i in 5 downTo 1) {
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }

    // BREAK
    for (i in 5 downTo 1) {
        if (i == 3) { // если значение НЕ равно , мы не заходим в условие
            println("пользователь нажал на кнопку Пропустить")
            break   // завершение цикла, НО выполнит команду после цикла "println("продолжение работы программы вне цикла")"
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }
    println("продолжение работы программы вне цикла")

    // CONTINUE
    for (i in 5 downTo 1) {
        if (i == 3) {
            println("i == 3, i не будет распечатана ")
            continue   // цикл прерывается, пропускается это значение (i==3) и начинается новый круг
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }
    println("продолжение работы программы вне цикла")

    // RETURN
    for (i in 5 downTo 1) {
        if (i == 3) {
            return // программа вообще завершает свою работу
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }
    println("продолжение работы программы вне цикла")


    for (i in range1 step 8) {
        println("Реклама закончится через $i")
    }

}