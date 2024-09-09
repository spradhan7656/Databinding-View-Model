package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel:ViewModel() {
    val quetsLivedata=MutableLiveData("give me the quets")
    fun updateQuetsData(){
        var rend= Random(100)
        quetsLivedata.value="new quets"+rend.toString()
    }
}