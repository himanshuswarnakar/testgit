package com.example.onetoone.demo_onetoone.BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.demo_onetoone.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
