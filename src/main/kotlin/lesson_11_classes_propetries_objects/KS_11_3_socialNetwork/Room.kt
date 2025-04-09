package org.example.lesson_11_classes_propetries_objects.KS_11_3_socialNetwork


class Member(
    val name: String,
    val nickName: String,
    var status: String,
)

data class Room(
    val coverRoom: String,
    val nameRoom: String,
    val listOfMembers: MutableList<Member>,
) {

    fun addMember(member: Member) {
        listOfMembers.add(member)

    }

    fun isStatus() {
    }
}

fun main() {
    val member1 = Member("Mike","superMario","Muted")
    val member2 = Member("Alex","Duck","Talking")

    val room1 = Room(
        coverRoom = "cover.jpg",
        nameRoom = "Котики",
        listOfMembers = mutableListOf(member2)
    )

    println(room1.listOfMembers)
    room1.addMember(member1)
    println(room1.listOfMembers)
    println()
    room1.isStatus()

}