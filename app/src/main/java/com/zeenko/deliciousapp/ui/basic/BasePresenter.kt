package com.zeenko.deliciousapp.ui.basic

interface BasePresenter<T> {
    fun bind(view: BaseView<T>)
    fun unbind()
}