package com.example.challengeroom1_lutfi.room

import androidx.room.*

@Dao

interface siswaDao {

    @Insert
    fun addDatasiswa (note: dbsmksa)

    @Update
    fun UpdateDatasiswa(note: dbsmksa)

    @Delete
    fun DeleteDatasiswa(note: dbsmksa)

    @Query("SELECT * FROM tbsiswa")
    fun tampilsemua(): List<tbsiswa>

}