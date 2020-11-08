package com.example.fragmentlab

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_item.view.*

class MyAdapter(
    private val itemList: List<Post> = listOf()
) :RecyclerView.Adapter<MyAdapter.HintViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HintViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_item, parent, false)
        return HintViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: HintViewHolder, position: Int) {
        holder.bindHint(itemList[position])
    }


    inner class HintViewHolder(
        private val view: View
    ):RecyclerView.ViewHolder(view){

        fun bindHint(post: Post){
            view.post_image.setImageResource(post.image_id)
        }
    }
}