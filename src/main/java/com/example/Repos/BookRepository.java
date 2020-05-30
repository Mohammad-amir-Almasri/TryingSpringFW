package com.example.Repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book,Long>{

}
