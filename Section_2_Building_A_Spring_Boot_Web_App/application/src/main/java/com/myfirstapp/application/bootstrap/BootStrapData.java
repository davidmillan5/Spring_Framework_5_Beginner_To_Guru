package com.myfirstapp.application.bootstrap;

import com.myfirstapp.application.domain.Author;
import com.myfirstapp.application.domain.Book;
import com.myfirstapp.application.domain.Publisher;
import com.myfirstapp.application.repositories.AuthorRepository;
import com.myfirstapp.application.repositories.BookRepository;
import com.myfirstapp.application.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {



    //Dependency Injections
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "11223344");
        Publisher manning = new Publisher("Rodeo Drive","Los Angeles","California","1234546");

        // Add a book to the author and an author to the book


        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);


        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(manning);



        // Adding more data

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB","335566998");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books "+ bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
