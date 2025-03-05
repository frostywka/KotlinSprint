package org.example.lesson_2_variables

fun main() {
    val allSeconds = 6480
    val seconds = allSeconds - ((allSeconds / 60) * 60)
    val minutes = (allSeconds / 60) % 60
    val hours = (allSeconds / 60) / 60

    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)

    println("Гагарин был в космосе: $formattedHours:$formattedMinutes:$formattedSeconds")
}