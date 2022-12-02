package com.example.room

import android.content.Context
import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [StudentEntity::class],
    version = 3,
)

abstract class StudentDatabase : RoomDatabase(){
    abstract fun studentDao() : StudentDao


    companion object {
        private var instance: StudentDatabase? = null


        fun getInstance(context: Context): StudentDatabase? {
            if (instance == null) {
                synchronized(StudentDatabase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        StudentDatabase::class.java,
                        "student_database"
                    ).allowMainThreadQueries().
                    fallbackToDestructiveMigration()
                        .build()
                }
            }
            return instance
        }
    }
}