package com.e.intlesson0

import android.util.Log

// open class inables other classes to inherit this class
open class Animal(open var age: Int) {

    public open fun run(kilometers: Double){
        Log.d("TAG_ANIMAL0", "animal runing $kilometers")
    }

    open fun makeNoise(){
        Log.d("TAG_ANIMAL0", "some animal nose")
    }
}