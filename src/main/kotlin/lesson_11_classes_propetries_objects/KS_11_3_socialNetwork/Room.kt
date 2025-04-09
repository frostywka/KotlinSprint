package org.example.lesson_11_classes_propetries_objects.KS_11_3_socialNetwork

data class Member(
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

    fun updateStatus(member: Member, newStatus: String) {
        if (member in listOfMembers) {
            member.status = newStatus
//            println("Напиши новый статус")
//            val newStatus = readln()
//            member.status = newStatus
        } else {
            println("Пользователь не найден")
        }
    }
}

fun main() {
    val member1 = Member("Mike", "superMario", "Muted")
    val member2 = Member("Alex", "Duck", "Talking")

    val room1 = Room(
        coverRoom = "cover.jpg",
        nameRoom = "Котики",
        listOfMembers = mutableListOf(member2)
    )

    room1.listOfMembers.forEach { it ->
        println("БЫЛО Name: ${it.name}, nickName: ${it.nickName}, Status: ${it.status}")
    }
    room1.addMember(member1)
    println("-------------")

    room1.updateStatus(member1,"Active")
    println(room1.listOfMembers)
}
