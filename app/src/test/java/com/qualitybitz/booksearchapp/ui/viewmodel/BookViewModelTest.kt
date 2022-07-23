package com.qualitybitz.booksearchapp.ui.viewmodel

import androidx.test.filters.MediumTest
import com.google.common.truth.Truth
import com.qualitybitz.booksearchapp.data.model.Book
import com.qualitybitz.booksearchapp.data.repository.FakeBookSearchRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
@MediumTest
class BookViewModelTest {

    private lateinit var viewModel: BookViewModel

    @Before
    fun setUp() {
        viewModel = BookViewModel(FakeBookSearchRepository())
    }

    @Test
    fun save_book_test() = runTest {
        val book = Book(
            listOf("a"), "b", "c", "d", 0, "e",
            0, "f", "g", "h", listOf("i"), "j"
        )
        viewModel.saveBook(book)

        val favoriteBooks = viewModel.favoriteBooks.first()
        Truth.assertThat(favoriteBooks).contains(book)
    }
}