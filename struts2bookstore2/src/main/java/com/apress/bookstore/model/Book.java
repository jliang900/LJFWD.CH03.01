/**
 * 
 */
package com.apress.bookstore.model;

import java.util.List;

import com.apress.bookstore.model.Author;

/**
 * @author jliang
 *
 */
public class Book {
	private Long id;
	private Long categoryId;
	private String bookTitle;
	private List<Author> authors;
	private String publisherName;
	private Double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String toString() {
		return "Book - Id: " + id + ", Book Title: " + bookTitle;
	}
}
