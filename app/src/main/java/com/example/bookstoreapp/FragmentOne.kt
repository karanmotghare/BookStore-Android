package com.example.bookstoreapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView


class FragmentOne : Fragment() {

    private lateinit var gridView: GridView

    var topList: MutableList<Int> = mutableListOf(
        R.drawable.top_one,R.drawable.top_two,
        R.drawable.top_three,R.drawable.top_four,
        R.drawable.top_five,R.drawable.top_six,
        R.drawable.top_seven,R.drawable.top_eight,
        R.drawable.top_nine,R.drawable.top_ten,
        R.drawable.top_one,R.drawable.top_two,
        R.drawable.top_three,R.drawable.top_four,
        R.drawable.top_five,R.drawable.top_six,
        R.drawable.top_seven,R.drawable.top_eight,
        R.drawable.top_nine,R.drawable.top_ten
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gridView = view.findViewById(R.id.grid_view)

        val adapter = TopListAdapter(topList,requireContext())

        gridView.adapter = adapter
    }

}