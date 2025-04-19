package org.example.lesson_13_nullable_npe

fun main() {

    val nullableString: String? = null

    println(nullableString?.length)
    // или развернуто можно это написать так

//    if (nullableString != null) println(nullableString.length)
//    else println("переменная хранит null")

//    val nullableLine: String? = readLine()

    // Оператор елвис ?:
//    val stringLength: Int = nullableString?.length ?: 99
//    println(stringLength)

    // Оператор это не null (!!) - не можети быть NULL
    val stringLength: Int = nullableString!!.length

}