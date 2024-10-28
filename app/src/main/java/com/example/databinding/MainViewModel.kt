package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel:ViewModel() {
    val quetsLivedata=MutableLiveData("give me the quets")
    fun updateQuetsData(){

        quetsLivedata.value="new quets"
    }
}