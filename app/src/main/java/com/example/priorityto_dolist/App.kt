package com.example.priorityto_dolist

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.renderscript.RenderScript


class App : Application() {

    companion object {
        private const val KEY_PREFERENCES = "Priority_to_do_List"

        private lateinit var instance: App

        private val sharedPreferences: SharedPreferences by lazy {
            instance.getSharedPreferences(KEY_PREFERENCES, Context.MODE_PRIVATE)
        }

        private val filesHelper by lazy { FilesHelperImpl() }

        val repository: PrioritytodoList by lazy {
            PrioritytodoListImpl(
                    sharedPreferences,
                    filesHelper
            )
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}