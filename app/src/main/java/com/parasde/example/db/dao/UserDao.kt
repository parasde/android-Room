package com.parasde.example.db.dao

import androidx.room.*
import com.parasde.example.db.entity.User

@Dao
interface UserDao {
    @Query("SELECT * FROM USER")
    fun select(): List<User>

    @Insert
    fun insert(user: User)

    @Query("SELECT * FROM USER WHERE USER_NAME LIKE :name")
    fun search(name: String): List<User>

    @Query("DELETE FROM USER")
    fun deleteAll()
}