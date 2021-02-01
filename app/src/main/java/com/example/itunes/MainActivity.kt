package com.example.itunes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var BASE_URL = " https://itunes.apple.com/search?\n" +
            "term="
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val searchEditText = findViewById<EditText>(R.id.edittextArtistiName)
        val searchButton = findViewById<Button>(R.id.buttonsearch)
        val recyclerArtistsList = findViewById<RecyclerView>(R.id.recylerview)

        searchButton.setOnClickListener() {
                val searchedArtist = searchEditText.text.toString()
                BASE_URL+=searchedArtist
        }
    }
}