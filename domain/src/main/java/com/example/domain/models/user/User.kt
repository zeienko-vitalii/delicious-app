package com.example.domain.models.user

data class User(
    val id: Long,
    var name: String?,
    var surname: String?,
    var email: String,
    var avatar: String?
)