package org.example.lesson_11_classes_propetries_objects.KS_11_2_newMethodInClass

fun main() {

    val user1 = User2(
        id = 123,
        login = "agent",
        password = "007",
        mail = "mail@mail.ru",
    )

    user1.printAllInfo()
    println()
    user1.changeBio()
    println()
    user1.changePassword()
    println()
    user1.printAllInfo()

}