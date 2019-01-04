package com.zeenko.data.db.datasource

import android.net.Uri
import com.example.domain.abstractions.datasource.DataSource
import com.example.domain.abstractions.specification.Specification
import io.reactivex.Single

interface LocalDataSource<T> : DataSource<T> {

    fun add(item: T): Single<Uri>

    fun add(items: Iterable<T?>): Single<Int>

    fun update(item: T): Single<Int>

    fun update(item: T, specification: Specification): Single<Int>

    fun remove(item: T): Single<Int>

    fun remove(specification: Specification): Single<Int>
}