package com.faa.watcher.di

import com.faa.watcher.main.data.repository.DishesRepositoryImpl
import com.faa.watcher.main.domain.repository.DishesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun provideDishesRepository(dishesRepository: DishesRepositoryImpl): DishesRepository
}