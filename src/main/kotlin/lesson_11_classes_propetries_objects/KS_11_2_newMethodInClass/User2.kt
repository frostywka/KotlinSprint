package org.example.lesson_11_classes_propetries_objects.KS_11_2_newMethodInClass

data class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun changeBio() {
        println("Начальное значение поля bio = $bio. Введи значение для поле bio:")
        bio = readln()
        println("Поле bio изменено на $bio")
    }

    fun changePassword(){
        println("Начальное значение поля bio = $password. Введи значение для поле password:")
        password = readln()
        println("Поле bio изменено на $password")
    }

    fun printAllInfo() {
        println("Данные о пользователе:")
        println("id $id")
        println("login $login")
        println("mail $mail")
        println("password $password")
        println("bio $bio")
    }

}