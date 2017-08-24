package com.example.rafael238.mykuy

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by rafael238 on 8/23/17.
 */

@Database(entities = arrayOf(PersonEntity::class), version = 1, exportSchema = false)
abstract class Person : RoomDatabase() {
    abstract fun person(): PersonDao
}