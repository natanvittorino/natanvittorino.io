package com.springbootDev.springApp.repositories;

import com.springbootDev.springApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
