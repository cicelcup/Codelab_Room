package com.example.codelab_room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var wordVM: WordVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        wordVM = ViewModelProvider(this).get(WordVM::class.java)

        setContentView(R.layout.activity_main)
    }
}
