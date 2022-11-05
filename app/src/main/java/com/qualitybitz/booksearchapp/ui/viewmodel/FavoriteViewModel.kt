package com.qualitybitz.booksearchapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.qualitybitz.booksearchapp.data.model.Book
import com.qualitybitz.booksearchapp.data.repository.BookSearchRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val bookSearchRepository: BookSearchRepository,
) : ViewModel() {

    // Paging
    val favoritePagingBooks: StateFlow<PagingData<Book>> =
        bookSearchRepository.getFavoritePagingBooks()
            .cachedIn(viewModelScope)
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), PagingData.empty())

    // Room
    fun saveBook(book: Book) = viewModelScope.launch {
        bookSearchRepository.insertBooks(book)
    }

    fun deleteBook(book: Book) = viewModelScope.launch {
        bookSearchRepository.deleteBooks(book)
    }
}