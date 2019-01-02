package us.chisw.android.domain.repositories

import us.chisw.android.domain.entities.TrailerEntity
import us.chisw.android.domain.repositories.callbacks.LoadingProgressListener

interface TrailerRepository{
    fun getAllTrailers(loadingProgressListener: LoadingProgressListener? = null) : List<TrailerEntity>
}