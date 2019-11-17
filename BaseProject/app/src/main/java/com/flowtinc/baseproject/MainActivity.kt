package com.flowtinc.baseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.util.Log

import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import java.security.AccessController.getContext
import java.util.*

class MainActivity : AppCompatActivity() {

    // Note: UIElements
    lateinit var myImageView: ImageView

    lateinit var myButton: Button

    // Note: Properties
    private val TAG = "MainActivity"

    // Note: Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImageView = findViewById(R.id.myImageView)

        myButton = findViewById(R.id.myButton)
        myButton.setOnClickListener {
            myButtonPressed()
        }
    }

    // Note: Button Clicks
    private fun myButtonPressed() {

        Log.d(TAG, "myButton was pressed")

        rollDice()
    }

    // Note: Helper Functions
    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        myImageView.setImageResource(drawableResource)
    }
}
