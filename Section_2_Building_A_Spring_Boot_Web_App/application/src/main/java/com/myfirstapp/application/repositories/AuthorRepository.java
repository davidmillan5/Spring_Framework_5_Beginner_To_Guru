package com.myfirstapp.application.repositories;

import com.myfirstapp.application.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
