package com.e.intlesson0

import android.util.Log



class Cat(var name: String, override var age: Int, var souls: Int, color: String): Animal(age)
    , IPredator {
    // miao, chase bird

    override fun makeNoise(){
        Log.d("TAG_CAT0", "mio")
    }

    fun chaseBird(birdColor: String){
        Log.d("TAG_CAT0", "$name cahsing $birdColor bird")
    }

    override fun kill() {
        Log.d("TAG_CAT0", "killing someone")
    }

/*    public fun run(kilometers: Double){
        Log.d("TAG_CAT0", "$name runing $kilometers")
    }*/
}