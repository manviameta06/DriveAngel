package com.example.interviewdemo.di

import com.example.interviewdemo.repositories.user.UserDataRepository
import com.example.interviewdemo.repositories.user.UserDataRepositoryImpl
import com.example.interviewdemo.repositories.workshop.WorkshopDetailsRepository
import com.example.interviewdemo.repositories.workshop.WorkshopDetailsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun providesWorkshopDetailsRepository(workshopDetailRepositoryImpl: WorkshopDetailsRepositoryImpl): WorkshopDetailsRepository
}