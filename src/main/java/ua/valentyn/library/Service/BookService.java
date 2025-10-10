package ua.valentyn.library.Service;

import org.springframework.stereotype.Service;
import ua.valentyn.library.Model.Book;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    public Book get(Long id) {
        // TODO: get book by id from DB;
        return new Book();
    }

    public List<Book> getAll() {
        return Collections.emptyList();
    }

    public Book create(Book book) {
        // TODO: save book to the DB;
        return book;
    }

    public Book update(Long id, Book book) {
        // TODO: get book by id and update it;
        return book;
    }

    public void delete(Long id) {
        // TODO: delete book by id;
    }
}
