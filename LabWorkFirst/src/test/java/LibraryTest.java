import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.example.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
        library.addBook(new Book("Book1", "Author1", "1234567890", 2020));
        library.addBook(new Book("Book2", "Author2", "0987654321", 2019));
    }

    @Test
    public void testFindBookByTitle() {
        Book foundBook = library.findBookByTitle("Book1");
        assertNotNull(foundBook);
        assertEquals("1234567890", foundBook.getIsbn());
    }

    @Test
    public void testRemoveBookByIsbn() {
        assertTrue(library.removeBookByIsbn("1234567890"));
        assertNull(library.findBookByTitle("Book1"));
        assertFalse(library.removeBookByIsbn("1234567890")); // Повинен бути вже видалений
    }

    @Test
    public void testRemoveNonExistingBook() {
        assertFalse(library.removeBookByIsbn("9999999999"));
    }
}
