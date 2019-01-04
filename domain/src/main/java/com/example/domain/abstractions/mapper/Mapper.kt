package com.example.domain.abstractions.mapper

interface Mapper<F, T> {
    fun map(from: F): T
}