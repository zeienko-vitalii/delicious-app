package com.example.domain.models.food

data class Food(
    var name: String,
    var photoUrl: String,
    var ingredients: MutableList<Ingredient>,
    var description: String,
    var instructions: MutableList<Instruction>,
    var calories: Double, // Kilo calories
    var proteins: Double, // grams
    var fats: Double, // grams
    var carbohydrates: Double, // grams
    var rate: Double
)
