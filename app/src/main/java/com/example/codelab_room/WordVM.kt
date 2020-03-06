package com.example.codelab_room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class WordVM(application: Application) : AndroidViewModel(application) {
    private val wordDao: WordDao = WordDB.getDatabase(application).wordDao()
    val allWords: LiveData<List<WordEntity>> = wordDao.getEnglishWords()
    var x: Int = 0

    private fun insert(wordEntity: WordEntity) = viewModelScope.launch {
        wordDao.insertEnglishWord(wordEntity)
    }

    fun fabClicked() {
        insert(WordEntity("Great $x-$x"))
        x++
    }
}