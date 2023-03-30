package com.example.g1_mohammad_darosh_lab4.db

import com.example.g1_mohammad_darosh_lab4.Dao.LibrarianDao
import com.example.g1_mohammad_darosh_lab4.entities.Librarian

class librarianDB(private val librarianDao : LibrarianDao) {



    suspend fun insert(librarian:Librarian){
        librarianDao.insert(librarian)
    }





}