package lesson_1_variables

fun main() {
    val year = 1961
    var hour = "09"
    var minute = "07"

    println(
        """
        Взлет Юрия Гагарина состоялся в $hour часов 
        $minute минут
        $year года")
    """.trimIndent()
    )

    hour = "10"
    minute = "55"

    println("Время посадки Юрия Гагарина состоялась в $hour:$minute")
}