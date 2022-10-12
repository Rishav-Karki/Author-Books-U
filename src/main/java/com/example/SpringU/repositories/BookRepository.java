package com.example.SpringU.repositories;

import com.example.SpringU.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
