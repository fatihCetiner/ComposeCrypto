package com.fatihcetiner.cryptocrazycompose.service

import com.fatihcetiner.cryptocrazycompose.model.Crypto
import com.fatihcetiner.cryptocrazycompose.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {

    /*
    @GET("prices")
    suspend fun getCryptoList(
        @Query("key") key : String
    ) : CryptoList

    // currencies?key=9a59189936a29108d994db85f88d8619dc9ae105&ids=BTC&attributes=id,name,logo_url

    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key : String,
        @Query("ids") id : String,
        @Query("attributes") attributes : String
    ) : Crypto


     */

    @GET("atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun getCryptoList(): CryptoList

    @GET("atilsamancioglu/IA32-CryptoComposeData/main/crypto.json")
    suspend fun getCrypto(): Crypto
}