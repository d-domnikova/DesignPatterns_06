package Part2.T11_EncapsulateCollection;

import java.util.List;

public class Library {
    private List<Book> books;
    public Library(List<Book> books) {
        this.books = books;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
