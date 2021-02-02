package com.example.itunes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerviewlayout.view.*

class RecylerViewAdapter : RecyclerView.Adapter<RecylerViewAdapter.MyViewHolder>() {

    var data = ArrayList<ItunesData>()

    fun setarrayList(item:ArrayList<ItunesData>) {
        this.data = item
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecylerViewAdapter.MyViewHolder {
       val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recyclerviewlayout,parent,false)
        return MyViewHolder(inflater)
    }

    override fun getItemCount(): Int {

        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val setTrackid = view.trackidtextview
        val setArtistName = view.artitnametextview
        val setKind = view.kindtextview
        fun bind(data : ItunesData) {
            setTrackid.text = data.trackId
            setArtistName.text = data.artistName
            setKind.text = data.kind
        }

    }
}