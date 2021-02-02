package com.example.itunes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var recylerViewAdapter: RecylerViewAdapter

    private val BASE_URL = " https://itunes.apple.com/search?\n" +
            "term="
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val searchEditText = findViewById<EditText>(R.id.edittextArtistiName)
        val searchButton = findViewById<Button>(R.id.buttonsearch)
        //val recyclerArtistsList = findViewById<RecyclerView>(R.id.recylerview)
        initRecyclerView()

        searchButton.setOnClickListener() {
                var urltoUse = BASE_URL
                val searchedArtist = searchEditText.text.toString()
                urltoUse+=searchedArtist
                Toast.makeText(this,BASE_URL,Toast.LENGTH_SHORT).show()
        }
        createData()
    }
    fun initRecyclerView() {
        recylerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            recylerViewAdapter = RecylerViewAdapter()
            adapter = recylerViewAdapter
        }
    }

    fun createData() {
        var sampleDataarrayList = ArrayList<ItunesData>()



        sampleDataarrayList.add(ItunesData("576670470","Carlos Saldanha","feature-movie"))
        sampleDataarrayList.add(ItunesData("841162750","Bruno Mars","song"))
        sampleDataarrayList.add(ItunesData("841162750","Harsh Dalwadi","song"))
        sampleDataarrayList.add(ItunesData("841162750","Kuldeep Mishra","song"))

        recylerViewAdapter.setarrayList(sampleDataarrayList)
        recylerViewAdapter.notifyDataSetChanged()
    }
}