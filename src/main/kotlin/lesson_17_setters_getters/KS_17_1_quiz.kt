package org.example.lesson_17_setters_getters

class Quiz(
    questionParam: String,
    answerParam: String
) {
    var question: String = questionParam
        get() = field

    var answer: String = answerParam
        get() = field
        set(value) {
            field = value
        }
}

fun main() {

    val quiz = Quiz("Вопрос", "Ответ")

    println("Какой хочешь задать вопрос: ${quiz.question}")
    quiz.answer = "i'm Batman"
    println("Какой ответ хочешь услышать: ${quiz.answer}")

}