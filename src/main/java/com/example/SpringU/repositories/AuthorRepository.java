package com.example.SpringU.repositories;

import com.example.SpringU.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
