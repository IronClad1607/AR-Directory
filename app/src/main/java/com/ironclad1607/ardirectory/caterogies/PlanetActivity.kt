package com.ironclad1607.ardirectory.caterogies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ironclad1607.ardirectory.ListAdapter
import com.ironclad1607.ardirectory.R
import kotlinx.android.synthetic.main.activity_animal.*
import kotlinx.android.synthetic.main.activity_planet.*

class PlanetActivity : AppCompatActivity() {
    private val planetArray = arrayOf(
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Jupiter",
        "Saturn",
        "Neptune",
        "Uranus"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet)

        rvPlanets.apply {
            layoutManager = LinearLayoutManager(this@PlanetActivity)
            adapter = ListAdapter(planetArray)
        }
    }
}
