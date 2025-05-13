package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

private val supportInfo = "Support Info"

class Hitch {

    var title = ""
    private var numberOfPages = 9999

    private fun chooseArcticle() {
        println("Open Catalog")
    }

    fun getNumberOfPages() = numberOfPages
    fun setNumberOfPages(number: Int){
        numberOfPages = number
    }

}

class Support {
    fun printInfo(){
        println(Hitch::class.simpleName)
        println(Hitch().title)
        println(supportInfo) // в рабочем файле так же будет не видна
    }

}