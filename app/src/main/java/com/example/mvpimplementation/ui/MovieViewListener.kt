package com.example.mvpimplementation.ui

import com.example.mvpimplementation.pojo.MovieModel

interface MovieViewListener {
    fun onGetMovieListener(movieModel: MovieModel)
}