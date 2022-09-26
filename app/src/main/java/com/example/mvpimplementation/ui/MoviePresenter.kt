package com.example.mvpimplementation.ui

import com.example.mvpimplementation.pojo.MovieModel

class MoviePresenter (private val movieViewListener: MovieViewListener){
    // TODO :
    // 1- Receive MovieViewListener
    // 2- Get Data From Database
    // 3- Pass the Data to the MovieViewListener

    private fun getDataFromDataBase(): MovieModel = MovieModel("Star Wars", 22, "Action")

    fun getMovie(){
        movieViewListener.onGetMovieListener(getDataFromDataBase())
    }

}