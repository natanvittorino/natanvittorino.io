package com.springbootDev.springApp.repositories;

import com.springbootDev.springApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
