package org.example.lesson_11_classes_propetries_objects.KS_11_5_forum

class ForumMessage(
    val authorId: MutableList<Int>,
    private val message: MutableList<String>,
) {

    fun newMessage(){
        println("Придумайте сообщение для Форму:")
        message.add(readln())
        println(message)
    }
}