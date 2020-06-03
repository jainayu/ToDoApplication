package com.example.todoapplication.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date
import java.time.LocalDate
import java.util.*

@Entity(tableName = "tasks_table")
data class Tasks(
    @PrimaryKey(autoGenerate = true)
    var tasksId: Long = 0L,

    @ColumnInfo(name = "task_title")
    val title: String,

    @ColumnInfo(name = "short_description")
    val shortDesc: String = " ",

    @ColumnInfo(name = "priority")
    val priority: Int = 1,

    @ColumnInfo(name = "completed")
    var completed: Boolean = false





)