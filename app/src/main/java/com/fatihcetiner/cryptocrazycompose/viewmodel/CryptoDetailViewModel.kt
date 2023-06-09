package com.fatihcetiner.cryptocrazycompose.viewmodel

import androidx.lifecycle.ViewModel
import com.fatihcetiner.cryptocrazycompose.model.Crypto
import com.fatihcetiner.cryptocrazycompose.repository.CryptoRepository
import com.fatihcetiner.cryptocrazycompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel(){

    suspend fun getCrypto(id: String) : Resource<Crypto>{
        return repository.getCrypto(id)
    }
}