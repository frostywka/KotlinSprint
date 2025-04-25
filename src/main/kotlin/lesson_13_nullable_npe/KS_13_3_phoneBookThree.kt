package org.example.lesson_13_nullable_npe

class PhoneBookThree(val name: String, val phoneNumber: Long, val companyName: String?) {

    fun printPhoneBook() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${companyName ?: "<Строка не указана>"}")
    }
}

fun main() {

    val phoneBookList = listOf(
        PhoneBookThree("Вася", 11111111, null),
        PhoneBookThree("Иван", 22222222, null),
        PhoneBookThree("Леха", 33333333, "null"),
        PhoneBookThree("Макс", 44444444, "Эхо"),
        PhoneBookThree("Петя", 55555555, "Редит"),
    )

    phoneBookList.forEach {
        println("Название компании: ${it.companyName ?: "<строка не указана>"}")
    }
}