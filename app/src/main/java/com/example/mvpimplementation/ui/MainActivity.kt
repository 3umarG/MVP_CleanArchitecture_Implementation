package com.example.mvpimplementation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.mvpimplementation.R
import com.example.mvpimplementation.pojo.MovieModel

class MainActivity : AppCompatActivity()  , View.OnClickListener , MovieViewListener{
    private lateinit var tvMovieName : TextView
    private lateinit var btnGetMovie : Button
    private lateinit var moviePresenter: MoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        btnGetMovie.setOnClickListener(this)

    }

    private fun init(){
        tvMovieName = findViewById(R.id.tvMovieName)
        btnGetMovie = findViewById(R.id.btnGetMovie)
        moviePresenter = MoviePresenter(this)
    }

    override fun onGetMovieListener(movieModel: MovieModel) {
        tvMovieName.visibility = View.VISIBLE
        tvMovieName.text = movieModel.movieName
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.btnGetMovie -> {
                moviePresenter.getMovie()
            }
        }
    }


}