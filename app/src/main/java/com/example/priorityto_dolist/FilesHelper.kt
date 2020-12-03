package com.example.priorityto_dolist

import java.io.File

interface FilesHelper {

    fun saveData(data: String)

    fun getData(): File

    fun deleteData()
}