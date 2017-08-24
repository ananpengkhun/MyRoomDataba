package com.example.rafael238.mykuy

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val person = Room.databaseBuilder(this, Person::class.java, "men_db").build()
//
//        val insert = Observable.fromCallable { person.person().insert(PersonEntity("anana", "pengkhun")) }
//
//        insert.subscribe({
//            person.person().selectAll().subscribe { list ->
//                print("list count : ${list.size}")
//            }
//        })
    }
}
