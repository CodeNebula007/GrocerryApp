package com.example.grocerryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val itemList: ArrayList<ItemModel>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var itemImg :ImageView
        var itemTitle: TextView
        var itemDesc: TextView

        init{

            itemImg = itemView.findViewById(R.id.image)
            itemTitle = itemView.findViewById(R.id.title)
            itemDesc = itemView.findViewById(R.id.description)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,"You Choose: ${itemList[adapterPosition].name}",Toast.LENGTH_SHORT).show()
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.itemTitle.setText(itemList[position].name)
        holder.itemDesc.setText(itemList[position].desc)
        holder.itemImg.setImageResource(itemList[position].img)
    }
}