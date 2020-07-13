package com.example.recycleviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_another.*

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        val actionBar:ActionBar?=supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        //get data from putExtra intent

        val intent=intent
        val atitle=intent.getStringExtra("title")
        val adesc=intent.getStringExtra("Description")
        val aImage=intent.getIntExtra("ImageView",0)

        //set title in another activity

        actionBar.setTitle(atitle)
        a_titleTV.text=atitle
        a_descriptionTV.text=adesc
        a_imageIv.setImageResource(aImage)
    }
}