package com.example.matchit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val layoutTop = findViewById<LinearLayout>(R.id.LayoutTop);
        val layoutEasy = findViewById<LinearLayout>(R.id.LayoutEasy);
        val layoutMed = findViewById<LinearLayout>(R.id.LayoutMedium);
        val layoutHard = findViewById<LinearLayout>(R.id.LayoutHard);
        val  buttonEasy=findViewById<Button>(R.id.ButtonEasy);
        val  buttonMed=findViewById<Button>(R.id.ButtonMed);
        val  buttonHard=findViewById<Button>(R.id.ButtonHard);

        layoutTop.setVisibility(LinearLayout.VISIBLE);
        layoutEasy.setVisibility(LinearLayout.VISIBLE);
        layoutMed.setVisibility(LinearLayout.GONE);
        layoutHard.setVisibility(LinearLayout.GONE);

        buttonEasy.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.VISIBLE);
            layoutMed.setVisibility(LinearLayout.GONE);
            layoutHard.setVisibility(LinearLayout.GONE);
        }

        buttonMed.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.GONE);
            layoutMed.setVisibility(LinearLayout.VISIBLE);
            layoutHard.setVisibility(LinearLayout.GONE);
        }

        buttonHard.setOnClickListener {
            layoutEasy.setVisibility(LinearLayout.GONE);
            layoutMed.setVisibility(LinearLayout.GONE);
            layoutHard.setVisibility(LinearLayout.VISIBLE);
        }
    }
}