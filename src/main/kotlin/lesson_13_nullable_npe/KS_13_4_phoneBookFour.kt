package org.example.lesson_13_nullable_npe

class ContactForm(val name: String, val phoneNumber: Long, val companyName: String?) {

    fun printPhoneBook() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${companyName ?: "<Строка не указана>"}")
    }
}

fun main() {

    val phoneBookList = mutableListOf<ContactForm>()

    while (true) {
        println("Введите Имя контакта:")
        val name = readln()
        if (name.isEmpty()) {
            println("Имя контакта не введено")
            break
        }

        println("Введите Номер контакта:")
        val phoneNumberInput = readln()

//        val phoneNumber: Long

//        when {
//            phoneNumberInput.isBlank() -> {
//                println("Номер телефона не введен. Контакт не будет добавлен")
//                continue
//            }
        if (phoneNumberInput.isEmpty()) {
            println("Номер телефона не введен. Контакт не будет добавлен")
            continue
        }

        val phoneNumber = phoneNumberInput.toLongOrNull()
        if (phoneNumber == null) {
            println("Номер телефона должен быть числом. Контакт не будет добавлен")
            continue
        }
//
//            phoneNumberInput.toLongOrNull() == null -> {
//                println("Номер телефона должен быть числом. Контакт не будет добавлен")
//                continue
//            }
//
//            else -> {
//                phoneNumber = phoneNumberInput.toLong()
//                println("Номер телефона успешно добавлен")
//            }


        println("Введите Компанию контакта:")
//        val companyName = readln().trim().takeIf { it.isNotEmpty() }
        val companyName = readln().ifBlank {
            null
        }


        phoneBookList.add(ContactForm(name, phoneNumber, companyName))
        println("Контакт добавлен")
        phoneBookList.forEach {
            it.printPhoneBook()
        }
        break
    }
}



