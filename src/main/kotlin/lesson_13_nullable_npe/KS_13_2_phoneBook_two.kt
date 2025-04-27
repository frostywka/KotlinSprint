package org.example.lesson_13_nullable_npe

class ContactForm(val name: String, val phoneNumber: Long, val companyName: String?) {

    fun print() {
        println("Имя: $name,\nНомер: $phoneNumber,\nКомпания: ${companyName ?: "<Строка не указана>"}")
    }
}

fun main() {

    val contact = ContactForm("Ilya", 79111111111, null)

    contact.print()
}