package com.ilham.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.gatot,
                "Gatot",
                "lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.ppp,
                "Apa aja",
                "lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.spider,
                "Spider-Man",
                "lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.thor,
                "Thor",
                "lorem Ipsum Lorem Ipsum"
            ),
            Superhero(
                R.drawable.batman,
                "Batman",
                "lorem Ipsum Lorem Ipsum"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}