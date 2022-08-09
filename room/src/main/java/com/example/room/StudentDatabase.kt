package com.example.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [StudentEntity::class], version = 1)
abstract class StudentDatabase : RoomDatabase(){
    abstract fun studentDao() : StudentDao


//싱글톤 패턴 적용
    companion object {
        private var instance: StudentDatabase? = null

        @Synchronized
        fun getInstance(context: Context): StudentDatabase? {
            if (instance == null) {
                synchronized(StudentDatabase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        StudentDatabase::class.java,
                        "user-database"
                    ).build()
                }
            }
            return instance
        }
    }
}