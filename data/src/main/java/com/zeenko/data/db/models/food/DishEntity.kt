package com.zeenko.data.db.models.food

import com.zeenko.data.db.models.user.UserEntity

data class DishEntity(
    val id: Long,
    var name: String,
    var photoUrl: String,
    var ingredients: MutableList<IngredientEntity>,
    var description: String,
    var instructions: MutableList<StepEntity>,
    var calories: Double?, // Kilo calories
    var proteins: Double?, // grams
    var fats: Double?, // grams
    var carbohydrates: Double?, // grams
    var rate: Double = 0.0,
    var author: UserEntity
)
