package org.example.lesson_13_nullable_npe

class PhoneBook(val name: String, val phoneNumber: Long, val companyName: String?)

fun main() {

    val phoneBook = PhoneBook("Ilya",79111111111, null)

}