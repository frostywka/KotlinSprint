package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_5_chat

open class Chat(
    val id: Int,
    val author: String,
    val message: String, // принимает, типо readln ?
    val listMessage: List<Message>,
) {

    fun addMessage() { // принимает на вход , то есть насильно впихнуть параметры на вход в () функции ?
        println("Автор: $author, сообщение: $message")
    }

    fun addThreadMessage(parentMessageId: Int){} // типо как тут ?

    fun printChat(){

    }
}

class Message(
    id: Int,
    author: String,
    message: String,
    listMessage: List<Message>,
) : Chat(id, author, message, listMessage)

class ChildMessage(
    id: Int,
    author: String,
    message: String,
    listMessage: List<Message>,
) : Chat(id, author, message, listMessage)
