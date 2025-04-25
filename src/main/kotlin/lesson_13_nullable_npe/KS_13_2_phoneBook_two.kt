package org.example.lesson_13_nullable_npe

class PhoneBookTwo(val name: String, val phoneNumber: Long, val companyName: String?) {

    fun print() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${companyName ?: "<Строка не указана>"}")
    }
}

fun main() {

    val phoneBookTwo = PhoneBookTwo("Ilya", 79111111111, null)

    phoneBookTwo.print()
}