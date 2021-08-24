package com.springbootDev.springApp.bootstrap;

import com.springbootDev.springApp.model.Author;
import com.springbootDev.springApp.model.Book;
import com.springbootDev.springApp.model.Publisher;
import com.springbootDev.springApp.repositories.AuthorRepository;
import com.springbootDev.springApp.repositories.BookRepository;
import com.springbootDev.springApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public BootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {


            Publisher publisher = new Publisher();
            publisher.setName("Foo");
            publisher.setAddress("LA, USA");
            publisherRepository.save(publisher);

            //Eric
            Author eric = new Author();
            Book kyle = new Book();
            eric.getBooks().add(kyle);
            kyle.getAuthors().add(eric);

            authorRepository.save(eric);
            bookRepository.save(kyle);

            //Rod
            Author rod = new Author();
            Book noEJB = new Book();
            rod.getBooks().add(noEJB);
            noEJB.getAuthors().add(rod);

            authorRepository.save(rod);
            bookRepository.save(noEJB);

            Author natanDrake = new Author();
            Book again = new Book();
            natanDrake.getBooks().add(again);
            again.getAuthors().add(natanDrake);

    }
}
