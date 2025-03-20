package org.example.lesson_7_for

/*
Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем;
– минимальная длина пароля 6 символов.
 */

fun main() {
    println("Введите длину желаемого пароля, минимальная длина 6 символов: ")
    val length = readln().toInt()
    val numbers = 0..9
    val lower = 'a'..'z'
    val uppper = 'A'..'Z'
    var newPassword = ""

    val password = (0..9) + ('a'..'z') + ('A'..'Z')
    val shuffle = password.shuffled()
    val size = shuffle.joinToString("", limit = length)
    println(size)


//    for ( i in length downTo 0){
//        newPassword += numbers.random()
//        newPassword += lower.random()
//        newPassword += uppper.random()
//        println(newPassword)
//    }

}