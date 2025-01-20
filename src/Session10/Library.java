package Session10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<String> books;

    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(String book) {
        if (!book.isEmpty()) {
            books.add(book);
            System.out.println("book added to the Library");
        }else {
            System.out.println("Book nam is invalid");
        }
    }
    public List<String> getBooks(){
        return Collections.unmodifiableList(books);
    }
    public void displayBook() {
        System.out.println("books"+ books);
    }
}
