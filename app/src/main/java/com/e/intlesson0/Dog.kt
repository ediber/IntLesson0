package com.e.intlesson0

import android.util.Log

// Object oriented

// class has:
// fields, properties
// Constructor
// methods, functions


            // constructor
open class Dog(open var name: String, override var age: Int): Animal(age) {

   /* // secondary constructor
    constructor(name: String) : this(name, 0)*/


    // method
    public override fun makeNoise(){
        // using the code of the father(Animal)
        super.makeNoise()
        Log.d("TAG_DOG0", "haw haw")
    }

/*    public fun run(kilometers: Double){
        Log.d("TAG_DOG1", "$name runing $kilometers")
    }*/

    // this method returns a String
    public open fun eat(): String{
        var str = "$name eating bonzo"

        return str
    }

}