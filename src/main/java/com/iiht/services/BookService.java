package com.iiht.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.entity.Book;
import com.iiht.exceptionhandler.ResourceNotFoundException;
import com.iiht.repository.IBookRepository;

@Service
public class BookService implements IBookService {

	@Autowired
	IBookRepository iBookRepository;

	@Override
	public Book addBook(Book book) {
		Book addedBook = iBookRepository.save(book);
		return addedBook;
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		Book existingBook = iBookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "ID", id));
		existingBook.setLogo(book.getLogo());
		existingBook.setTitle(book.getTitle());
		existingBook.setCategory(book.getCategory());
		existingBook.setPrice(book.getPrice());
		existingBook.setAuthor(book.getAuthor());
		existingBook.setPublisher(book.getPublisher());
		existingBook.setDate(book.getDate());
		existingBook.setChapters_content(book.getChapters_content());
		existingBook.setActive(book.getActive());
		iBookRepository.save(existingBook);
		return existingBook;
	}

	@Override
	public Book blockBookById(Integer id) {
		Book existingBook = iBookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "ID", id));
		if (existingBook.getActive() == true) {
			existingBook.setActive(false);
			iBookRepository.save(existingBook);
		}
		return existingBook;
	}

	@Override
	public Book unblockBookById(Integer id) {
		Book existingBook = iBookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "ID", id));
		if (existingBook.getActive() == false) {
			existingBook.setActive(true);
			iBookRepository.save(existingBook);
		}
		return existingBook;
	}

	// ------------------------------------------------

	@Override
	public Optional<Book> getBook(Integer id) {
		return iBookRepository.findById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return iBookRepository.findAll();
	}

	@Override
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		iBookRepository.deleteById(id);
	}

	///////////////////////
	@Override
	public Book getBookByCategory(String category) {
		return iBookRepository.findByCategory(category);
	}

	@Override
	public Optional<Book> getBookByPrice(double price) {
		return iBookRepository.findByPrice(price);
	}

	@Override
	public Optional<Book> getBookByAuthor(String author) {
		return iBookRepository.findByAuthor(author);
	}

	@Override
	public Optional<Book> getBookByPublisher(double publisher) {
		return iBookRepository.findByPublisher(publisher);
	}

}
