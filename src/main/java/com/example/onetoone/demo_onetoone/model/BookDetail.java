package com.example.onetoone.demo_onetoone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_detail")
public class BookDetail {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private Integer numberOfPages;
	    //private Book book;
	    private Integer book_detail_id;

	   
	    public BookDetail(Integer numberOfPages){
	        this.numberOfPages = numberOfPages;
	    }
		public BookDetail(Integer id, Integer numberOfPages) {
			super();
			this.id = id;
			this.numberOfPages = numberOfPages;
			//this.book = book;
		}
		

		public BookDetail(Integer id, Integer numberOfPages, Integer book_detail_id) {
			super();
			this.id = id;
			this.numberOfPages = numberOfPages;
			//this.book = book;
			this.book_detail_id = book_detail_id;
		}

		public Integer getBook_detail_id() {
			return book_detail_id;
		}

		public void setBook_detail_id(Integer book_detail_id) {
			this.book_detail_id = book_detail_id;
		}

		public BookDetail(){

	    }

	    

	    
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	   // @Column(name = "number_of_pages")
	    public Integer getNumberOfPages() {
	        return numberOfPages;
	    }

	    public void setNumberOfPages(Integer numberOfPages) {
	        this.numberOfPages = numberOfPages;
	    }

	   

	    
	}

