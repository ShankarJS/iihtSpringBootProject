package com.iiht.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.entity.Book;
import com.iiht.services.IBookService;

@RestController
public class ReaderController {
	
	@Autowired
	IBookService iBookService;
	
	@GetMapping("/allbooks")
	public List<Book> getAllBooks(){
		List<Book> allBooks = iBookService.getAllBooks();
		return allBooks;
	}
	
	@GetMapping("/book/id/{id}")
	public Optional<Book> getBookById(@PathVariable Integer id){
		Optional<Book> bookById = iBookService.getBook(id);
		return bookById;
	}
	
	@GetMapping("/book/category/{category}")
	public Book getBookByCategory(@PathVariable String category){
		Book bookByCategory = iBookService.getBookByCategory(category);
		return bookByCategory;
	}
	
	@GetMapping("/book/author/{author}")
	public Optional<Book> getBookByAuthor(@PathVariable String author){
		Optional<Book> bookByAuthor = iBookService.getBookByAuthor(author);
		return bookByAuthor;
	}
	
	@GetMapping("/book/price/{price}")
	public Optional<Book> getBookByPrice(@PathVariable double price){
		Optional<Book> bookByPrice = iBookService.getBookByPrice(price);
		return bookByPrice;
	}
	
	@GetMapping("/book/publisher/{publisher}")
	public Optional<Book> getBookByPublisher(@PathVariable double publisher){
		Optional<Book> bookByPublisher = iBookService.getBookByPublisher(publisher);
		return bookByPublisher;
	}
	
//	@PostMapping("")
//	public buyABook
	
		
	
	
}
