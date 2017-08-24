package com.example.rafael238.mykuy

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Flowable
import io.reactivex.Observable

/**
 * Created by rafael238 on 8/23/17.
 */
@Dao
interface PersonDao {
    @Query("SELECT * FROM person")
    fun selectAll() : Flowable<List<PersonEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertValue(personEntity: PersonEntity)

}