package com.example.g1_mohammad_darosh_lab4.entities

import androidx.annotation.ColorInt
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "librarianTable")
class Librarian(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "firstname")val librarianname:String,
    @ColumnInfo(name = "lastname") val librarianlastname:String,
    @ColumnInfo(name = "password") val password:String) {


  //  librarianId

    //firstname

    //lastname

    //password


}