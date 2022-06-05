package com.example.bookstoreapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_two.*


class FragmentTwo : Fragment() {

    private var childrenList : MutableList<Int> = mutableListOf(
        R.drawable.children_one,R.drawable.children_two,
        R.drawable.children_three,R.drawable.children_four,
        R.drawable.children_five,R.drawable.children_six,
        R.drawable.children_seven,R.drawable.children_eight,
        R.drawable.children_nine,R.drawable.children_ten ,
        R.drawable.children_one,R.drawable.children_two,
        R.drawable.children_three,R.drawable.children_four,
        R.drawable.children_five,R.drawable.children_six,
        R.drawable.children_seven,R.drawable.children_eight,
        R.drawable.children_nine,R.drawable.children_ten
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RecyclerViewAdapter(childrenList)
        val layout = GridLayoutManager(requireContext(),3)
        recycler_view.layoutManager = layout
        recycler_view.adapter = adapter

    }

}