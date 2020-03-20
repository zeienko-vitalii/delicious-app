package com.zeenko.data.db.manager

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class DBHelper(context: Context, private var databaseEntities: MutableList<DatabaseEntity>) :
    SQLiteOpenHelper(context, DB_NAME, null, VERSION) {

    companion object {
        private val TAG = DBHelper::class.java.simpleName
        private const val DB_NAME = ""
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        Log.d(TAG, "DB_Name - $DB_NAME, $VERSION")
        databaseEntities.forEach { databaseEntity ->
            db.execSQL(databaseEntity.provideCreateSql())
        }
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}

    interface DatabaseEntity {
        fun provideCreateSql(): String
    }

}
