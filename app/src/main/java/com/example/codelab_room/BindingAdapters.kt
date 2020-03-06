package com.example.codelab_room

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("data")
fun setRecyclerViewProperties(recyclerView: RecyclerView?, words: List<WordEntity>?) {
    val adapter = recyclerView?.adapter
    if (adapter is WordListAdapter && words != null) {
        adapter.setWords(words)
    }
}