package com.example.priorityto_dolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    private val repository by lazy { App.repository }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val noteButton = findViewById<Button>(R.id.focusButton)
        val noteButton2 = findViewById<Button>(R.id.iMustCompleteButton)
        val noteButton3 = findViewById<Button>(R.id.iReallyShouldButton)
        val noteButton4 = findViewById<Button>(R.id.ifIHaveTimeButton)
        val noteButton5 = findViewById<Button>(R.id.threeThingsButton)
        val noteButton6 = findViewById<Button>(R.id.dontForgetButton)
        val noteButton7 = findViewById<Button>(R.id.contactHistoryButton)
        val notebutton8 = findViewById<Button>(R.id.placesToGoButton)
        val noteButton9 = findViewById<Button>(R.id.caresForLaterButton)


        noteButton.setOnClickListener {
            val intent = Intent(this, notesForDailyFocus::class.java)
            startActivity(intent)
        }
        noteButton2.setOnClickListener {
            val intent = Intent(this, Notes_for_what_I_must_complete::class.java)
            startActivity(intent)
        }
        noteButton3.setOnClickListener {
            val intent = Intent( this, Notes_for_what_I_really_should_do::class.java)
            startActivity(intent)
        }
        noteButton4.setOnClickListener {
            val intent = Intent(this, Notes_for_if_I_have_time::class.java)
            startActivity((intent))
        }
        noteButton5.setOnClickListener {
            val intent = Intent(this, Notes_for_top_three_things::class.java)
            startActivity((intent))
        }
        noteButton6.setOnClickListener {
            val intent = Intent(this, Notes_for_what_not_to_forget::class.java)
            startActivity((intent))
        }
        noteButton7.setOnClickListener {
            val intent = Intent( this, Notes_for_calls_and_messages::class.java)
            startActivity((intent))
        }
        notebutton8.setOnClickListener {
            val intent = Intent( this, Notes_for_errands_to_run::class.java)
            startActivity((intent))
        }
        noteButton9.setOnClickListener {
            val intent = Intent( this, Notes_for_errands_to_run::class.java)
            startActivity((intent))
        }

    }
}




