package com.fatihcetiner.cryptocrazycompose.di

import com.fatihcetiner.cryptocrazycompose.repository.CryptoRepository
import com.fatihcetiner.cryptocrazycompose.service.CryptoAPI
import com.fatihcetiner.cryptocrazycompose.util.Constants.BASE_URL
import com.fatihcetiner.cryptocrazycompose.util.Constants.BASE_URL_1
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideCryptoRepository(
        api: CryptoAPI
    ) = CryptoRepository(api)



    @Singleton
    @Provides
    fun provideCryptoApi() : CryptoAPI{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL_1)
            .build()
            .create(CryptoAPI::class.java)
    }
}