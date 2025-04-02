package org.example.lesson_10_function

import javax.print.attribute.standard.RequestingUserName

fun main() {
//    val name = getName()
//    val age = getAge()
//    println("$name, $age")
//
//    printNameAndAge(name, age) // можно так
//    printNameAndAge(getName(), getAge()) // можно так и тогда строки 6 и 7 не нужны
    printNameAndAge(userName = getName(), userAge = getAge()) // можно так и тогда строки 6 и 7 не нужны

}

fun getName(): String? {
    println("Введите ваше имя:")
    return readln()
}
//fun getName(): String? =  readln() // короткая версия

fun getAge(): Int? {
    println("Введите Возраст:")
    return readln().toInt()
}
//fun getAge(): Int? = readln().toInt() // короткая запись функции

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Данные пользователя: $userName, $userAge лет ")
}