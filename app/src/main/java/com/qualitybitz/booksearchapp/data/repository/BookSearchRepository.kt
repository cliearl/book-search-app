package com.qualitybitz.booksearchapp.data.repository

import androidx.lifecycle.LiveData
import com.qualitybitz.booksearchapp.data.model.Book
import com.qualitybitz.booksearchapp.data.model.SearchResponse
import retrofit2.Response

interface BookSearchRepository {

    suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int,
    ): Response<SearchResponse>

    // Room
    suspend fun insertBooks(book: Book)

    suspend fun deleteBooks(book: Book)

    fun getFavoriteBooks(): LiveData<List<Book>>
}