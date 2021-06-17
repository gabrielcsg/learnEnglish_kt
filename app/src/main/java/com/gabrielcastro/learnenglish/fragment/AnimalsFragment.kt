package com.gabrielcastro.learnenglish.fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.gabrielcastro.learnenglish.R


class AnimalsFragment : Fragment(), View.OnClickListener {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_animals, container, false)

        val buttonDog = view.findViewById<ImageButton>(R.id.btn_dog)
        val buttonCat = view.findViewById<ImageButton>(R.id.btn_cat)
        val buttonLion = view.findViewById<ImageButton>(R.id.btn_lion)
        val buttonMonkey = view.findViewById<ImageButton>(R.id.btn_monkey)
        val buttonSheep = view.findViewById<ImageButton>(R.id.btn_sheep)
        val buttonCow = view.findViewById<ImageButton>(R.id.btn_cow)

        buttonDog.setOnClickListener(this)
        buttonCat.setOnClickListener(this)
        buttonLion.setOnClickListener(this)
        buttonMonkey.setOnClickListener(this)
        buttonSheep.setOnClickListener(this)
        buttonCow.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) { // switch
            R.id.btn_dog -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.dog)
                playSong()
            }
            R.id.btn_cat -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.cat)
                playSong()
            }
            R.id.btn_lion -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.lion)
                playSong()
            }
            R.id.btn_monkey -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.monkey)
                playSong()
            }
            R.id.btn_sheep -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.sheep)
                playSong()
            }
            R.id.btn_cow -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.cow)
                playSong()
            }
        }
    }

    private fun playSong() {
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener {
            mediaPlayer.release()
        }
    }
}