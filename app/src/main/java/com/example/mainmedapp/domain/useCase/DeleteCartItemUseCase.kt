package com.example.mainmedapp.domain.useCase

import android.app.Application
import com.example.mainmedapp.data.localDataSource.CartEntity
import com.example.mainmedapp.data.localDataSource.repository.LocalRepositoryImpl
import com.example.mainmedapp.domain.repository.LocalRepository

class DeleteCartItemUseCase(context: Application) {
    private val repository: LocalRepository = LocalRepositoryImpl(context)

    suspend fun execute(item: CartEntity){
        repository.deleteCartItem(item)
    }
}
