package org.example.lesson_13_nullable_npe

class NewContact(val name: String, val phoneNumber: Long, val companyName: String?)


fun main() {

    val phoneBookList = listOf(
        NewContact("Вася", 11111111, null),
        NewContact("Иван", 22222222, null),
        NewContact("Леха", 33333333, "null"),
        NewContact("Макс", 44444444, "Эхо"),
        NewContact("Петя", 55555555, "Редит"),
    )

   val printCompany = phoneBookList.filter {
       it.companyName != null
   }

   printCompany.forEach {
       println("Название компании: ${it.companyName}")
   }
}
