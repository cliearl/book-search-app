package com.qualitybitz.booksearchapp.data.model


import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchResponse(
    val documents: List<Book>,
    val meta: Meta
)