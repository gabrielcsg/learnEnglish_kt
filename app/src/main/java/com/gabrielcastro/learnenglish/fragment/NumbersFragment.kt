package com.gabrielcastro.learnenglish.fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.gabrielcastro.learnenglish.R


class NumbersFragment : Fragment(), View.OnClickListener {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_numbers, container, false)
        val btnOne = view.findViewById<ImageButton>(R.id.btn_one)
        val btnTwo = view.findViewById<ImageButton>(R.id.btn_two)
        val btnThree = view.findViewById<ImageButton>(R.id.btn_three)
        val btnFour = view.findViewById<ImageButton>(R.id.btn_four)
        val btnFive = view.findViewById<ImageButton>(R.id.btn_five)
        val btnSix = view.findViewById<ImageButton>(R.id.btn_six)

        btnOne.setOnClickListener(this)
        btnTwo.setOnClickListener(this)
        btnThree.setOnClickListener(this)
        btnFour.setOnClickListener(this)
        btnFive.setOnClickListener(this)
        btnSix.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_one -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.one)
                playSong()
            }
            R.id.btn_two -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.two)
                playSong()
            }
            R.id.btn_three -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.three)
                playSong()
            }
            R.id.btn_four -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.four)
                playSong()
            }
            R.id.btn_five -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.five)
                playSong()
            }
            R.id.btn_six -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.six)
                playSong()
            }
        }
    }

    private fun playSong() {
        mediaPlayer?.start()
        mediaPlayer?.setOnCompletionListener {
            mediaPlayer?.release()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}