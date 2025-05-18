package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

class Order(private val orderNumber: Int, var readyStatus: Boolean) {

    fun createRequestToChangeStatus() { // имитация новой заявки
        changeStatusOrder()
    }

    fun changeStatusOrder() { //
        readyStatus = true
    }

}

fun main() {

    val order = Order(1111, false)
    order.createRequestToChangeStatus()

    println(order.readyStatus)
}