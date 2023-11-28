package com.example.matchit

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    var puzzleList: List<Int> = ArrayList()
    var firstPick: String = ""
    var secondPick: String = ""
    var firstPickInt: Int = -1
    var secondPickInt: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val layoutTop = findViewById<LinearLayout>(R.id.LayoutTop)
        val layoutEasy = findViewById<LinearLayout>(R.id.LayoutEasy)
        val layoutMed = findViewById<LinearLayout>(R.id.LayoutMedium)
        val layoutHard = findViewById<LinearLayout>(R.id.LayoutHard)
        val  buttonEasy=findViewById<Button>(R.id.ButtonEasy)
        val  buttonMed=findViewById<Button>(R.id.ButtonMed)
        val  buttonHard=findViewById<Button>(R.id.ButtonHard)

        layoutTop.setVisibility(LinearLayout.VISIBLE)
        layoutEasy.setVisibility(LinearLayout.VISIBLE)
        layoutMed.setVisibility(LinearLayout.GONE)
        layoutHard.setVisibility(LinearLayout.GONE)

        buttonEasy.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.VISIBLE)
            layoutMed.setVisibility(LinearLayout.GONE)
            layoutHard.setVisibility(LinearLayout.GONE)
            puzzleList = generatePuzzle(12, 6)
        }

        buttonMed.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.GONE)
            layoutMed.setVisibility(LinearLayout.VISIBLE)
            layoutHard.setVisibility(LinearLayout.GONE)
            puzzleList = generatePuzzle(20, 10)
        }

        buttonHard.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.GONE)
            layoutMed.setVisibility(LinearLayout.GONE)
            layoutHard.setVisibility(LinearLayout.VISIBLE)
            puzzleList = generatePuzzle(30, 15)
        }

        //create varaibles for each Easy button buttonEasy0-9 and setOnClickListener


        //create varaibles for each Easy button buttonMed0-19 and setOnClickListener

        //create varaibles for each Easy button buttonHard0-29 and setOnClickListener
    }

    fun generatePuzzle(numberOfItems: Int, topNumber: Int): ArrayList<Int> {

        val arrayList = ArrayList<Int>(numberOfItems)
        val availableNumbers = mutableListOf<Int>()

        // Populate availableNumbers with two occurrences of each number from 1 to topNumber
        for (num in 1..topNumber) {
            availableNumbers.add(num)
            availableNumbers.add(num)
        }

        repeat(numberOfItems) {
            // Randomly select a number from the availableNumbers list
            val randomNumberIndex = Random.nextInt(availableNumbers.size)
            val randomNumber = availableNumbers[randomNumberIndex]

            // Add the selected number to the ArrayList
            arrayList.add(randomNumber)

            // Remove the selected number from the availableNumbers list
            availableNumbers.removeAt(randomNumberIndex)
        }

        return arrayList
    }

}