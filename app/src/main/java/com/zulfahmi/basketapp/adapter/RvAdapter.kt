package com.zulfahmi.basketapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import com.zulfahmi.basketapp.R
import com.zulfahmi.basketapp.model.Matches
import kotlinx.android.synthetic.main.history_item.view.*

class RvAdapter(val context: Context, var matchList: List<Matches>): RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(viewGroup.context).inflate(
                R.layout.history_item,
                viewGroup,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(matchList[position])
    }

    override fun getItemCount(): Int = matchList.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val tvScoreA = view.tv_history_score_a
        private val tvScoreB = view.tv_history_score_b

        fun bindItems(matches: Matches){
            tvScoreA.text = matches.scoreA.toString()
            tvScoreB.text = matches.scoreB.toString()
        }
    }
}
