package com.qualitybitz.booksearchapp.data.repository

import com.qualitybitz.booksearchapp.data.api.RetrofitInstance.api
import com.qualitybitz.booksearchapp.data.model.SearchResponse
import retrofit2.Response

class BookSearchRepositoryImpl : BookSearchRepository {
    override suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse> {
        return api.searchBooks(query, sort, page, size)
    }
}