package com.example.onetoone.demo_onetoone.BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.demo_onetoone.model.BookDetail;

public interface BookDetailRepository extends JpaRepository<BookDetail, Integer>{

}
