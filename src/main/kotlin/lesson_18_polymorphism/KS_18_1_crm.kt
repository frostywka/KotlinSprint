package org.example.lesson_18_polymorphism

class Order(private val orderNumber: Int) {

    fun orderInfo(
        name: String,
    ) {
        println("Номер Заказа: $orderNumber\nЗаказан товар: [$name]")
    }

    fun orderInfo(
        name: List<String>,
    ) {
        println("Номер Заказа: $orderNumber\nЗаказаны товары: $name")
    }
}

fun main() {

    val order1 = Order(11111)
    order1.orderInfo("конфеты")
    println()

    val order2 = Order(22222)
    order2.orderInfo(listOf("огурцы", "помидоры", "зелень"))
}