package com.parasde.example.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.parasde.example.utils.DateUtil

@Entity(tableName = "USER")
class User(@PrimaryKey(autoGenerate = true) val USER_NO: Long? = null,
           @ColumnInfo val USER_NAME: String,
           @ColumnInfo val REG_DT: String = DateUtil.now()) {
}