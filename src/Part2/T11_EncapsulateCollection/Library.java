package Part2.T11_EncapsulateCollection;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }
    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
}