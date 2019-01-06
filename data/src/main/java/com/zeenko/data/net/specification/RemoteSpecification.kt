package com.zeenko.data.net.specification

import com.example.domain.abstractions.specification.Specification

interface RemoteSpecification : Specification {
    fun getParameters(): Array<String>?
    fun <T> getBody(): T?
}