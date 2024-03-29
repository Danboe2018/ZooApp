package com.webappclouds.zooapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.animal_ticket.*

class AnimalInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)

        val bundle: Bundle = intent.extras!!
        val name = bundle.getString("name")
        val desc = bundle.getString("desc")
        val image = bundle.getInt("image")
        ivAnimalImage.setImageResource(image)
        tvName.text = name
        tvDesc.text = desc

    }
}
