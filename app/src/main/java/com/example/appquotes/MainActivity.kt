package com.example.appquotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.appquotes.adapter.ItemAdapter
import com.example.appquotes.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        val textView: TextView = findViewById(R.id.textview)
        textView.text = Datasource().loadQuotes().size.toString()
*/

        // adatok inicializalasa
        val myDataset = Datasource().loadQuotes()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

    }
}