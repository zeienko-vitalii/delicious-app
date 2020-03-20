package com.zeenko.data.db.mapper.user

import android.content.ContentValues
import com.zeenko.data.db.models.user.UserEntity
import com.zeenko.data.net.mapper.Mapper

class UserToContentValuesMapper : Mapper<UserEntity, ContentValues> {

    private val USER_ID = ""
    private val NAME = ""
    private val SURNAME = ""
    private val EMAIL = ""
    private val AVATAR = ""
    private val INGRADIENTS = ""

    override fun map(from: UserEntity): ContentValues {
        val contentValues = ContentValues()
        contentValues.put(USER_ID, from.id)
        contentValues.put(NAME, from.id)
        contentValues.put(SURNAME, from.id)
        contentValues.put(EMAIL, from.id)
        contentValues.put("", from.id)
        contentValues.put("", from.id)
        contentValues.put("", from.ingredients)
        contentValues.
        return contentValues
    }
}