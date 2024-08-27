package com.locotoinnovations.service

import com.locotoinnovations.model.Post
import retrofit2.http.GET

interface PostService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}