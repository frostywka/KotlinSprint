package org.example.lesson_10_function

fun main() {
    val human = throwOfDiceFour()
    val robot = throwOfDiceFour()

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

fun throwOfDiceFour() = (1..6).random()



