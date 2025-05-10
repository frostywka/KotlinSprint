package org.example.lesson_10_function

const val YES = "да"
const val NO = "нет"

fun main() {
    var humanWins = 0

    do {
        val human = throwOfDiceFour()
        val robot = throwOfDiceFour()

        val win = when {
            human < robot -> "Победила машина"
            human > robot -> {
                "Победило человечество"
                humanWins ++
            }
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
    } while (round())
    println("Количество побед человека = $humanWins")
}

fun round(): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val answer = readln().lowercase()
    return when (answer) {
        YES -> true
        NO -> {
            println("Конец Игры")
            false
        }

        else -> {
            println("Неверный ввод")
            round()
        }
    }
}

fun throwOfDiceFour(): Int {
    return (1..6).random()
}