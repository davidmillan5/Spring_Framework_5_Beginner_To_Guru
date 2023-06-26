package com.myfirstapp.application.repositories;

import com.myfirstapp.application.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
