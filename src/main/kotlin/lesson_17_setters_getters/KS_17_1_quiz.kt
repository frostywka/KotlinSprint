package org.example.lesson_17_setters_getters

class Quiz(
    questionParam: String,
    answerParam: String
) {
    val question: String
        get() = "Кто ты?"

    var answer: String = answerParam
        get() = field
        set(value) {
            field = "I'm a batman"
        }
}

fun main() {

    val quiz = Quiz("Вопрос", "Ответ")

    println("Какой хочешь задать вопрос: ${quiz.question}")
    quiz.answer = "Что-то"
    println("Какой ответ хочешь услышать: ${quiz.answer}")

}