package com.locotoinnovations.app

import com.locotoinnovations.Main
import com.locotoinnovations.di.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {
    fun inject(main: Main)
}