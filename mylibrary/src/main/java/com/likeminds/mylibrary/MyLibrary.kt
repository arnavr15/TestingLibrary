package com.likeminds.mylibrary

import android.util.Log

object MyLibrary {
    fun init(message: String) {
        Log.d("PUI", message)
    }

    fun newFun(message: String) {
        Log.d("PUI", "newFun $message")
    }

    fun init1(message: String) {
        Log.d("PUI", "init1 $message")
    }
}