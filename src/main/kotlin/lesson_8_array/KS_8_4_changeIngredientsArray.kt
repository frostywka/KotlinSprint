package org.example.lesson_8_array

fun main() {

    println("Ингредиенты в текущем списке:")
    val listOfIngredients = arrayOf("яйцо", "майонез", "картошка", "морковь", "сахар", "колбаса")
    for (i in listOfIngredients) {
        println(i)
    }

    println("Какой ингредиент Вы хотите заменить?")
    val oldIngredient = readln()
    println("Какой ингредиент Вы хотите Добавить?")
    val newIngredient = readln()

    val indexIngredients = listOfIngredients.indexOf(oldIngredient)
    if (indexIngredients != -1) {
        println("Ингредиент есть")
        listOfIngredients[indexIngredients] = newIngredient

        for (j in listOfIngredients) {
            println("Готово! Вы сохранили следующий список: [$j]")
        }
        return
    }
    println("Ингредиента $oldIngredient в рецепте нет")

}
