package com.example.g1_mohammad_darosh_lab4.db

import androidx.lifecycle.LiveData
import com.example.g1_mohammad_darosh_lab4.Dao.studentDao
import com.example.g1_mohammad_darosh_lab4.entities.Student
import kotlinx.coroutines.flow.Flow

class studentDB (private val studentDao : studentDao){

    val allStudents: LiveData<List<Student>> = studentDao.getAllStudents()


    suspend fun insert(student:Student){
        studentDao.insert(student)
    }

    suspend fun update(student: Student){

        println(" TEST at student db ${student.studentName} ")
        studentDao.update(student)
    }





}