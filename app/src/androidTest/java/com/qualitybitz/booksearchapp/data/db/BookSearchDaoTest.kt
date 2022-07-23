package com.qualitybitz.booksearchapp.data.db

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import com.qualitybitz.booksearchapp.data.model.Book
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
@ExperimentalCoroutinesApi
class BookSearchDaoTest {

    private lateinit var database: BookSearchDatabase
    private lateinit var dao: BookSearchDao

    @Before
    fun setUp() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            BookSearchDatabase::class.java
        ).allowMainThreadQueries().build()
        dao = database.bookSearchDao()
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun insert_book_to_db() = runTest {
        val book = Book(
            listOf("a"), "b", "c", "d", 0, "e",
            0, "f", "g", "h", listOf("i"), "j"
        )
        dao.insertBook(book)

        val favoriteBooks = dao.getFavoriteBooks().first()
        assertThat(favoriteBooks).contains(book)
    }

    @Test
    fun delete_book_in_db() = runTest {
        val book = Book(
            listOf("a"), "b", "c", "d", 0, "e",
            0, "f", "g", "h", listOf("i"), "j"
        )
        dao.insertBook(book)
        dao.deleteBook(book)

        val favoriteBooks = dao.getFavoriteBooks().first()
        assertThat(favoriteBooks).doesNotContain(book)
    }
}