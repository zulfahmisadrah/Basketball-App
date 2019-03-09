package com.zulfahmi.basketapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var pointA = 0
    var pointB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add_one_a.setOnClickListener{
            pointA++
            tv_score_a.text = pointA.toString()
        }
        btn_add_one_b.setOnClickListener{
            pointB++
            tv_score_b.text = pointB.toString()
        }
        btn_add_three_a.setOnClickListener{
            pointA+=3
            tv_score_a.text = pointA.toString()
        }
        btn_add_three_b.setOnClickListener{
            pointB+=3
            tv_score_b.text = pointB.toString()
        }
        btn_reset.setOnClickListener{
            pointA = 0
            pointB = 0
            tv_score_a.text = pointA.toString()
            tv_score_b.text = pointB.toString()
        }

    }

}
