package com.example.rafael238.mykuy

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by rafael238 on 8/23/17.
 */
@Entity(tableName = "person")
data class PersonEntity(@ColumnInfo(name = "user_name") var name: String = "",
                        @ColumnInfo(name = "user_lname") var lname: String = "") {
    @ColumnInfo(name = "user_id")
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}