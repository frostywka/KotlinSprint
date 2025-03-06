package org.example.lesson_4_comparison

fun main() {

    val totalTables = 13
    val tablesToday = 13
    val tablesTomorrow = 9

    println("Доступность столик на сегодня : ${totalTables > tablesToday} ")
    println("Доступность столик на завтра : ${totalTables > tablesTomorrow} ")

}