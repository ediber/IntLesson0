package com.e.intlesson0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener {
            doSomething(edit.text.toString())
        })




    }

    private fun doSomething(num: String) {


        // variabales

        var k: Int = num.toInt()

        var a: Int
        a = 13

        var b: Int
        b = 5

        var c: Int

        // c = 8
        c = a + b
        Log.d("TAG", c.toString())



        var d: Double
        d = 3.8

        var s: String
        s = "moshe"

        var ch: Char
        ch = 'n'

        c = a * b
        d = (a / b).toDouble()


        // conditions
        // if, else

/*        if(1 < 2){

        } else {












        }

        if(a < b){

        } else {

        }*/


        // task 1
        // create new vars
        // 3 int vars
        // do + - * operations
        // store result in var f
        // print results using log

        // task 2
        // check if f is larger, smaller than 20
        if(k > 10){
          //  Toast.makeText(this, "a is greater than 10", Toast.LENGTH_LONG).show()
            Log.d("TAG", "a is greater than 10")
        } else if(k < 10){
        //    Toast.makeText(this, "a is smaller than 10", Toast.LENGTH_LONG).show()
        } else { // k == 10
       //     Toast.makeText(this, "a equals 10", Toast.LENGTH_LONG).show()
        }


        ////////////////////////////////////////////////////////////////////////////
        // lesson2

        // when
        // while, for

        when(k){
            1 -> Toast.makeText(this, "number is 1", Toast.LENGTH_LONG).show()
            4 -> Toast.makeText(this, "number is 4", Toast.LENGTH_LONG).show()
            5 ->{
                // do whatever i want
            }
            else ->{
                Toast.makeText(this, "number is not relevant", Toast.LENGTH_LONG).show()
            }
        }















    }
}