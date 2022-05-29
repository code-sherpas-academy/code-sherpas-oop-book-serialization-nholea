package sample

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookToXMLTest {

    @Test
    fun `converts to XML`() {
        assertThat(BookToXML.toString(Book)).isEqualTo("""
            <?xml version="1.0" encoding="UTF-8"?>
            <book>
                <title>The Pragmatic Programmer: From Journeyman to Master</title> 
                <authors>
                    <author>Andrew Hunt</author>
                    <author>David Thomas</author>
                </authors>
                <edition>1</edition>
            </book>
        """.trimIndent())
    }
}