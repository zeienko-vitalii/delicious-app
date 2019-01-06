package com.zeenko.data.db.models.food

import com.example.domain.models.food.Ingredient
import com.example.domain.models.user.User

data class FoodEntity(
    val id: Long,
    var name: String,
    var photoUrl: String,
    var ingredients: MutableList<Ingredient>,
    var description: String,
    var instructions: MutableList<Step>,
    var calories: Double?, // Kilo calories
    var proteins: Double?, // grams
    var fats: Double?, // grams
    var carbohydrates: Double?, // grams
    var rate: Double = 0.0,
    var author: User
)
