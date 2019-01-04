package com.zeenko.data.net.datasource

import com.example.domain.abstractions.datasource.DataSource
import io.reactivex.Single


interface RemoteDataSource<T> : DataSource<T> {
    fun add(model: T)

    fun update(model: T)

    fun delete(model: T)

    fun load(): Single<List<T>>
}