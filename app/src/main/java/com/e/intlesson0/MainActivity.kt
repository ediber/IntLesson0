package com.e.intlesson0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener {
            doSomething()
        })




    }

    private fun doSomething() {

        // variabales

        var a: Int
        a = 13

        var b: Int
        b = 5

        var c: Int

        // c = 8
        c = a + b
        //Toast.makeText(this, c.toString(), Toast.LENGTH_SHORT).show()

        
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

        if(a > 10){
            Toast.makeText(this, "a is greater than 10", Toast.LENGTH_LONG).show()
        } else if(a < 10){
            Toast.makeText(this, "a is smaller than 10", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "a equals 10", Toast.LENGTH_LONG).show()

        }
    }
}