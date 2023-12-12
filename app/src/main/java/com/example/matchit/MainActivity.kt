package com.example.matchit

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    // varialbes that are used to hold pick data
    var puzzleList: List<Int> = ArrayList()
    var firstPick: String = ""
    var secondPick: String = ""
    var matched: Boolean = false
    var numberofTries: Int = 0
    var numberLeft: Int = 0

    // buttons used in layouts - use lateinit so I can initialize in main function but use in other functions
    lateinit var firstButton: Button
    lateinit var secondButton: Button
    lateinit var  buttonEasy0: Button
    lateinit var  buttonEasy1: Button
    lateinit var  buttonEasy2: Button
    lateinit var  buttonEasy3: Button
    lateinit var  buttonEasy4: Button
    lateinit var  buttonEasy5: Button
    lateinit var  buttonEasy6: Button
    lateinit var  buttonEasy7: Button
    lateinit var  buttonEasy8: Button
    lateinit var  buttonEasy9: Button
    lateinit var  buttonEasy10: Button
    lateinit var  buttonEasy11: Button

    lateinit var  buttonMed0: Button
    lateinit var  buttonMed1: Button
    lateinit var  buttonMed2: Button
    lateinit var  buttonMed3: Button
    lateinit var  buttonMed4: Button
    lateinit var  buttonMed5: Button
    lateinit var  buttonMed6: Button
    lateinit var  buttonMed7: Button
    lateinit var  buttonMed8: Button
    lateinit var  buttonMed9: Button
    lateinit var  buttonMed10: Button
    lateinit var  buttonMed11: Button
    lateinit var  buttonMed12: Button
    lateinit var  buttonMed13: Button
    lateinit var  buttonMed14: Button
    lateinit var  buttonMed15: Button
    lateinit var  buttonMed16: Button
    lateinit var  buttonMed17: Button
    lateinit var  buttonMed18: Button
    lateinit var  buttonMed19: Button

    lateinit var  buttonHard0: Button
    lateinit var  buttonHard1: Button
    lateinit var  buttonHard2: Button
    lateinit var  buttonHard3: Button
    lateinit var  buttonHard4: Button
    lateinit var  buttonHard5: Button
    lateinit var  buttonHard6: Button
    lateinit var  buttonHard7: Button
    lateinit var  buttonHard8: Button
    lateinit var  buttonHard9: Button
    lateinit var  buttonHard10: Button
    lateinit var  buttonHard11: Button
    lateinit var  buttonHard12: Button
    lateinit var  buttonHard13: Button
    lateinit var  buttonHard14: Button
    lateinit var  buttonHard15: Button
    lateinit var  buttonHard16: Button
    lateinit var  buttonHard17: Button
    lateinit var  buttonHard18: Button
    lateinit var  buttonHard19: Button
    lateinit var  buttonHard20: Button
    lateinit var  buttonHard21: Button
    lateinit var  buttonHard22: Button
    lateinit var  buttonHard23: Button
    lateinit var  buttonHard24: Button
    lateinit var  buttonHard25: Button
    lateinit var  buttonHard26: Button
    lateinit var  buttonHard27: Button
    lateinit var  buttonHard28: Button
    lateinit var  buttonHard29: Button

    // main layout variables
    lateinit var textView1: TextView
    lateinit var layoutTop: LinearLayout
    lateinit var layoutEasy: LinearLayout
    lateinit var layoutMed: LinearLayout
    lateinit var layoutHard: LinearLayout
    lateinit var buttonEasy: Button
    lateinit var buttonMed: Button
    lateinit var buttonHard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize layouts
        layoutTop = findViewById<LinearLayout>(R.id.LayoutTop)
        layoutEasy = findViewById<LinearLayout>(R.id.LayoutEasy)
        layoutMed = findViewById<LinearLayout>(R.id.LayoutMedium)
        layoutHard = findViewById<LinearLayout>(R.id.LayoutHard)

        // initialize top buttons
        buttonEasy=findViewById<Button>(R.id.ButtonEasy)
        buttonMed=findViewById<Button>(R.id.ButtonMed)
        buttonHard=findViewById<Button>(R.id.ButtonHard)
        textView1=findViewById<TextView>(R.id.textView1)

        // initialize Easy buttons
        buttonEasy0=findViewById<Button>(R.id.buttonEasy0)
        buttonEasy1=findViewById<Button>(R.id.buttonEasy1)
        buttonEasy2=findViewById<Button>(R.id.buttonEasy2)
        buttonEasy3=findViewById<Button>(R.id.buttonEasy3)
        buttonEasy4=findViewById<Button>(R.id.buttonEasy4)
        buttonEasy5=findViewById<Button>(R.id.buttonEasy5)
        buttonEasy6=findViewById<Button>(R.id.buttonEasy6)
        buttonEasy7=findViewById<Button>(R.id.buttonEasy7)
        buttonEasy8=findViewById<Button>(R.id.buttonEasy8)
        buttonEasy9=findViewById<Button>(R.id.buttonEasy9)
        buttonEasy10=findViewById<Button>(R.id.buttonEasy10)
        buttonEasy11=findViewById<Button>(R.id.buttonEasy11)

        // initialize Medmium buttons
        buttonMed0=findViewById<Button>(R.id.buttonMed0)
        buttonMed1=findViewById<Button>(R.id.buttonMed1)
        buttonMed2=findViewById<Button>(R.id.buttonMed2)
        buttonMed3=findViewById<Button>(R.id.buttonMed3)
        buttonMed4=findViewById<Button>(R.id.buttonMed4)
        buttonMed5=findViewById<Button>(R.id.buttonMed5)
        buttonMed6=findViewById<Button>(R.id.buttonMed6)
        buttonMed7=findViewById<Button>(R.id.buttonMed7)
        buttonMed8=findViewById<Button>(R.id.buttonMed8)
        buttonMed9=findViewById<Button>(R.id.buttonMed9)
        buttonMed10=findViewById<Button>(R.id.buttonMed10)
        buttonMed11=findViewById<Button>(R.id.buttonMed11)
        buttonMed12=findViewById<Button>(R.id.buttonMed12)
        buttonMed13=findViewById<Button>(R.id.buttonMed13)
        buttonMed14=findViewById<Button>(R.id.buttonMed14)
        buttonMed15=findViewById<Button>(R.id.buttonMed15)
        buttonMed16=findViewById<Button>(R.id.buttonMed16)
        buttonMed17=findViewById<Button>(R.id.buttonMed17)
        buttonMed18=findViewById<Button>(R.id.buttonMed18)
        buttonMed19=findViewById<Button>(R.id.buttonMed19)

        // initialize Hard buttons
        buttonHard0=findViewById<Button>(R.id.buttonHard0)
        buttonHard1=findViewById<Button>(R.id.buttonHard1)
        buttonHard2=findViewById<Button>(R.id.buttonHard2)
        buttonHard3=findViewById<Button>(R.id.buttonHard3)
        buttonHard4=findViewById<Button>(R.id.buttonHard4)
        buttonHard5=findViewById<Button>(R.id.buttonHard5)
        buttonHard6=findViewById<Button>(R.id.buttonHard6)
        buttonHard7=findViewById<Button>(R.id.buttonHard7)
        buttonHard8=findViewById<Button>(R.id.buttonHard8)
        buttonHard9=findViewById<Button>(R.id.buttonHard9)
        buttonHard10=findViewById<Button>(R.id.buttonHard10)
        buttonHard11=findViewById<Button>(R.id.buttonHard11)
        buttonHard12=findViewById<Button>(R.id.buttonHard12)
        buttonHard13=findViewById<Button>(R.id.buttonHard13)
        buttonHard14=findViewById<Button>(R.id.buttonHard14)
        buttonHard15=findViewById<Button>(R.id.buttonHard15)
        buttonHard16=findViewById<Button>(R.id.buttonHard16)
        buttonHard17=findViewById<Button>(R.id.buttonHard17)
        buttonHard18=findViewById<Button>(R.id.buttonHard18)
        buttonHard19=findViewById<Button>(R.id.buttonHard19)
        buttonHard20=findViewById<Button>(R.id.buttonHard20)
        buttonHard21=findViewById<Button>(R.id.buttonHard21)
        buttonHard22=findViewById<Button>(R.id.buttonHard22)
        buttonHard23=findViewById<Button>(R.id.buttonHard23)
        buttonHard24=findViewById<Button>(R.id.buttonHard24)
        buttonHard25=findViewById<Button>(R.id.buttonHard25)
        buttonHard26=findViewById<Button>(R.id.buttonHard26)
        buttonHard27=findViewById<Button>(R.id.buttonHard27)
        buttonHard28=findViewById<Button>(R.id.buttonHard28)
        buttonHard29=findViewById<Button>(R.id.buttonHard29)


        // initial setup of layouts and textview
        layoutTop.setVisibility(LinearLayout.VISIBLE)
        layoutEasy.setVisibility(LinearLayout.GONE)
        layoutMed.setVisibility(LinearLayout.GONE)
        layoutHard.setVisibility(LinearLayout.GONE)
        textView1.text = "Pick your level"

        // setup top navigation button clicks
        // setup Easy Level button click
        buttonEasy.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.VISIBLE)
            layoutMed.setVisibility(LinearLayout.GONE)
            layoutHard.setVisibility(LinearLayout.GONE)
            textView1.text = "Loading"
            puzzleList = generatePuzzle(12, 6)
            textView1.text = "Match It"
            numberLeft = 6
            numberofTries =0
            buttonEasy0.text = ""
            buttonEasy1.text = ""
            buttonEasy2.text = ""
            buttonEasy3.text = ""
            buttonEasy4.text = ""
            buttonEasy5.text = ""
            buttonEasy6.text = ""
            buttonEasy7.text = ""
            buttonEasy8.text = ""
            buttonEasy9.text = ""
            buttonEasy10.text = ""
            buttonEasy11.text = ""
            buttonEasy0.isClickable = true
            buttonEasy1.isClickable = true
            buttonEasy2.isClickable = true
            buttonEasy3.isClickable = true
            buttonEasy4.isClickable = true
            buttonEasy5.isClickable = true
            buttonEasy6.isClickable = true
            buttonEasy7.isClickable = true
            buttonEasy8.isClickable = true
            buttonEasy9.isClickable = true
            buttonEasy10.isClickable = true
            buttonEasy11.isClickable = true
        }

        // setup Medium Level button click
        buttonMed.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.GONE)
            layoutMed.setVisibility(LinearLayout.VISIBLE)
            layoutHard.setVisibility(LinearLayout.GONE)
            textView1.text = "Loading"
            puzzleList = generatePuzzle(20, 10)
            textView1.text = "Match It"
            numberLeft = 10
            numberofTries =0
            buttonMed0.text = ""
            buttonMed1.text = ""
            buttonMed2.text = ""
            buttonMed3.text = ""
            buttonMed4.text = ""
            buttonMed5.text = ""
            buttonMed6.text = ""
            buttonMed7.text = ""
            buttonMed8.text = ""
            buttonMed9.text = ""
            buttonMed10.text = ""
            buttonMed11.text = ""
            buttonMed12.text = ""
            buttonMed13.text = ""
            buttonMed14.text = ""
            buttonMed15.text = ""
            buttonMed16.text = ""
            buttonMed17.text = ""
            buttonMed18.text = ""
            buttonMed19.text = ""
            buttonMed0.isClickable = true
            buttonMed1.isClickable = true
            buttonMed2.isClickable = true
            buttonMed3.isClickable = true
            buttonMed4.isClickable = true
            buttonMed5.isClickable = true
            buttonMed6.isClickable = true
            buttonMed7.isClickable = true
            buttonMed8.isClickable = true
            buttonMed9.isClickable = true
            buttonMed10.isClickable = true
            buttonMed11.isClickable = true
            buttonMed12.isClickable = true
            buttonMed13.isClickable = true
            buttonMed14.isClickable = true
            buttonMed15.isClickable = true
            buttonMed16.isClickable = true
            buttonMed17.isClickable = true
            buttonMed18.isClickable = true
            buttonMed19.isClickable = true
        }

        // setup Hard Level button click
        buttonHard.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.GONE)
            layoutMed.setVisibility(LinearLayout.GONE)
            layoutHard.setVisibility(LinearLayout.VISIBLE)
            textView1.text = "Loading"
            puzzleList = generatePuzzle(30, 15)
            textView1.text = "Match It"
            numberLeft = 15
            numberofTries =0
            buttonHard0.text = ""
            buttonHard1.text = ""
            buttonHard2.text = ""
            buttonHard3.text = ""
            buttonHard4.text = ""
            buttonHard5.text = ""
            buttonHard6.text = ""
            buttonHard7.text = ""
            buttonHard8.text = ""
            buttonHard9.text = ""
            buttonHard10.text = ""
            buttonHard11.text = ""
            buttonHard12.text = ""
            buttonHard13.text = ""
            buttonHard14.text = ""
            buttonHard15.text = ""
            buttonHard16.text = ""
            buttonHard17.text = ""
            buttonHard18.text = ""
            buttonHard19.text = ""
            buttonHard20.text = ""
            buttonHard21.text = ""
            buttonHard22.text = ""
            buttonHard23.text = ""
            buttonHard24.text = ""
            buttonHard25.text = ""
            buttonHard26.text = ""
            buttonHard27.text = ""
            buttonHard28.text = ""
            buttonHard29.text = ""
            buttonHard0.isClickable = true
            buttonHard1.isClickable = true
            buttonHard2.isClickable = true
            buttonHard3.isClickable = true
            buttonHard4.isClickable = true
            buttonHard5.isClickable = true
            buttonHard6.isClickable = true
            buttonHard7.isClickable = true
            buttonHard8.isClickable = true
            buttonHard9.isClickable = true
            buttonHard10.isClickable = true
            buttonHard11.isClickable = true
            buttonHard12.isClickable = true
            buttonHard13.isClickable = true
            buttonHard14.isClickable = true
            buttonHard15.isClickable = true
            buttonHard16.isClickable = true
            buttonHard17.isClickable = true
            buttonHard18.isClickable = true
            buttonHard19.isClickable = true
            buttonHard20.isClickable = true
            buttonHard21.isClickable = true
            buttonHard22.isClickable = true
            buttonHard23.isClickable = true
            buttonHard24.isClickable = true
            buttonHard25.isClickable = true
            buttonHard26.isClickable = true
            buttonHard27.isClickable = true
            buttonHard28.isClickable = true
            buttonHard29.isClickable = true
        }

        //varaibles for each Easy button buttonEasy0-11 and setOnClickListener
        buttonEasy0.setOnClickListener {
            setPicks(buttonEasy0, 0)
        }
        buttonEasy1.setOnClickListener {
            setPicks(buttonEasy1, 1)
        }
        buttonEasy2.setOnClickListener {
            setPicks(buttonEasy2, 2)
        }
        buttonEasy3.setOnClickListener {
            setPicks(buttonEasy3, 3)
        }
        buttonEasy4.setOnClickListener {
            setPicks(buttonEasy4, 4)
        }
        buttonEasy5.setOnClickListener {
            setPicks(buttonEasy5, 5)
        }
        buttonEasy6.setOnClickListener {
            setPicks(buttonEasy6, 6)
        }
        buttonEasy7.setOnClickListener {
            setPicks(buttonEasy7, 7)
        }
        buttonEasy8.setOnClickListener {
            setPicks(buttonEasy8, 8)
        }
        buttonEasy9.setOnClickListener {
            setPicks(buttonEasy9, 9)
        }
        buttonEasy10.setOnClickListener {
            setPicks(buttonEasy10, 10)
        }
        buttonEasy11.setOnClickListener {
            setPicks(buttonEasy11, 11)
        }

        //varaibles for each Medium button buttonMed0-19 and setOnClickListener
        buttonMed0.setOnClickListener {
            setPicks(buttonMed0, 0)
        }
        buttonMed1.setOnClickListener {
            setPicks(buttonMed1, 1)
        }
        buttonMed2.setOnClickListener {
            setPicks(buttonMed2, 2)
        }
        buttonMed3.setOnClickListener {
            setPicks(buttonMed3, 3)
        }
        buttonMed4.setOnClickListener {
            setPicks(buttonMed4, 4)
        }
        buttonMed5.setOnClickListener {
            setPicks(buttonMed5, 5)
        }
        buttonMed6.setOnClickListener {
            setPicks(buttonMed6, 6)
        }
        buttonMed7.setOnClickListener {
            setPicks(buttonMed7, 7)
        }
        buttonMed8.setOnClickListener {
            setPicks(buttonMed8, 8)
        }
        buttonMed9=findViewById<Button>(R.id.buttonMed9)
        buttonMed9.setOnClickListener {
            setPicks(buttonMed9, 9)
        }
        buttonMed10=findViewById<Button>(R.id.buttonMed10)
        buttonMed10.setOnClickListener {
            setPicks(buttonMed10, 10)

        }
        buttonMed11=findViewById<Button>(R.id.buttonMed11)
        buttonMed11.setOnClickListener {
            setPicks(buttonMed11, 11)

        }
        buttonMed12=findViewById<Button>(R.id.buttonMed12)
        buttonMed12.setOnClickListener {
            setPicks(buttonMed12, 12)

        }
        buttonMed13=findViewById<Button>(R.id.buttonMed13)
        buttonMed13.setOnClickListener {
            setPicks(buttonMed13, 13)

        }
        buttonMed14=findViewById<Button>(R.id.buttonMed14)
        buttonMed14.setOnClickListener {
            setPicks(buttonMed14, 14)

        }
        buttonMed15=findViewById<Button>(R.id.buttonMed15)
        buttonMed15.setOnClickListener {
            setPicks(buttonMed15, 15)

        }
        buttonMed16=findViewById<Button>(R.id.buttonMed16)
        buttonMed16.setOnClickListener {
            setPicks(buttonMed16, 16)

        }
        buttonMed17=findViewById<Button>(R.id.buttonMed17)
        buttonMed17.setOnClickListener {
            setPicks(buttonMed17, 17)

        }
        buttonMed18=findViewById<Button>(R.id.buttonMed18)
        buttonMed18.setOnClickListener {
            setPicks(buttonMed18, 18)

        }
        buttonMed19=findViewById<Button>(R.id.buttonMed19)
        buttonMed19.setOnClickListener {
            setPicks(buttonMed19, 19)

        }

        // varaibles for each Hard button buttonHard0-29 and setOnClickListener
        buttonHard0.setOnClickListener {
            setPicks(buttonHard0, 0)
        }
        buttonHard1.setOnClickListener {
            setPicks(buttonHard1, 1)
        }
        buttonHard2.setOnClickListener {
            setPicks(buttonHard2, 2)
        }
        buttonHard3.setOnClickListener {
            setPicks(buttonHard3, 3)
        }
        buttonHard4.setOnClickListener {
            setPicks(buttonHard4, 4)
        }
        buttonHard5.setOnClickListener {
            setPicks(buttonHard5, 5)
        }
        buttonHard6.setOnClickListener {
            setPicks(buttonHard6, 6)
        }
        buttonHard7.setOnClickListener {
            setPicks(buttonHard7, 7)
        }
        buttonHard8.setOnClickListener {
            setPicks(buttonHard8, 8)
        }
        buttonHard9.setOnClickListener {
            setPicks(buttonHard9, 9)
        }
        buttonHard10.setOnClickListener {
            setPicks(buttonHard10, 10)
        }
        buttonHard11.setOnClickListener {
            setPicks(buttonHard11, 11)
        }
        buttonHard12.setOnClickListener {
            setPicks(buttonHard12, 12)
        }
        buttonHard13.setOnClickListener {
            setPicks(buttonHard13, 13)
        }
        buttonHard14.setOnClickListener {
            setPicks(buttonHard14, 14)
        }
        buttonHard15.setOnClickListener {
            setPicks(buttonHard15, 15)
        }
        buttonHard16.setOnClickListener {
            setPicks(buttonHard16, 16)
        }
        buttonHard17.setOnClickListener {
            setPicks(buttonHard17, 17)
        }
        buttonHard18.setOnClickListener {
            setPicks(buttonHard18, 18)
        }
        buttonHard19.setOnClickListener {
            setPicks(buttonHard19, 19)
        }
        buttonHard20.setOnClickListener {
            setPicks(buttonHard20, 20)
        }
        buttonHard21.setOnClickListener {
            setPicks(buttonHard21, 21)
        }
        buttonHard22.setOnClickListener {
            setPicks(buttonHard22, 22)
        }
        buttonHard23.setOnClickListener {
            setPicks(buttonHard23, 23)
        }
        buttonHard24.setOnClickListener {
            setPicks(buttonHard24, 24)

        }
        buttonHard25.setOnClickListener {
            setPicks(buttonHard25, 25)

        }
        buttonHard26.setOnClickListener {
            setPicks(buttonHard26, 26)

        }
        buttonHard27.setOnClickListener {
            setPicks(buttonHard27, 27)

        }
        buttonHard28.setOnClickListener {
            setPicks(buttonHard28, 28)

        }
        buttonHard29.setOnClickListener {
            setPicks(buttonHard29, 29)

        }


    }

    // This function checks the clicked button and updates the firstPick and secondPick as needed
    fun setPicks(clickedButton: Button, buttonNumber: Int) {

        // Set the clicked button's text to the corresponding index in arraylist
        clickedButton.text = puzzleList[buttonNumber].toString()

        // if both are populated it means this click is new sequence so need to
        // re-initialize the variables
        if (firstPick != "" && secondPick != "") {
            // if matched is false then picks did not match
            // so need to clear old buttons text and make them clickable again
            if (!matched) {
                firstButton.text = ""
                secondButton.text = ""
                firstButton.isClickable = true
                secondButton.isClickable = true
            }

            // whether matched or not need to clear picks as this is new match sequence
            firstPick = ""
            secondPick = ""
        }

        // if firstPick is empty means this is first click in sequence
        // so need to set firstPick and make button not clickable
        if (firstPick == "") {
            firstPick = puzzleList[buttonNumber].toString()
            firstButton = clickedButton
            firstButton.isClickable = false
        }
        // else it is the second pick
        else {
            // initialize the secondPick variables
            secondPick = puzzleList[buttonNumber].toString()
            secondButton = clickedButton
            secondButton.isClickable = false

            // check to see if picks are the same number
            // if yes the set the needed variables with following:
            // both buttons are unclickable and matched is true
            // also decrease the number of matching numbers left
            if (firstPick == secondPick) {
                firstButton.isClickable = false
                secondButton.isClickable = false
                matched = true
                numberLeft--
            }
            // if not the same numbers then set matched to false
            else {
                matched = false
            }

            // increase the number of tries for final output of score
            numberofTries++

            // check if no more picks left (you win!)
            // output the Winner message and score
            if (numberLeft == 0) {
                textView1.text = "Winner - Number of Moves: ${numberofTries.toString()}"
            }
        }
    }

    // this function generates the puzzle numbers
    // ensuring there are only 2 of each number, randomly places in slots
    // returns Arraylist of numbers that correspond to buttons
    // example puzzleList[5] is buttonEasy5 or buttonMed5 or buttonHard5
    // depending on the type of puzzle
    fun generatePuzzle(numberOfItems: Int, topNumber: Int): ArrayList<Int> {

        // initialize the temp arraylist and available numbers list
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