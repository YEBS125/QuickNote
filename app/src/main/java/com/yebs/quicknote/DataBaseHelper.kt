package com.yebs.quicknote

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHelper (context: Context) : SQLiteOpenHelper (context, "QuickNoteDB", null, 1) {
    override fun onCreate (db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE Users (id INTEGER PRIMARY KEY AUTOINCREMENT, user_name TEXT, email TEXT, password TEXT)"
        db?.execSQL(createTable)
    }
    override fun onUpgrade (db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE  IF EXISTS Users")
        onCreate(db)
    }
}