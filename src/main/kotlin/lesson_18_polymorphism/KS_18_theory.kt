package org.example.lesson_18_polymorphism

import java.util.Date

/*
 многообразное
 Ad hoc (по случаю) - одна функция определяется для разных типов данных. В классе прописываются несколько функций,
 которые принимаются разные параметры. При компиляции определяется, какая функция сработает
 минус - нужно сделать много реализаций этой функций

 Subtyping (полиморфизм включения) – это реализация через принцип подстановки Барбары Лисков.
  Это один из принципов объектно-ориентированного программирования из аббревиатуры SOLID.
   Почитайте об этом. А звучит он так: функции, которые используют базовый тип,
   должны иметь возможность использовать подтипы базового типа, не зная об этом.
   То есть объект более узкого типа всегда может использоваться там,
    где может использоваться объект более широкого типа.

Parametric (параметрический) – программа может быть реализована через обобщенные типы.
То есть без ориентации на конкретный тип.
Касаемо Kotlin – это история про дженерики (или обобщенное программирование). О них поговорим в другой раз
*/

class NoteAppItem {

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: String,
    ) {
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nDate: $data")
    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: Long,
    ) {
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nDate: $data")
    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: List<String>,
    ) {
        println("Item \"$title\" added to cell - $creationDate\nType: $type\nDate: $data")
    }
}

fun main() {

    val creationDate = Date()
    val note = NoteAppItem()

    note.addItemToCell(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate",
    )
    println()

    note.addItemToCell(
        "sister's number",
        creationDate,
        "phone",
        89997778855,
    )
    println()

    note.addItemToCell(
        "toDoList",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes"),
    )

}