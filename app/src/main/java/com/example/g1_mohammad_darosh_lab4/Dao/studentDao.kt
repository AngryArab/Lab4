package com.example.g1_mohammad_darosh_lab4.Dao
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.g1_mohammad_darosh_lab4.entities.Student


@Dao
interface studentDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(student : Student)

    @Update
    suspend fun update(student:Student)

    @Delete
    suspend fun delete(student: Student)

    @Query("SELECT * FROM studentTable ORDER BY firstname ASC")
    fun getAllStudents() : LiveData<List<Student>>

// displaying students + their books later




}