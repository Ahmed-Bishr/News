package com.example.news

import android.app.Application
import com.example.news.api.ApiConstants

class NewsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Load the API key
        loadApiKey()
    }

    private fun loadApiKey() {
        // Call the method to load the API key from wherever it's stored
        val apiKey = ApiConstants.ApiConstants.getApiKey()
        // Use the API key as needed in your application
    }
}