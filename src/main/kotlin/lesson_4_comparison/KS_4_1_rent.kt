package org.example.lesson_4_comparison

const val TOTAL_TABLES = 13

fun main() {

    val tablesToday = 13
    val tablesTomorrow = 9

    println("Доступность столик на сегодня : ${TOTAL_TABLES > tablesToday} ")
    println("Доступность столик на завтра : ${TOTAL_TABLES > tablesTomorrow} ")

}