package org.example.lesson_8_array

/*
Представим, что мы получили массив ингредиентов.
Программа должна распечатать весь список ингредиентов, затем заменить нужный ингредиент на новый по желанию пользователя.
 После этого программа должна показать обновленный список.

 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”.
 */

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

    for (i in listOfIngredients) {
        if (i == oldIngredient) {
            println("Ингредиент есть")
            val indexIngredients = listOfIngredients.indexOf(oldIngredient)
            listOfIngredients[indexIngredients] = newIngredient

            for (j in listOfIngredients) {
                println("Готово! Вы сохранили следующий список: [$j]")
            }
            return
        }
    }
    println("Ингредиента $oldIngredient в рецепте нет")
}
