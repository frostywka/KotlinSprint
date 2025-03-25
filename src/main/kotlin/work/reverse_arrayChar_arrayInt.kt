package org.example.work

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив ${array.contentToString()}")
    reverseIntArray(array)
    println("Перевернутый массив ${array.contentToString()}")

    println("--------------------")

    val charArray = "HELLO".toCharArray()
    println("Исходный массив ${charArray.contentToString()}")
    reverseChar(charArray)
    println("Перевернутый массив ${charArray.contentToString()}")

}

fun reverseIntArray(arr: IntArray) {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        // Меняем местами элементы
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        // Сдвигаем указатели
        start++
        end--
    }
}

fun reverseChar(arr: CharArray) {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start++
        end--
    }
}