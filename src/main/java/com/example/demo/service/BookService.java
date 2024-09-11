package com.example.demo.service;

import com.example.demo.api.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private ArrayList<Book> bookList;

    public BookService() {
        bookList = new ArrayList<>();
        bookList.add(new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", "A young wizard's journey begins.", "1997-06-26", 1));
        bookList.add(new Book("J.R.R. Tolkien", "The Hobbit", "A hobbit's adventure to reclaim his home.", "1937-09-21", 2));
        bookList.add(new Book("George Orwell", "1984", "A dystopian novel about totalitarianism.", "1949-06-08", 3));
        bookList.add(new Book("J.D. Salinger", "The Catcher in the Rye", "A story about teenage angst and alienation.", "1951-07-16", 4));
        bookList.add(new Book("F. Scott Fitzgerald", "The Great Gatsby", "A critique of the American Dream in the 1920s.", "1925-04-10", 5));
        bookList.add(new Book("Jane Austen", "Pride and Prejudice", "A classic novel about love and social class.", "1813-01-28", 6));
        bookList.add(new Book("Mark Twain", "Adventures of Huckleberry Finn", "A young boy's adventures along the Mississippi River.", "1884-12-10", 7));
        bookList.add(new Book("Harper Lee", "To Kill a Mockingbird", "A story about racial injustice and moral growth.", "1960-07-11", 8));
        bookList.add(new Book("Leo Tolstoy", "War and Peace", "A historical novel set during the Napoleonic Wars.", "1869-01-01", 9));
        bookList.add(new Book("Gabriel Garcia Marquez", "One Hundred Years of Solitude", "A multi-generational tale of a family's struggles.", "1967-06-05", 10));
    }

    public Optional<Book> getBook(Integer id) {
        Optional optional = Optional.empty();
        for (Book book: bookList){
            if(id == book.getId()){
                optional = Optional.of(book);
                return optional;
            }
        }
        return optional;
    }

}
