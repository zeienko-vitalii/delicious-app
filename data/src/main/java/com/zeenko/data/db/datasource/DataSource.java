package com.zeenko.data.db.datasource;

import java.util.List;

public interface DataSource {

    interface LoadDataListCallback<T> {

        void onDataListLoaded(List<T> data);

        void onDataNotAvailable();

    }

    interface LoadDataCallback<T> {

        void onDataLoaded(T data);

        void onDataNotAvailable();

    }

}
