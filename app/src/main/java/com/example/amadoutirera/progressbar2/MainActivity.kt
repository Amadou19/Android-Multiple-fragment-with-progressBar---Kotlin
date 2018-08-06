package com.example.amadoutirera.progressbar2

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.ProgressBar

import androidx.fragment.app.FragmentTransaction

import training.androidkotlin.helloworld.Fragment2
import training.androidkotlin.helloworld.Fragment1
import training.androidkotlin.helloworld.Fragment3

class MainActivity : AppCompatActivity(), Fragment1.Fragment1Listner, Fragment2.Fragment2Listner {
lateinit var progressBar : ProgressBar


    private lateinit var fragment1: Fragment1
    private lateinit var fragment2: Fragment2
    private lateinit var fragment3: Fragment3


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*------------------------------------------*/
        progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        progressBar.max = 90
        progressBar.progress = 30
        /*------------------------------------------*/
        fragment1 = Fragment1()
        fragment2 = Fragment2()
        fragment3 = Fragment3()
        /*------------------------------------------*/
        fragment1.a1 = this
        fragment2.a2 = this
        /*------------------------------------------*/
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment1)
                .commit()
    }
    /*--------------- Onclik interface implementation -------------------*/
    override fun onClickFragment1() {

        supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment2)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .addToBackStack(null)
                .commit()

        progressBar.incrementProgressBy(30)

    }

    override fun onClickFragment2() {

        supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment3)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .addToBackStack(null)
                .commit()
        progressBar.incrementProgressBy(30)

    }

    /*------------------------------------------*/
    override fun onBackPressed() {
        super.onBackPressed()
        if(progressBar.progress ==60 || progressBar.progress ==90) progressBar.incrementProgressBy(-30)
    }

}
