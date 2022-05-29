package sample

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookToJSONTest {

    @Test
    fun `converts to JSON`() {
        assertThat(BookToJSON.toString(Book)).isEqualTo("""
            {
                "title": "The Pragmatic Programmer: From Journeyman to Master",
                "authors": ["Andrew Hunt","David Thomas"],
                "edition": 1
            }
        """.trimIndent())
    }
}