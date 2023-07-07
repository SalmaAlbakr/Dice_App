package com.sm.diceapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val diceImg = findViewById<ImageView>(R.id.imageView)
        val dice = Dice(sideNum = 6)



        diceImg.setOnClickListener {

            when (dice.roll()) {

                1 -> diceImg.setImageResource(R.drawable.dice_1)
                2 -> diceImg.setImageResource(R.drawable.dice_2)
                3 -> diceImg.setImageResource(R.drawable.dice_3)
                4 -> diceImg.setImageResource(R.drawable.dice_4)
                5 -> diceImg.setImageResource(R.drawable.dice_5)
                6 -> diceImg.setImageResource(R.drawable.dice_6)


            }

        }

    }

    class Dice(val sideNum: Int) {
        fun roll(): Int {
            val rangeDice = 1..sideNum
            return rangeDice.random()
        }
    }
}