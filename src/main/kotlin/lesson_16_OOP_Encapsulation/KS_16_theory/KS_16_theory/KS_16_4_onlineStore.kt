package org.example.lesson_16_OOP_Encapsulation.KS_16_theory.KS_16_theory

class Order(private val orderNumber: Int, var readyStatus: Boolean) {

    fun createRequestToChangeStatus(newStatus: Boolean) {
        changeStatusOrder(newStatus)
    }

    private fun changeStatusOrder(newStatus: Boolean) {
        readyStatus = newStatus
    }

}

fun main() {

    val order = Order(1111, false)
    order.createRequestToChangeStatus(true)

    println(order.readyStatus)
}