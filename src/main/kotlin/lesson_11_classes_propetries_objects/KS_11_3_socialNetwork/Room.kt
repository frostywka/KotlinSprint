package org.example.lesson_11_classes_propetries_objects.KS_11_3_socialNetwork
/*
- обложка;
- название;
- список участников — отображаются в виде аватарок.
 При долгом нажатии на аватар подсветится его никнейм.
  Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего:
   “разговаривает”, “микрофон выключен”, “пользователь заглушен”.

Класс должен содержать методы:
– добавления участника (принимает объект участника и сохраняет в свойство комнаты);
– обновления статуса (принимает имя пользователя и новый статус).

После проектирования создай объект комнаты с произвольными данными.
 */

data class Room(
    val coverRoom: String,
    val nameRoom: String,
    val listOfMembers: MutableList<String>,
    val loginLongAvatarTap: String,
    val muteStatus: Boolean,
    val microOffStatus: Boolean,
    val talkingStatus: Boolean,

    ) {

    fun addMember() {
        println("Введите имя кого добавить в комнату:")
        listOfMembers.add(readln())
    }


}

fun main() {

    val room1 = Room(
    coverRoom = "чтотоНарисовано",
    nameRoom = "Котики",
    listOfMembers = mutableListOf("Вася", "Петя", "Витя"),
    loginLongAvatarTap = "HelloWorld",
    muteStatus = true,
    microOffStatus = true,
    talkingStatus = true,
    )

//    println(room1)
    println(room1.listOfMembers)
    room1.addMember()
    println(room1.listOfMembers)
    println()

}