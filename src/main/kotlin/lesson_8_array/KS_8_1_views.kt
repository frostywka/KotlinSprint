package org.example.lesson_8_array

fun main() {
    val viewsByWeek = intArrayOf(23,34,25,35,10,5,21)
    var totalViews: Int = viewsByWeek.sum()
    var sum: Int = 0

    for (i in viewsByWeek){
        sum += i
    }
    println("Количество просмотров за неделю через for: $totalViews")
    println("Количество просмотров за неделю через sum(): $sum")
}