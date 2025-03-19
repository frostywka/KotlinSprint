package org.example.lesson_7_for

const val PASSWORD_SIZE = 6

fun main() {

    var newPassword = ""
    val charRange = 'a'..'z'
    val intRange = 0..9

    for (i in PASSWORD_SIZE downTo 1) {
        if (i % 2 == 0) {
            newPassword += charRange.random()
        } else {
            newPassword += intRange.random()
        }
    }
    println(newPassword)

}
