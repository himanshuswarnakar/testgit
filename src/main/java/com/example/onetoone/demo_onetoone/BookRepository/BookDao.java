package com.example.onetoone.demo_onetoone.BookRepository;

import java.util.List;

import javax.validation.Valid;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetoone.demo_onetoone.model.Book;
import com.example.onetoone.demo_onetoone.model.BookDetail;

@RestController
@RequestMapping("/onetoone")
public class BookDao {
	@Autowired
	BookRepository repository;
	BookDetailRepository bookdetail;
	@PostMapping("/saveBooks")
	public String insertrecords(@Valid @RequestBody Book book)
	{
		System.out.println(book.getName());
		//BookDetail obj=book.getBookDetail();
		//System.out.println(book.getBookDetail().getNumberOfPages());
		repository.save(book);
		return null;
		
	}
	@GetMapping("/getBooks")
	public List<Book> getBooks()
	{
		return repository.findAll();
	}

}
