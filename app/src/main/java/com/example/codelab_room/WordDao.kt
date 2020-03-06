package com.example.codelab_room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordDao {
    @Query("select * from WordEntity order by englishWord asc")
    fun getEnglishWords(): LiveData<List<WordEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertEnglishWord(wordEntity: WordEntity)
}