package com.example.domain.abstractions.repository

import com.example.domain.abstractions.specification.Specification
import io.reactivex.Single

interface Repository<T> {
    fun getAllItems(): Single<T>
    fun addItems(items: List<T>)
    fun deleteItems(specification: Specification?): Single<T>
    fun updateItems(specification: Specification?): Single<T>
}