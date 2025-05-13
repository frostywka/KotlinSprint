package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

fun main() {

    // public - по умолчанию, всегда видно отовсюду
    // private - в рамках файла или класса(если помечены как приватные внутри)
    // protected - в классах, которых определенны и классах наследника
    // internal - в любой части модуля, в которой они определены

    val hitch = Hitch()
//    hitch.title = "Something"  // приватный - не доступен
//    hitch.chooseArcticle()
    println(hitch.getNumberOfPages())
    hitch.setNumberOfPages(10_000)
    println(hitch.getNumberOfPages())


//    Support().printInfo()
}