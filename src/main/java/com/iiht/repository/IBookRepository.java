package com.iiht.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Integer>{

	Book findByCategory(String category);

	Optional<Book> findByPrice(double price);

	Optional<Book> findByPublisher(double publisher);

	Optional<Book> findByAuthor(String author);
	
}
