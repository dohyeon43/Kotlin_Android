package com.example.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class StudentEntity(
    var name : String,
    var grade : Int,
    var classNum : Int,
    var stuNum : Int,

    @PrimaryKey
        (autoGenerate = true) var id: Int = 0
)