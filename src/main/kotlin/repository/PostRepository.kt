package com.locotoinnovations.repository

import com.locotoinnovations.model.Post
import com.locotoinnovations.service.PostService
import javax.inject.Inject

class PostRepository @Inject constructor(
    private val postService: PostService
) {

    suspend fun getPosts(): List<Post> = postService.getPosts()
}