package com.iiht.services;

import java.util.List;
import java.util.Optional;

import com.iiht.entity.Book;

public interface IBookService {
	public Book addBook(Book book);

	public Optional<Book> getBook(Integer id);

	public List<Book> getAllBooks();

	public void deleteBook(Integer id);

	public Book updateBook(Book book, Integer id);

	Book blockBookById(Integer id);

	Book unblockBookById(Integer id);

	public Book getBookByCategory(String category);

	public Optional<Book> getBookByPrice(double price);

	public Optional<Book> getBookByAuthor(String author);

	public Optional<Book> getBookByPublisher(double publisher);
}
