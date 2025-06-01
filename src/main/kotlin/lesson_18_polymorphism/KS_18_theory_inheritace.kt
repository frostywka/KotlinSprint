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


// Пример Наследование

open class NoteAppItemNew {

    open fun getItemData() = ""

}

class MessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String,
) : NoteAppItemNew() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nDate: $data"
    }
}

class PhoneMessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : NoteAppItemNew() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nDate: $data"
    }
}

class ListMessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : NoteAppItemNew() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nDate: $data"
    }
}

fun main() {

    val creationDate = Date()

    val messageItem: NoteAppItemNew = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate",
    )
    println()

    val phoneMessageItem: NoteAppItemNew = PhoneMessageItem(
        "sister's number",
        creationDate,
        "phone",
        89997778855,
    )
    println()

    val listMessageItem: NoteAppItemNew = ListMessageItem(
        "toDoList",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes"),
    )

//    println(messageItem.getItemData())
//    println()
//    println(phoneMessageItem.getItemData())
//    println()
//    println(listMessageItem.getItemData())

    val arrayOfNotes = arrayOf<NoteAppItemNew>(messageItem,phoneMessageItem,listMessageItem)
    showAllNotes(arrayOfNotes)
}

fun showAllNotes(notes: Array<NoteAppItemNew>){
    notes.forEach {
        println(it.getItemData())
    }
}