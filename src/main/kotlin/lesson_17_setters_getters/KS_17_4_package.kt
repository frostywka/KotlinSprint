package org.example.lesson_17_setters_getters

class Package(val number: Int, var locationParam: String) {
    var movementCounter: Int = 0

    var location = locationParam
        set(value) {
            field = value
            movementCounter++
        }
}

fun main() {

    val packageOne = Package(321,"Уфа")
    packageOne.location = "Пермь"
    packageOne.location = "НН"
    packageOne.location = "МСК"
    println("Текущая локация: ${packageOne.location}, счетчик изменился на количество: ${packageOne.movementCounter}")

}