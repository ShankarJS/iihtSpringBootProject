package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.entity.Book;
import com.iiht.services.IBookService;

@RestController
public class AuthorController {
	
	@Autowired
	IBookService iBookService;
	
	@PostMapping("/addbook")
	public Book createBook(@RequestBody Book book) {
		Book addedBook = iBookService.addBook(book);
		return addedBook;
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book){
		return new ResponseEntity<Book>(iBookService.updateBook(book, id), HttpStatus.OK);
	}
	
	@PutMapping("/blockbook/{bookId}")
	public ResponseEntity<Book> blockBookById(@PathVariable Integer bookId){
		return new ResponseEntity<Book>(iBookService.blockBookById(bookId), HttpStatus.OK);
	}
	
	@PutMapping("/unblockbook/{bookId}")
	public ResponseEntity<Book> unblockBookById(@PathVariable Integer bookId){
		return new ResponseEntity<Book>(iBookService.unblockBookById(bookId), HttpStatus.OK);
	}
	
	@DeleteMapping("remove/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
		System.out.println(id);
		ResponseEntity<Book> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			iBookService.deleteBook(id);
		} catch(Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
		
	}
	
	@PostMapping("/login")
	public String authorLoginPage() {
		return "This is author login page";
	}
	
	@PostMapping("/signup")
	public String authorSignupPage() {
		return "This is author signup page";
	}
	
}
