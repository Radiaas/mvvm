package com.example.mvvm

import android.content.Context
import com.example.mvvm.Data.SaveCounter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideSaveCounter(@ApplicationContext context: Context) = SaveCounter(context)
}
