package com.example.databinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binging:ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binging=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val quotesobj=Quotes("hiii","hoooo")
        binging.quotes=quotesobj
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        /**
         * you can directly the live data you can bind you no need to extra binding
         */
//        mainViewModel.quetsLivedata.observe(this, Observer{
//            binging.text.text=it
//        })

        /**
         * in the previous the live data set time you can pass lifecycle owner but binding?
         */
        binging.mainView=mainViewModel
        binging.lifecycleOwner=this
        /**
         * in the previous set the lifecycle owner
         */


    }
}