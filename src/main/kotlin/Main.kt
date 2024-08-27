package com.locotoinnovations

import com.locotoinnovations.app.DaggerAppComponent
import com.locotoinnovations.repository.PostRepository
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class Main {

    @Inject
    lateinit var postRepository: PostRepository

    fun run() = runBlocking {
        try {
            val todos = postRepository.getPosts()
            todos.forEach{ println(it) }
        } catch (e: Exception) {
            println(e.message)
        }
    }
}


fun main() = runBlocking {
    val appComponent = DaggerAppComponent.create()
    val main = Main()
    appComponent.inject(main)
    main.run()
}