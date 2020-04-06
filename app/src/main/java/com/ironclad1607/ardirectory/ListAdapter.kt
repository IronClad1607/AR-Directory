package com.ironclad1607.ardirectory

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*
import java.util.*

class ListAdapter(private val array: Array<String>) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(str: String) {
            with(itemView) {
                val colors = resources.getIntArray(R.array.cardColors)
                val randomColorCard = colors[Random().nextInt(colors.size)]
                backColor.setBackgroundColor(randomColorCard)
                tvName.text = str
                setOnClickListener {
                    val arIntent = Intent(context, ARActivity::class.java)
                    arIntent.putExtra("modelName", str)
                    startActivity(context, arIntent, null)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun getItemCount() = array.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(array[position])
    }
}