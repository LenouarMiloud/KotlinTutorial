package com.robot.anonyme.toastwithbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeButton.setOnClickListener {
            Toast.makeText(this,"Hello to Android Developement with Kotlin ",Toast.LENGTH_LONG).show();
        }
    }
}
