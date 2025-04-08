package org.example.lesson_12_constructor_init

// Пустой Конструктор , когда переменные написаны в ТЕЛЕ, класс получается без конструктору

//class Ingredients1() {
//    val name = "asdasd"
//    val weight = 1
//    val count = 2
//}

// Основной Конструктор (как параметры, которые приходят в обычную функцию) остаются переменные в теле.

//class Ingredients1( _name: String,  _weight: Int,  _count: Int) {
//    val name = _name // или переименовть или поставить _перед переменной _name
//    val weight = _weight
//    val count = _count
//}

// Упрощенная форма основного конструктора
//class Ingredients1(val name: String, val weight: Int, val count: Int) {
//
//}

// Вторичный конструктор

class Ingredient( val name: String, val weight: Int, val count: Int) {
    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

        this.isNeedToPrepare = isNeedToPrepare
    }


    // Блоки инициализации
//    init {
//        println("INIT блок инициализации $name")
//    }

    // Последовательность вызова Конструкторов
    // Вторичный конструктор
    // первичный
    // Блоки init
    // тело второчного конструктора
}