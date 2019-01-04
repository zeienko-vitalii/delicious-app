package com.example.domain.abstractions.repository

import io.reactivex.Single

interface Repository<T> {
    fun getAllItems(): Single<T>
}