package com.example.codelab_room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.codelab_room.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var wordVM: WordVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        wordVM = ViewModelProvider(this).get(WordVM::class.java)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        binding.activityViewModel = wordVM
        binding.lifecycleOwner = this

        words_recyclerView.adapter = WordListAdapter(this)
        words_recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
