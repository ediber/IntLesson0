package com.e.intlesson0

import android.util.Log

class Wolf(override var name: String, override var age: Int, var status :String): Dog(name, age) {

    fun searchForFood(){
        Log.d("TAG_WOLF0", "$name searching for food")
    }

    // kill
}