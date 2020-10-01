package com.e.intlesson0

import android.util.Log

// open class inables other classes to inherit this class
open class Animal(open var age: Int) {

    public fun run(kilometers: Double){
        Log.d("TAG_CAT0", "animal runing $kilometers")
    }
}