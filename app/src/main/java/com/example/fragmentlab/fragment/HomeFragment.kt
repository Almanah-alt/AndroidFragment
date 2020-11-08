package com.example.fragmentlab.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentlab.MyAdapter
import com.example.fragmentlab.Post
import com.example.fragmentlab.R
class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var postList = mutableListOf(
            Post(image_id = R.drawable.fimg),
            Post(image_id = R.drawable.simg)
        )

        val post_list = view.findViewById<RecyclerView>(R.id.post_item_list)
        post_list.layoutManager = LinearLayoutManager(activity)
        post_list.adapter = MyAdapter(postList)
        super.onViewCreated(view, savedInstanceState)
    }


}