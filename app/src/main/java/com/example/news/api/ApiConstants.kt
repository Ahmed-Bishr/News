package com.example.news.api

import android.content.Context
import com.example.news.R
import java.util.Properties

object ApiConstants {
   private val properties = Properties()

    object ApiConstants {
        // Hardcode the API key here
        private const val API_KEY = "c027443ca9624422bfbe9b160b9ec11a"

        fun getApiKey(): String {
            return API_KEY
        }
    }


}
