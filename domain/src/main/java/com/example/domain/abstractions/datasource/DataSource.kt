package com.example.domain.abstractions.datasource

import com.example.domain.abstractions.specification.Specification
import io.reactivex.Single

interface DataSource<T> {
    fun query(specification: Specification): Single<List<T>>
    fun delete(specification: Specification): Single<List<T>>
    fun update(specification: Specification): Single<List<T>>
    fun add(specification: Specification): Single<List<T>>
}