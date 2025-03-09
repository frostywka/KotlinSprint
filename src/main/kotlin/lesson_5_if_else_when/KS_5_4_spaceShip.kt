package org.example.lesson_5_if_else_when

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {

    println("Да, вперед, пожалуйста, вводите свои данные: ")
    val inputLogin = readln()

    if (LOGIN == inputLogin) {
        println("Введите пароль для осуществления входа: ")
        val inputPassword = readln()
        if (inputPassword == PASSWORD) {
            println(
                "Ваши данные проверены, и о, чудо, они верны...\n" +
                        "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно...\n" +
                        "Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...]\n" +
                        "Надеюсь, вам понравится пребывание здесь больше, чем мне."
            )
        } else {
            println("В авторизации отказано, неправильный пароль")
        }
    } else {
        println("В системе не найден, Прошу пройти регистрацию.")
    }


}