package com.springboot.example.springboot.repositories;

import com.springboot.example.springboot.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
