package org.example.lesson_2_variables

fun main() {
    var numberOfOrders: Int = 75 // var потому что значение всяко будет меняться
    val thanksForPurchase: String = "Спасибо за заказ. Приходите еще!"

    println("Было обработано $numberOfOrders заказов. Каждый заказ сопроводили текстом: \"$thanksForPurchase\" ")
}