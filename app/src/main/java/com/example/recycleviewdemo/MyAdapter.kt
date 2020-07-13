package com.example.recycleviewdemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter (val arrayList: ArrayList<Model>,val context:Context):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItems(model:Model){
            itemView.titleTV.text=model.title
            itemView.descriptionTV.text=model.des
            itemView.imageIv.setImageResource((model.Image))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false);
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindItems(arrayList[position])

        //get possition of selected item
        val model=arrayList.get(position)

        //get title, des of selected item
        val gtitle:String=model.title
        val gdesc:String=model.des

        //get img with intent, which position is selected

        var gImagview:Int=model.Image
        holder.itemView.setOnClickListener{

            //create intent
            val intent=Intent(context,AnotherActivity::class.java)

            //put all these items with putExtra intent
            intent.putExtra("title",gtitle)
            intent.putExtra("Description",gdesc)
            intent.putExtra("ImageView",gImagview)

            //start another activity
            context.startActivity(intent)
        }
        
        val str:String="You Pressed on"
        holder.itemView.setOnLongClickListener{

              Toast.makeText(context,str+" "+gtitle,Toast.LENGTH_SHORT).show()

            true
        }
    }


}