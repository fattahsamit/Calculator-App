package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Number Buttons
        zero.setOnClickListener {  }
        one.setOnClickListener {  }
        two.setOnClickListener {  }
        three.setOnClickListener {  }
        four.setOnClickListener {  }
        five.setOnClickListener {  }
        six.setOnClickListener {  }
        seven.setOnClickListener {  }
        eight.setOnClickListener {  }
        nine.setOnClickListener {  }
        dot.setOnClickListener {  }

        //Operator Buttons
        sum.setOnClickListener {  }
        subtraction.setOnClickListener {  }
        multiply.setOnClickListener {  }
        divide.setOnClickListener {  }

        bracketstart.setOnClickListener {  }
        bracketend.setOnClickListener {  }
        clear.setOnClickListener {  }
        equal.setOnClickListener {  }




    }

    //methods

    // appendOnClick() = add button text value in textview
    fun appendOnClick(clear: Boolean, string: String){
        if(clear){
          input.text = ""
          input.append(string)
        }
        else{
            input.append(output.text)
            input.append(string)
            output.text = ""
        }


    }

}