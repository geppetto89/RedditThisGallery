package com.meninno.reddit.gallery.network.retrofit

import com.meninno.reddit.gallery.network.pojo.RedditResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RedditAPI {

    @GET("https://www.reddit.com/r/{keyword}/top.json")
    suspend fun searchImages(@Path("keyword") keyword: String): Response<RedditResponse>

}