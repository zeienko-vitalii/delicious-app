package com.zeenko.data.db.manager

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log


class DBHelper(context: Context) : SQLiteOpenHelper(context, DB_NAME, null, VERSION) {

    companion object {
        private val TAG = DBHelper::class.java.simpleName
        private const val DB_NAME = ""
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        Log.d(TAG, "DB_Name - $DB_NAME, $VERSION")
//        db.execSQL(RuleEntity.CREATE_TABLE)
//        db.execSQL(TimerConditionEntity.CREATE_TABLE)
//        db.execSQL(ValueConditionEntity.CREATE_TABLE)
//        db.execSQL(SensorDataEntity.CREATE_TABLE)
//        db.execSQL(SensorEntity.CREATE_TABLE)
//        db.execSQL(SensorModelEntity.CREATE_TABLE)
//        db.execSQL(SensorTypeConfigsEntity.CREATE_TABLE)
//        db.execSQL(SensorTypeEntity.CREATE_TABLE)
//        db.execSQL(SensorViewEntity.CREATE_TABLE)
//        db.execSQL(SocketViewEntity.CREATE_TABLE)
//        db.execSQL(AuthenticationTokenEntity.CREATE_TABLE)
//        db.execSQL(MobileEntity.CREATE_TABLE)
//        db.execSQL(TabletEntity.CREATE_TABLE)
//        db.execSQL(UserEntity.CREATE_TABLE)
//        db.execSQL(PushNotificationEntity.CREATE_TABLE)
//
//        // View for getting necessary rows and columns
//        db.execSQL(SensorDataViewEntity.CREATE_TABLE)
//
//        // View for getting rule data
//        db.execSQL(RuleViewEntity.CREATE_TABLE)
//
//        // Trigger for remove data from value and timer tables in case rule is removed
//        db.execSQL(RuleTriggerDeleteEntity.CREATE_TRIGGER)
//
//        // Trigger for update data from value and timer tables in case rule is updated
//        //        db.execSQL(RuleTriggerUpdateEntity.CREATE_TRIGGER);
//
//        // Fill fields in Database
//        db.execSQL(PrimaryInitializationEntity.INIT_SENSOR_TYPES)
//        //        db.execSQL(PrimaryInitializationEntity.INIT_SENSOR_MODELS);
//        db.execSQL(PrimaryInitializationEntity.INIT_SENSOR_TYPE_CONFIGS)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}


}
