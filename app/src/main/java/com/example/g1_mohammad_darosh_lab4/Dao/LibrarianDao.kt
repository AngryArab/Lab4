package com.example.g1_mohammad_darosh_lab4.Dao

import androidx.room.*
import com.example.g1_mohammad_darosh_lab4.entities.Librarian

@Dao
interface LibrarianDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(librarian: Librarian)

    @Update
    suspend fun update(librarian: Librarian)

    @Delete
    suspend fun delete(librarian: Librarian)




    //all the daos need to be changed to interfaces



}