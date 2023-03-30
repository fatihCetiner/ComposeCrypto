package com.fatihcetiner.cryptocrazycompose.repository

import com.fatihcetiner.cryptocrazycompose.model.Crypto
import com.fatihcetiner.cryptocrazycompose.model.CryptoList
import com.fatihcetiner.cryptocrazycompose.service.CryptoAPI
import com.fatihcetiner.cryptocrazycompose.util.Constants.CALL_ATTRIBUTES
import com.fatihcetiner.cryptocrazycompose.util.Constants.END_POINT
import com.fatihcetiner.cryptocrazycompose.util.Constants.END_POINT_1
import com.fatihcetiner.cryptocrazycompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api : CryptoAPI
){

    suspend fun getCryptoList() : Resource<CryptoList>{
        val response = try {
           // api.getCryptoList(END_POINT_1)
            api.getCryptoList()
        } catch (e: Exception){
            return Resource.Error("Error!")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id: String) : Resource<Crypto>{
        val response = try {
           // api.getCrypto(END_POINT,id, CALL_ATTRIBUTES)
            api.getCrypto()
        } catch (e: Exception){
            return Resource.Error("Error!")
        }
        return Resource.Success(response)
    }
}