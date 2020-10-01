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
          //  Log.d("TAG", "a is greater than 10")
        } else if(k < 10){
        //    Toast.makeText(this, "a is smaller than 10", Toast.LENGTH_LONG).show()
        } else { // k == 10
       //     Toast.makeText(this, "a equals 10", Toast.LENGTH_LONG).show()
        }


        /////////////////////////////////////////////////////////////////////////////////////////
        // lesson2

        // when
        // while, for
        // Array

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


        // ex1
        // check if number is larger, smaller, equal then 30

        if(k == 30){
            Toast.makeText(this, "equals 30", Toast.LENGTH_LONG).show()
        } else if(k > 30){
            Toast.makeText(this, "larger then 30", Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(this, "smaller then 30", Toast.LENGTH_LONG).show()
        }

        // while loops
        // קורה כל עוד התנאי מתקיים

        var i: Int
        i = 0

        while(i < 5){
            Log.d("TAG", i.toString())

            i = i + 1
           // i ++
        }

        Log.d("TAG", " ")

        var j: Int
        j = 6

        while(j > 0){
            Log.d("TAG", j.toString())

            j = j - 2
        }

        // ex2
        // print 10,9,...0
        // print -2, 1, 4,..., 31

        var i1: Int
        i1 = 10

        while(i1 >= 0){
            Log.d("TAG", i1.toString())

            i1 = i1 - 1
        }

        var i2: Int
        i2 = -2

        while(i2 <= 31){
            Log.d("TAG", i2.toString())

            i2 = i2 + 3
        }


        // for loops
        // לולאה

        // i runs from 1 to 5
        for(i in 1..5){
            Log.d("TAG1", i.toString())
        }

        // i increazes by 2
        for (i in 0 until 10 step 2) {
            Log.d("TAG2", i.toString())
        } // Prints 0, 2, 4, 6, 8



        //////////////////////////////
        // Array

        // building empty array of size 3
        val arr = IntArray(3)
        arr[0] = 5
        arr[1] = 11
        arr[2] = 8

        Log.d("TAG3", arr[0].toString())

        // iterate over the array
        // then number 2 is hardcoded, it cannot change
        for(i in 0..2){
            Log.d("TAG4", arr[i].toString())
        }

        // better version
        // length = 3
        var length = arr.size
        for(i in 0..length - 1){
            Log.d("TAG5", arr[i].toString())
        }

        // ex3
        // build an array of size 5
        // add numbers to the array
        // print all numbers from the array

        // solution similar to our example above

        // building empty array of size 4
        val arr2 = IntArray(4)

        // copy all values from arr to arr2
        // last index in arr2 is empty, because arr2 is larger then arr
        for(i in 0..arr.size-1){
            arr2[i] = arr[i]
        }
        arr2[3] = 9

        // print arr2
        for (i in 0.. arr2.size-1){
            Log.d("TAG6", arr2[i].toString())
        }


        ////////////////////////////////////////////////////////////
        // lesson 3
        // Array
        // funtions
        // Object oriented - תכנות מונחה עצמים ****


        // arrays

        var str0: String = "edi"

        // mutable - can be changed
        var lst0 = mutableListOf<String>()
        lst0.add("regev")
        lst0.add("rami")

        for(i in 0..lst0.size - 1){
            Log.d("TAG7", lst0[i])
        }

        var name = lst0[0]

        //                 the use of the function
        var avg0 = average(8.0, 10.0)

        Log.d("TAG8", avg0.toString())

        var avg1 = average(1.0, 3.0)
        Log.d("TAG9", avg1.toString())

        printList(lst0)

        ////////////////// Object Oriented ///////////////////////////////////////

        // dog0 is an object of class Dog

        //      calling the constructor
        val dog0 = Dog("rexy", 17)
        val dog1 = Dog("tofi", 200)
        dog0.bark()

        dog0.run(55.0)
        dog1.run(0.5)

        val str1 = dog1.eat()
        Log.d("TAG_DOG2", str1)

        // ex1
        // add a class called Cat
        // class contains: name, age, amount of souls, color
        // class methods: miao, chase bird

    }

    ////////////////////
    // functions
    // adventage, can be called multiple times

    // 1. function name, 2. parameters, 3. return type
    fun average      (a: Double, b: Double): Double{
        var c = (a + b) / 2
        return c
    }

    // ex0
    // create a function that take 3 parameters
    // and returns the average
    // use the funtion 2 times
    // Log the results

    // function returns nothing
    fun printList(edisList: MutableList<String>){
        for(i in 0..edisList.size - 1){
            Log.d("TAG10", edisList[i])
        }
    }

}