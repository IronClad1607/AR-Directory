package com.ironclad1607.ardirectory.caterogies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ironclad1607.ardirectory.ListAdapter
import com.ironclad1607.ardirectory.R
import kotlinx.android.synthetic.main.activity_animal.*

class AnimalActivity : AppCompatActivity() {

    private val animalArray = arrayOf(
        "Bat",
        "Bull",
        "Cat",
        "Deer",
        "Dog",
        "Eagle",
        "Elephant",
        "Fox",
        "Hamster",
        "Lion",
        "Mouse",
        "Rhino",
        "Shark",
        "Tiger",
        "Wolf"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        setSupportActionBar(toolbarAnimal)

        rvAnimals.apply {
            layoutManager = LinearLayoutManager(this@AnimalActivity)
            adapter = ListAdapter(animalArray)
        }


    }
}
