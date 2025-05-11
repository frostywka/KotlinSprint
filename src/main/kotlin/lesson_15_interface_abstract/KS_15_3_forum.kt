package org.example.lesson_15_interface_abstract


abstract class ChatUser() {
    open fun read() {
        println("Пользователь может Читать")
    }
    open fun write() {
        println("Пользователь может Писать")
    }
}

class Moderator() : ChatUser() {
    fun deleteUser() {
        println("Пользователь может Удалить пользователя")
    }
    fun deleteMessage() {
        println("Пользователь может Удалить сообщение пользователя")
    }
}

class CommonUser(): ChatUser(){
    override fun write() {
        println("Common user write")
    }
}

fun main() {
    val commonUser = CommonUser()
    commonUser.write()
    commonUser.read()
    println("")

    val moderator = Moderator()
    moderator.deleteUser()
    moderator.deleteMessage()
    moderator.write()
    moderator.read()

}