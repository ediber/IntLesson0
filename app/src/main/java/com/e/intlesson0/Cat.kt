package com.e.intlesson0

import android.util.Log

class Cat(var name: String, override var age: Int, var souls: Int, color: String): Animal(age) {
    // miao, chase bird

    fun makeNoise(){
        Log.d("TAG_CAT0", "mio")
    }

    fun chaseBird(birdColor: String){
        Log.d("TAG_CAT0", "$name cahsing $birdColor bird")
    }

/*    public fun run(kilometers: Double){
        Log.d("TAG_CAT0", "$name runing $kilometers")
    }*/
}