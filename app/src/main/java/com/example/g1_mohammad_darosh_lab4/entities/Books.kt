package com.example.g1_mohammad_darosh_lab4.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "booksTable")
class Books (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "booksID") val booksid :String,
    @ColumnInfo(name = "booksName")val bookname :String,
    @ColumnInfo(name = "authorName") val authorname:String,
){



   // bookId

    //bookName

    //authorName

   // bookDescription
    //category

   // quantity


}