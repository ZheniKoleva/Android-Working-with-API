package com.example.android_workingwithapi

import retrofit2.Call

class CountryRepository constructor(
    private val countryService: CountryService
) {
    fun getCountries(): Call<List<Country>>? {
        return try {
            countryService.getAllCountries()
        } catch (e: Exception) {
            null
        }
    }
}