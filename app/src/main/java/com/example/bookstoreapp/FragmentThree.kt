package com.example.bookstoreapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.fragment_three.*
import kotlinx.android.synthetic.main.fragment_two.*

class FragmentThree : Fragment() {

    private var fictionList : MutableList<Int> = mutableListOf(
        R.drawable.fiction_one, R.drawable.fiction_two,
        R.drawable.fiction_three, R.drawable.fiction_four,
        R.drawable.fiction_five, R.drawable.fiction_six,
        R.drawable.fiction_seven, R.drawable.fiction_eight,
        R.drawable.fiction_nine, R.drawable.fiction_ten,
        R.drawable.fiction_one, R.drawable.fiction_two,
        R.drawable.fiction_three, R.drawable.fiction_four,
        R.drawable.fiction_five, R.drawable.fiction_six,
        R.drawable.fiction_seven, R.drawable.fiction_eight,
        R.drawable.fiction_nine, R.drawable.fiction_ten
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RecyclerViewAdapter(fictionList)
        recycler_view2.adapter = adapter
        val layout = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recycler_view2.layoutManager = layout

    }

}