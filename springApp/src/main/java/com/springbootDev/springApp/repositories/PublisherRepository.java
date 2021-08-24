package com.springbootDev.springApp.repositories;

import com.springbootDev.springApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
