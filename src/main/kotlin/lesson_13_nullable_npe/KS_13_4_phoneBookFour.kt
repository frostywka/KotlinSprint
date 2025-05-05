package org.example.lesson_13_nullable_npe

class ContactFormNew(val name: String, val phoneNumber: Long, val companyName: String?) {

    fun printPhoneBook() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${companyName ?: "<Строка не указана>"}")
    }
}

fun main() {

    val phoneBookList = mutableListOf<ContactFormNew>()

    while (true) {
        println("Введите Имя контакта:")
        val name = readln()
        if (name.isEmpty()) {
            println("Имя контакта не введено. Контакт не будет добавлен")
            break
        }

        println("Введите Номер контакта:")
        val phoneNumberInput = readln()

        if (phoneNumberInput.isEmpty()) {
            println("Номер телефона не введен. Контакт не будет добавлен")
            continue
        }

        val phoneNumber = phoneNumberInput.toLongOrNull()
        if (phoneNumber == null) {
            println("Номер телефона должен быть числом. Контакт не будет добавлен")
            continue
        }

        println("Введите Компанию контакта:")
        val companyName = readln().ifBlank {
            null
        }

        phoneBookList.add(ContactFormNew(name, phoneNumber, companyName))
        println("Контакт добавлен")

        break
    }
    phoneBookList.forEach {
        it.printPhoneBook()
    }
}



