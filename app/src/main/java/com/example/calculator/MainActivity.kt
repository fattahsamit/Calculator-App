package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

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
        multiply.setOnClickListener { appendOnClick(false, "*") }
        divide.setOnClickListener { appendOnClick(false, "/") }
        power.setOnClickListener { appendOnClick(false, "**") }

        bracketstart.setOnClickListener { appendOnClick(false, "(") }
        bracketend.setOnClickListener { appendOnClick(false, ")") }

        clear.setOnClickListener {
            clear()
        }

        equal.setOnClickListener {
            calculate()
        }

    }

    //methods

    // appendOnClick() = add button text value in textview
    private fun appendOnClick(clear: Boolean, string: String) {

        if (clear) {
            output.text = ""
            input.append(string)
        } else {
            input.append(output.text)
            input.append(string)
            output.text = ""
        }

    }

    //clear method clears the textview
    private fun clear() {
        input.text = ""
        output.text = ""
    }

    //calculate method clears the textview
    private fun calculate() {
        try {
            //Imported ExpressionBuilder Dependency
            //Inside; Gradle Scripts > build.gradle(module:app) > dependency{}
            // implementation 'net.objecthunter:exp4j:0.4.8'

            val Input = ExpressionBuilder(input.text.toString()).build()
            val Output = Input.evaluate()
            val longOutput = Output.toLong()

            if (Output == longOutput.toDouble()) {
                output.text = longOutput.toString()
            } else {
                output.text = Output.toString()
            }

        } catch (e: Exception) {
            Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_SHORT).show()
        }
    }

}