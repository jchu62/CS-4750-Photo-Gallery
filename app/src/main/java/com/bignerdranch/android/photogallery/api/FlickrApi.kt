package com.bignerdranch.android.photogallery.api

import com.bignerdranch.android.photogallery.BuildConfig
import retrofit2.http.GET

private const val API_KEY = BuildConfig.API_KEY;

interface FlickrApi {
    @GET("/")
    suspend fun fetchContents(): String
}