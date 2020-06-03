package com.example.todoapplication.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TasksDatabaseDao {

    @Insert
    fun insert(task: Tasks)

    @Query("DELETE FROM tasks_table")
    fun clear()

    @Query("SELECT * FROM tasks_table ORDER BY priority DESC")
    fun getAllTasks(): LiveData<List<Tasks>>

}