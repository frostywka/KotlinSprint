package org.example.lesson_11_classes_propetries_objects.KS_11_4_figmaDesign

data class Category(
    val id: String,
    val name: String,
    val description: String,
)

data class Recipe(
    val id: Int,
    val name: String,
    val categoryId: Int,
    val cookingMethod: MutableList<String>,
    val listOfIngredients: MutableList<String>
)

data class Ingredient(
    val id: Int,
    val name: String,
    val quantity: Int,
    val recipeId: Int,
)
