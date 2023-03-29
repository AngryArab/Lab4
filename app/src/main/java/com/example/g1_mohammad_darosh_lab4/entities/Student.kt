package com.example.g1_mohammad_darosh_lab4.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "studentTable")
class Student(@PrimaryKey(autoGenerate = true)@ColumnInfo(name = "firstname") val studentName:String,
@ColumnInfo(name = "lastname") val lastname:String,
@ColumnInfo(name = "password") val password :String){










    //studentid
    //first name
    //lname
    //password
    //bookid




}