from abc import ABC, abstractmethod
class Book():
    title = "The Pragmatic Programmer: From Journeyman to Master"
    authors = ["Andrew Hunt", "David Thomas"]
    edition = 1


class BookToString(ABC):
    @abstractmethod
    def toString(self, book):
        pass


class BookToJSON(BookToString):
    def toString(self, book):
        return """{
            "title": book.title,
            "authors": book.authors,
            "edition": book.edition
        }
        """


class BookToXML(BookToString):
    def toString(self, book):
        return f"""
            <?xml version="1.0" encoding="UTF-8"?>
            <book>
                <title> {book.title}</title> 
                <authors>
                    <author>{book.authors[0]}</author>
                    <author>{book.authors[1]}</author>
                </authors>
                <edition>{book.edition}</edition>
            </book>

        """
if __name__ == "__main__":
    book = Book()
    book_JSON = BookToJSON()
    print(book_JSON.toString(book))
    book_XML = BookToXML()
    print(book_XML.toString(book))
    

