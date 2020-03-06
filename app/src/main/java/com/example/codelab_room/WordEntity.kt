package com.example.codelab_room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WordEntity(@PrimaryKey val englishWord: String) {
}