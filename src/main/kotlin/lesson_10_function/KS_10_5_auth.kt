package org.example.lesson_10_function

const val LOGIN = "hello"
const val PASS = "world"
const val LENGHT_JWT = 32

fun main() {

    if (auth(LOGIN, PASS) == true) {
        val jwt = token()
        cart(jwt)
    }
}

fun auth(LOGIN: String, PASS: String): Boolean? {
    println("Введите ваш логин и пароль:")
    val inputLogin = readln().lowercase()
    val inputPass = readln().lowercase()

    return if (LOGIN == inputLogin && PASS == inputPass) {
        println("Авторизация прошла успешно")
        true
    } else {
        println("Авторизация не прошла")
        return null
    }
}

fun token(): String {
    val number = 0..9
    val lower = 'a'..'z'
    val upper = 'A'..'Z'
    return (number + lower + upper).shuffled().take(LENGHT_JWT).joinToString("")
}

fun cart(token: String) {
    val cart = listOf("вода", "еда", "одежда", "электроника")
    println("Товары в корзине: $cart")
}