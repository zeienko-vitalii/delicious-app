package us.chisw.android.domain.repositories.datasource

import us.chisw.android.domain.entities.TrailerEntity
import us.chisw.android.domain.repositories.callbacks.LoadingProgressListener

interface TrailerDataSource {
    fun getAll(progressListener: LoadingProgressListener? = null): List<TrailerEntity>
    fun putAll(trailers: List<TrailerEntity>)
    fun deleteAll()
}