package com.example.trot_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RemoteViews.RemoteCollectionItems
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val items: MutableList<String>) : RecyclerView.Adapter<RvAdapter.ViewHolder>( ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return ViewHolder(view)
    }
    interface ItemClick {
        fun onClick(view: View, position: Int)
    }
    var itemClick : ItemClick? =null

    override fun onBindViewHolder(holder: RvAdapter.ViewHolder, position: Int) {
        if(itemClick != null) {
            holder.itemView.setOnClickListener { v ->
                itemClick?.onClick(v, position)
            }
        }
        holder.bindItem(items[position])
    }
    //전체 리사이클러뷰 갯수
    override fun getItemCount(): Int {
        return items.size
    }
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bindItem(item : String) {
            val rv_text = itemView.findViewById<TextView>(R.id.rv_item)
             rv_text.text = item
        }
    }
}