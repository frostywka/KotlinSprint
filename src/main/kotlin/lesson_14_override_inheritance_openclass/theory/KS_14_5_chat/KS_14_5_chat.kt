package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_5_chat

class Chat(
    val author: String,
    val message: String, // принимает, типо readln ?
    val listMessage: List<Message>,
) {

    fun addMessage() { // принимает на вход , то есть насильно впихнуть параметры на вход в () функции ?
        println("Автор: $author, сообщение: $message")
    }

    fun addThreadMessage(parentMessageId: Int) {} // типо как тут ?

    fun printChat() {
    }
}

open class Message(
    val id: Int,
)

class ChildMessage(
    id: Int,
) : Message(id) {

    fun printChildMessage() {
        println("\tСообщение")
    }
}
