package com.example.recycleviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayList=ArrayList<Model>()
        arrayList.add(Model("Wake up","Wake up earlier",R.drawable.p3))
        arrayList.add(Model("Gardening","Clean ur Garden",R.drawable.p4))
        arrayList.add(Model("Family Time","Spend some time to ur family",R.drawable.p5))
        arrayList.add(Model("Ready to Job","This is a time to go on job",R.drawable.p1))
        arrayList.add(Model("Enjoy","Enjoy Ur Life",R.drawable.p2))

        val myAdapter=MyAdapter(arrayList,this)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=myAdapter
    }
}