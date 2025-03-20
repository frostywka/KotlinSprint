package org.example.lesson_8_array

fun main() {
    val viewsByWeek = arrayOf(23,34,25,35,10,5,21)
    var totalViews: Int = 0

    for (i in viewsByWeek){
        totalViews += i
    }
    println("Количество просмотров за неделю: $totalViews")
}