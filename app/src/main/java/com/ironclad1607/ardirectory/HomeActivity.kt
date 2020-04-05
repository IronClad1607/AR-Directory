package com.ironclad1607.ardirectory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ironclad1607.ardirectory.caterogies.AnimalActivity
import com.ironclad1607.ardirectory.caterogies.CarActivity
import com.ironclad1607.ardirectory.caterogies.PlanetActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        cvAnimals.setOnClickListener {
            val animalIntent = Intent(this, AnimalActivity::class.java)
            startActivity(animalIntent)
        }

        cvPlanets.setOnClickListener {
            val planetIntent = Intent(this, PlanetActivity::class.java)
            startActivity(planetIntent)
        }

        cvCars.setOnClickListener {
            val carIntent = Intent(this,CarActivity::class.java)
            startActivity(carIntent)
        }

    }
}
