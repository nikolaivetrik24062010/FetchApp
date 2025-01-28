package com.example.fetch.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://fetch-hiring.s3.amazonaws.com/"

interface ApiService {
    @GET("hiring.json")
    suspend fun getItems(): List<Item>
}

data class Item(
    val id: Int,
    val listId: Int,
    val name: String?
)

object RetrofitClient {
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
