package com.zeenko.data.db.models.user

data class UserEntity(
    val id: Long,
    var name: String?,
    var surname: String?,
    var email: String,
    var avatar: String?
)