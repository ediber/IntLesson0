package com.e.intlesson0

import android.util.Log

// Object oriented

// class has:
// fields, properties
// Constructor
// methods, functions

class Dog(var name: String, var age: Int) {

    // method
    public fun bark(){
        Log.d("TAG_DOG0", "haw haw")
    }

    public fun run(kilometers: Double){
        Log.d("TAG_DOG1", "$name runing $kilometers")
    }

    // this method returns a String
    public fun eat(): String{
        var str = "$name eating bonzo"

        return str
    }

}