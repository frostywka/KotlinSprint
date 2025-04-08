package org.example.lesson_11_classes_propetries_objects.KS_11_5_forum

class ForumMember(
    private var userId: MutableList<Int>,
    private var userName: MutableList<String>,
) {

    private val forumMessage = ForumMessage(
        authorId = mutableListOf(),
        message = mutableListOf(),
    )

    fun newUser() {
        println("Введите пользователя, которого ходите добавить:")
        userName.add(readln())
        val id = (1..99999).random()
        userId.add(id)
        forumMessage.authorId.add(id)

        println(userId)
        println(userName)
        print(forumMessage.authorId)
    }

}