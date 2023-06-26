package com.myfirstapp.application.repositories;

import com.myfirstapp.application.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
