package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

class Order(private val orderNumber: Int, val readyStatus: Boolean){

    fun createRequest(){

    }

    fun changeStatusOrder(){

    }

}

fun main() {

    val order = Order(1111,false)

}