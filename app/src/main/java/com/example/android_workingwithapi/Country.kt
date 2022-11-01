package com.example.android_workingwithapi

data class Country(
    var name: String,
    var capital: String,
    var flags: Flag
)

data class Flag(
    val svg: String,
    val png: String
)
