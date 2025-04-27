package org.example.lesson_13_nullable_npe

class ContactForm(val name: String, val phoneNumber: Long?, val companyName: String?) {

    fun printPhoneBook() {
        println("Имя: $name, Номер: ${phoneNumber ?: "<Строка не указана>"}, Компания: ${companyName ?: "<Строка не указана>"}")
    }
}

fun main() {

    val phoneBookList = mutableListOf<ContactForm>()

    while (true) {
        println("Введите Имя контакта:")
        val name = readln()

        println("Введите Номер контакта:")
        val phoneNumberInput = readln()

        if (phoneNumberInput.isBlank()) {
            println("Номер телефона не введен. Контакт не будет добавлен")
            continue
        }

        val phoneNumber = phoneNumberInput.toLongOrNull()
        if (phoneNumber == null) {
            println("Номер телефона должен быть числом. Контакт не будет добавлен")
            continue
        }

        println("Введите Компанию контакта:")
        val companyName = readln().takeIf { it.isNotBlank() }

        phoneBookList.add(ContactForm(name, phoneNumber, companyName.toString()))


        phoneBookList.forEach {
            it.printPhoneBook()
        }

    }
}
