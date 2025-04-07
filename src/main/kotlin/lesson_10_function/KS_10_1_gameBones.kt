package org.example.lesson_10_function

fun main() {
    val human = throwOfDice()
    val robot = throwOfDice()

    val win = when {
        human < robot -> "Победила машина"
        human > robot -> "Победило человечество"
        human == robot -> "Победила дружба"
        else -> "4ый вариант"
    }
    println(
        """
        Результат броска игрока $human
        Результат броска машины $robot
        $win
    """.trimIndent()
    )
}

fun throwOfDice() = (1..6).random()



