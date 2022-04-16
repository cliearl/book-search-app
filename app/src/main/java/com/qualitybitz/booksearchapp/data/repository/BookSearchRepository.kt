package com.qualitybitz.booksearchapp.data.repository

import androidx.paging.PagingData
import com.qualitybitz.booksearchapp.data.model.Book
import com.qualitybitz.booksearchapp.data.model.SearchResponse
import kotlinx.coroutines.flow.Flow
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

    fun getFavoriteBooks(): Flow<List<Book>>

    // DataStore
    suspend fun saveSortMode(mode: String)

    suspend fun getSortMode(): Flow<String>
    
    suspend fun saveCacheDeleteMode(mode: Boolean)

    suspend fun getCacheDeleteMode(): Flow<Boolean>

    // Paging
    fun getFavoritePagingBooks(): Flow<PagingData<Book>>

    fun searchBooksPaging(query: String, sort: String): Flow<PagingData<Book>>
}