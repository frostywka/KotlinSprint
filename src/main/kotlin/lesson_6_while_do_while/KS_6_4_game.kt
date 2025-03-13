package org.example.lesson_6_while_do_while

fun main() {

    var trying = 5
    val randomNumber = (1..9).random()

    while (trying > 0) {
        println("Угадайте загаданное число от 1 до 9:")
        val number = readln().toInt()

        if (randomNumber != number && trying == 1) {
            --trying
            println("Было загадано число $randomNumber")
        } else if (randomNumber != number) {
            println("Неверно, осталось ${--trying} попыток")
        } else {
            trying = 0
            println(
                """
        Это была великолепная игра!
        Было загадано число $randomNumber
    """.trimIndent()
            )
        }
    }

}
