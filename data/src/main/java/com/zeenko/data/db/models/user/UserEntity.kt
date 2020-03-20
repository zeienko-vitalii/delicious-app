package com.zeenko.data.db.models.user

import com.example.domain.models.food.Dish

data class UserEntity(
    val id: Long,
    var name: String?,
    var surname: String?,
    var email: String,
    var avatar: String?,
    var ingredients: MutableList<Dish>?
)