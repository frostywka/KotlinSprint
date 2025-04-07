package org.example.lesson_11_classes_propetries_objects.KS_11_3_socialNetwork

data class Room(
    val coverRoom: String,
    val nameRoom: String,
    val listOfMembers: MutableList<String>,
    val nickName: MutableList<String>,
    var muteStatus: Boolean,
    var microOffStatus: Boolean,
    var talkingStatus: Boolean,

    ) {

    fun addMember() {
        println("Введите NickName кого добавить в комнату :")
        listOfMembers.add(readln())
    }

    fun isTalkingStatus(){
        println("Введите NickName пользователя, которому необходимо поменять статус")
        nickName.add(readln())
        println("Пользователь Включил микрофон")
        muteStatus = true
    }
}

fun main() {

    val room1 = Room(
        coverRoom = "чтотоНарисовано",
        nameRoom = "Котики",
        listOfMembers = mutableListOf("Pokemon", "Minion", "Santa"),
        nickName = mutableListOf("Alex", "Mike", "Rose"),
        muteStatus = true,
        microOffStatus = true,
        talkingStatus = true,
    )

    println(room1.listOfMembers)
    room1.addMember()
    println(room1.listOfMembers)
    println()
    room1.isTalkingStatus()
    println(room1.talkingStatus)
}