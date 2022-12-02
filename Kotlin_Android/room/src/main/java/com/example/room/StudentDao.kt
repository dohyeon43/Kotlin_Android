package com.example.room

import androidx.room.Dao
import androidx.room.Query

@Dao
interface StudentDao {
    //전부 가져오기
    @Query("SELECT * FROM student_table")
    fun getAll(): List<Student>

    //DB에 학생 정보 추가하기
    @Query("INSERT INTO student_table (name,grade,classNum,stuNum) VALUES (:name,:grade,:classNum,:stuNum)")
    fun addStudent(name : String, grade : String, classNum : String, stuNum : String)

    //이름이 name인 개체 가져오기
    @Query("SELECT * FROM student_table WHERE name = :name")
    fun getByName(name: String):Student

    //이름이 name인 개체 삭제
    @Query("DELETE FROM student_table WHERE name = :name")
    fun deleteByName(name: String)

    @Query("DELETE FROM student_table")
    fun deleteAll()
}