package com.springboot.example.springboot.repositories;

import com.springboot.example.springboot.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
