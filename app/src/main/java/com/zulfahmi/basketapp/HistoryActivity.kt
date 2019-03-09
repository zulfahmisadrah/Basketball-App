package com.zulfahmi.basketapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.zulfahmi.basketapp.adapter.RvAdapter
import com.zulfahmi.basketapp.model.Matches
import kotlinx.android.synthetic.main.activity_history.*

class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val listMatches = listOf(
            Matches(100, 80),
            Matches(99, 90),
            Matches(120, 85),
            Matches(131, 10)
        )

        val matchesAdapter = RvAdapter(applicationContext, listMatches)

        recycler_view.apply{
            layoutManager = LinearLayoutManager(this@HistoryActivity)
            adapter = matchesAdapter
        }
    }
}
