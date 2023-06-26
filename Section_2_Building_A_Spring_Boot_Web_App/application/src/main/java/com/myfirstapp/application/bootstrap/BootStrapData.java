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
        Publisher manning = new Publisher("Manning","Rodeo Drive","Los Angeles","California","1234546");

        // Add a book to the author and an author to the book


        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(manning);
        manning.getBooks().add(ddd);



        authorRepository.save(eric);
        publisherRepository.save(manning);
        bookRepository.save(ddd);




        // Adding more data

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB","335566998");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(manning);
        manning.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(manning);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: "+ bookRepository.count());
        System.out.println("Number of Publishers: "+ publisherRepository.count());
        System.out.println("Publisher Number of Books: " + manning.getBooks().size());

    }
}
