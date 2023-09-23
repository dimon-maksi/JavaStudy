public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Book1", "Author1", "1234567890", 2020));
        library.addBook(new Book("Book2", "Author2", "0987654321", 2019));
        library.addBook(new Book("Book3", "Author3", "5432109876", 2021));

        System.out.println("All Books:");
        library.showAllBooks();

        String searchTitle = "Book2";
        Book foundBook = library.findBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Found Book: " + foundBook.toString());
        } else {
            System.out.println("Book with title \"" + searchTitle + "\" not found.");
        }

        String isbnToRemove = "1234567890";
        if (library.removeBookByIsbn(isbnToRemove)) {
            System.out.println("Book with ISBN " + isbnToRemove + " removed successfully.");
        } else {
            System.out.println("Book with ISBN " + isbnToRemove + " not found.");
        }

        System.out.println("Updated Books:");
        library.showAllBooks();
    }
}