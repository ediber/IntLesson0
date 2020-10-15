package com.e.intlesson0

import android.util.Log

class Wolf(override var name: String, override var age: Int, var status :String): Dog(name, age),
    IPredator, IHoulabale {

    fun searchForFood(){
        Log.d("TAG_WOLF0", "$name searching for food")
    }

    override fun kill() {
        Log.d("TAG_WOLF0", "$name killing dome animal")
    }

    override fun houl(level: Int) {
        Log.d("TAG_WOLF0", "Haauuuuuuuuu level $level")
    }

    // kill
}