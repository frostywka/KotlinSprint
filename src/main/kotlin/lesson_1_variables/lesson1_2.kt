package lesson_1_variables

fun main() {
    var numberOfOrders: Int = 75 // var потому что значение всяко будет меняться
    val thanksForPurchase: String = "Спасибо за заказ. Приходите еще!"
    var numberOfWorkers: Int = 2000

    println("Было обработано $numberOfOrders заказов. Каждый заказ сопроводили текстом: \"$thanksForPurchase\" ")
    println("В интернет магазине работает $numberOfWorkers")

    numberOfWorkers--
    println("После увольнения сотрудников в интернет магазине осталось $numberOfWorkers")
}