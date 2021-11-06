package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Code formatting in Android Studio Shortcut: CTRL+ALT+L on Windows

        //Number Buttons
        zero.setOnClickListener { appendOnClick(true, "0") }
        one.setOnClickListener { appendOnClick(true, "1") }
        two.setOnClickListener { appendOnClick(true, "2") }
        three.setOnClickListener { appendOnClick(true, "3") }
        four.setOnClickListener { appendOnClick(true, "4") }
        five.setOnClickListener { appendOnClick(true, "5") }
        six.setOnClickListener { appendOnClick(true, "6") }
        seven.setOnClickListener { appendOnClick(true, "7") }
        eight.setOnClickListener { appendOnClick(true, "8") }
        nine.setOnClickListener { appendOnClick(true, "9") }
        dot.setOnClickListener { appendOnClick(true, ".") }

        //Operator Buttons
        sum.setOnClickListener { appendOnClick(false, "+") }
        subtraction.setOnClickListener { appendOnClick(false, "-") }
        multiply.setOnClickListener { appendOnClick(false, "×") }
        divide.setOnClickListener { appendOnClick(false, "÷") }

        bracketstart.setOnClickListener { appendOnClick(false, "(") }
        bracketend.setOnClickListener { appendOnClick(false, ")") }

        clear.setOnClickListener {
            clear()
        }


        equal.setOnClickListener { }


    }

    //methods

    // appendOnClick() = add button text value in textview
    fun appendOnClick(clear: Boolean, string: String) {
        if (clear) {
            input.text = ""
            input.append(string)
        } else {
            input.append(output.text)
            input.append(string)
            output.text = ""
        }


    }

    //clear function
    fun clear() {
        input.text = ""
        output.text = ""
    }

}