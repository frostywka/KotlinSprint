package org.example.lesson_11_classes_propetries_objects.KS_11_5_forum

class Forum()

private val forumMember = ForumMember(
    userId = mutableListOf(),
    userName = mutableListOf(),
)

private val forumMessage = ForumMessage(
    authorId = mutableListOf(),
    message = mutableListOf(),
)

fun createNewUser() {
    forumMember.newUser()
}

fun createNewMessage(){
    forumMessage.newMessage()
}

