package com.example.matchit

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
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
        val textView1=findViewById<TextView>(R.id.textView1)

        layoutTop.setVisibility(LinearLayout.VISIBLE)
        layoutEasy.setVisibility(LinearLayout.VISIBLE)
        layoutMed.setVisibility(LinearLayout.GONE)
        layoutHard.setVisibility(LinearLayout.GONE)
        textView1.text = "Pick your level"

        buttonEasy.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.VISIBLE)
            layoutMed.setVisibility(LinearLayout.GONE)
            layoutHard.setVisibility(LinearLayout.GONE)
            textView1.text = "Loading"
            puzzleList = generatePuzzle(12, 6)
            textView1.text = "Match It"
        }

        buttonMed.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.GONE)
            layoutMed.setVisibility(LinearLayout.VISIBLE)
            layoutHard.setVisibility(LinearLayout.GONE)
            textView1.text = "Loading"
            puzzleList = generatePuzzle(20, 10)
            textView1.text = "Match It"
        }

        buttonHard.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.GONE)
            layoutMed.setVisibility(LinearLayout.GONE)
            layoutHard.setVisibility(LinearLayout.VISIBLE)
            textView1.text = "Loading"
            puzzleList = generatePuzzle(30, 15)
            textView1.text = "Match It"
        }

        //create varaibles for each Easy button buttonEasy0-11 and setOnClickListener
        val  buttonEasy0=findViewById<Button>(R.id.buttonEasy0)
        buttonEasy0.setOnClickListener {}
        val  buttonEasy1=findViewById<Button>(R.id.buttonEasy1)
        buttonEasy1.setOnClickListener {}
        val  buttonEasy2=findViewById<Button>(R.id.buttonEasy2)
        buttonEasy2.setOnClickListener {}
        val  buttonEasy3=findViewById<Button>(R.id.buttonEasy3)
        buttonEasy3.setOnClickListener {}
        val  buttonEasy4=findViewById<Button>(R.id.buttonEasy4)
        buttonEasy4.setOnClickListener {}
        val  buttonEasy5=findViewById<Button>(R.id.buttonEasy5)
        buttonEasy5.setOnClickListener {}
        val  buttonEasy6=findViewById<Button>(R.id.buttonEasy6)
        buttonEasy6.setOnClickListener {}
        val  buttonEasy7=findViewById<Button>(R.id.buttonEasy7)
        buttonEasy7.setOnClickListener {}
        val  buttonEasy8=findViewById<Button>(R.id.buttonEasy8)
        buttonEasy8.setOnClickListener {}
        val  buttonEasy9=findViewById<Button>(R.id.buttonEasy9)
        buttonEasy9.setOnClickListener {}
        val  buttonEasy10=findViewById<Button>(R.id.buttonEasy10)
        buttonEasy10.setOnClickListener {}
        val  buttonEasy11=findViewById<Button>(R.id.buttonEasy11)
        buttonEasy11.setOnClickListener {}

        //create varaibles for each Easy button buttonMed0-19 and setOnClickListener
        val  buttonMed0=findViewById<Button>(R.id.buttonMed0)
        buttonMed0.setOnClickListener {}
        val  buttonMed1=findViewById<Button>(R.id.buttonMed1)
        buttonMed1.setOnClickListener {}
        val  buttonMed2=findViewById<Button>(R.id.buttonMed2)
        buttonMed2.setOnClickListener {}
        val  buttonMed3=findViewById<Button>(R.id.buttonMed3)
        buttonMed3.setOnClickListener {}
        val  buttonMed4=findViewById<Button>(R.id.buttonMed4)
        buttonMed4.setOnClickListener {}
        val  buttonMed5=findViewById<Button>(R.id.buttonMed5)
        buttonMed5.setOnClickListener {}
        val  buttonMed6=findViewById<Button>(R.id.buttonMed6)
        buttonMed6.setOnClickListener {}
        val  buttonMed7=findViewById<Button>(R.id.buttonMed7)
        buttonMed7.setOnClickListener {}
        val  buttonMed8=findViewById<Button>(R.id.buttonMed8)
        buttonMed8.setOnClickListener {}
        val  buttonMed9=findViewById<Button>(R.id.buttonMed9)
        buttonMed9.setOnClickListener {}
        val  buttonMed10=findViewById<Button>(R.id.buttonMed10)
        buttonMed10.setOnClickListener {}
        val  buttonMed11=findViewById<Button>(R.id.buttonMed11)
        buttonMed11.setOnClickListener {}
        val  buttonMed12=findViewById<Button>(R.id.buttonMed12)
        buttonMed12.setOnClickListener {}
        val  buttonMed13=findViewById<Button>(R.id.buttonMed13)
        buttonMed13.setOnClickListener {}
        val  buttonMed14=findViewById<Button>(R.id.buttonMed14)
        buttonMed14.setOnClickListener {}
        val  buttonMed15=findViewById<Button>(R.id.buttonMed15)
        buttonMed15.setOnClickListener {}
        val  buttonMed16=findViewById<Button>(R.id.buttonMed16)
        buttonMed16.setOnClickListener {}
        val  buttonMed17=findViewById<Button>(R.id.buttonMed17)
        buttonMed17.setOnClickListener {}
        val  buttonMed18=findViewById<Button>(R.id.buttonMed18)
        buttonMed18.setOnClickListener {}
        val  buttonMed19=findViewById<Button>(R.id.buttonMed19)
        buttonMed19.setOnClickListener {}

        //create varaibles for each Easy button buttonHard0-29 and setOnClickListener
        val  buttonHard0=findViewById<Button>(R.id.buttonHard0)
        buttonHard0.setOnClickListener {}
        val  buttonHard1=findViewById<Button>(R.id.buttonHard1)
        buttonHard1.setOnClickListener {}
        val  buttonHard2=findViewById<Button>(R.id.buttonHard2)
        buttonHard2.setOnClickListener {}
        val  buttonHard3=findViewById<Button>(R.id.buttonHard3)
        buttonHard3.setOnClickListener {}
        val  buttonHard4=findViewById<Button>(R.id.buttonHard4)
        buttonHard4.setOnClickListener {}
        val  buttonHard5=findViewById<Button>(R.id.buttonHard5)
        buttonHard5.setOnClickListener {}
        val  buttonHard6=findViewById<Button>(R.id.buttonHard6)
        buttonHard6.setOnClickListener {}
        val  buttonHard7=findViewById<Button>(R.id.buttonHard7)
        buttonHard7.setOnClickListener {}
        val  buttonHard8=findViewById<Button>(R.id.buttonHard8)
        buttonHard8.setOnClickListener {}
        val  buttonHard9=findViewById<Button>(R.id.buttonHard9)
        buttonHard9.setOnClickListener {}
        val  buttonHard10=findViewById<Button>(R.id.buttonHard10)
        buttonHard10.setOnClickListener {}
        val  buttonHard11=findViewById<Button>(R.id.buttonHard11)
        buttonHard11.setOnClickListener {}
        val  buttonHard12=findViewById<Button>(R.id.buttonHard12)
        buttonHard12.setOnClickListener {}
        val  buttonHard13=findViewById<Button>(R.id.buttonHard13)
        buttonHard13.setOnClickListener {}
        val  buttonHard14=findViewById<Button>(R.id.buttonHard14)
        buttonHard14.setOnClickListener {}
        val  buttonHard15=findViewById<Button>(R.id.buttonHard15)
        buttonHard15.setOnClickListener {}
        val  buttonHard16=findViewById<Button>(R.id.buttonHard16)
        buttonHard16.setOnClickListener {}
        val  buttonHard17=findViewById<Button>(R.id.buttonHard17)
        buttonHard17.setOnClickListener {}
        val  buttonHard18=findViewById<Button>(R.id.buttonHard18)
        buttonHard18.setOnClickListener {}
        val  buttonHard19=findViewById<Button>(R.id.buttonHard19)
        buttonHard19.setOnClickListener {}
        val  buttonHard20=findViewById<Button>(R.id.buttonHard20)
        buttonHard20.setOnClickListener {}
        val  buttonHard21=findViewById<Button>(R.id.buttonHard21)
        buttonHard21.setOnClickListener {}
        val  buttonHard22=findViewById<Button>(R.id.buttonHard22)
        buttonHard22.setOnClickListener {}
        val  buttonHard23=findViewById<Button>(R.id.buttonHard23)
        buttonHard23.setOnClickListener {}
        val  buttonHard24=findViewById<Button>(R.id.buttonHard24)
        buttonHard24.setOnClickListener {}
        val  buttonHard25=findViewById<Button>(R.id.buttonHard25)
        buttonHard25.setOnClickListener {}
        val  buttonHard26=findViewById<Button>(R.id.buttonHard26)
        buttonHard26.setOnClickListener {}
        val  buttonHard27=findViewById<Button>(R.id.buttonHard27)
        buttonHard27.setOnClickListener {}
        val  buttonHard28=findViewById<Button>(R.id.buttonHard28)
        buttonHard28.setOnClickListener {}
        val  buttonHard29=findViewById<Button>(R.id.buttonHard29)
        buttonHard29.setOnClickListener {}


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