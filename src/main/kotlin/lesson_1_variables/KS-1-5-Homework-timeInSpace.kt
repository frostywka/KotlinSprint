package org.example.lesson_1_variables

fun main() {
    val allSeconds = 6480
    val constant = 60
    val seconds = allSeconds - ((allSeconds / constant) * constant)
    val minutes = (allSeconds / constant) % constant
    val hours = (allSeconds / constant) / constant

    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)

    println("Гагарин был в космосе: $formattedHours:$formattedMinutes:$formattedSeconds")
    println("Гагарин был в космосе: ${"%02d:%02d:%02d".format(hours, minutes, seconds)}")

    }