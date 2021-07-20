package com.api.book.bootrestbook.Controllers.Services;

import java.util.List;

import com.api.book.bootrestbook.Controllers.model.Book;
import com.api.book.bootrestbook.dao.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {
  @Autowired
  private BookRepo bookRepo;

  // getAll Book
  public List<Book> getAllBooks() {
    // database connectivity
    List<Book> list = (List<Book>) this.bookRepo.findAll();
    return list;
  }

  // get Single Book
  public Book getBookById(int id) {
    Book book = null;
    // Book id match using lambda functon
    try {
      book = this.bookRepo.findById(id);

    } catch (Exception e) {
      e.printStackTrace();
    }
    return book;
  }

  public Book addBook(Book b) {
    Book result = bookRepo.save(b);
    return result;
  }

  public void deleteBook(int bid) {
    bookRepo.deleteById(bid);
  }

  // update the book
  public void updateBook(Book book, int bookId) {
    book.setId(bookId);
    bookRepo.save(book);
  }
}
