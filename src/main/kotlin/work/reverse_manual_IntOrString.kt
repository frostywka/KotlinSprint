package org.example.work

fun main() {
    int()
    string()
}

fun int() {
    val number = 1234567890
    val numberStr = number.toString()
    var reversedStr = ""

    for (i in numberStr.length - 1 downTo 0) {
        reversedStr += numberStr[i]
    }

    println("Перевернутая переменная Int: $reversedStr")
}

fun string() {
    val word = "Capybara"
    var reversedStr = ""

    for (i in word.length - 1 downTo 0) {
        reversedStr += word[i]
    }

    println("Перевернутая переменная string: $reversedStr")
}