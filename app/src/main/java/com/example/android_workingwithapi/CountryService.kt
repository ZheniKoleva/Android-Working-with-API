package com.example.android_workingwithapi

import retrofit2.Call
import retrofit2.http.GET

interface CountryService {
    @GET("all")
    fun getAllCountries(): Call<List<Country>>
}