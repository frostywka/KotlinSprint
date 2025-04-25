package org.example.lesson_13_nullable_npe

class PhoneBookFour(val name: String, val phoneNumber: Long?, val companyName: String?) {

    fun printPhoneBook() {
        println("Имя: $name, Номер: ${phoneNumber!!}, Компания: $companyName")
//        println("Имя: $name, Номер: $phoneNumber, Компания: ${companyName ?: "<Строка не указана>"}")
    }
}

fun main() {

    val phoneBookList = listOf(
        PhoneBookFour("Вася", readln().toLongOrNull(), null),
//        PhoneBookFour("Иван", 22222222, null),
//        PhoneBookFour("Леха", 33333333, "null"),
//        PhoneBookFour("Макс", 44444444, "Эхо"),
//        PhoneBookFour("Петя", 55555555, "Редит"),
    )

    phoneBookList.forEach {
        it.printPhoneBook()
    }
}