package com.example.codelab_room

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.codelab_room.databinding.RecyclerWordItemBinding

class WordListAdapter internal constructor(context: Context) :
    RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var words = emptyList<WordEntity>()

    inner class WordViewHolder(private val binding: RecyclerWordItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bin(wordEntity: WordEntity) {
            binding.item = wordEntity
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val binding = RecyclerWordItemBinding.inflate(inflater, parent, false)
        return WordViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) =
        holder.bin(words[position])

    override fun getItemCount(): Int = words.size

    internal fun setWords(words: List<WordEntity>) {
        this.words = words
        notifyDataSetChanged()
    }
}