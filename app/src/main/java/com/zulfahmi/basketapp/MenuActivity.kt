package com.zulfahmi.basketapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_basket_app.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        btn_history.setOnClickListener{
            startActivity(Intent(this, HistoryActivity::class.java))
        }
    }
}
