package com.jdc.tut.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@SuppressWarnings("serial")
public class Book implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Category categories;
	
	@Enumerated(EnumType.STRING)
	private Writer author;
	
	private int qty;
	
	public enum Category{
		drama,thriller,adventure,horror,history;
	}
	
	public enum Writer{
		KhinKhinHtoo,ChitOoNyo,MaSandi,LaMinMohMoh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategories() {
		return categories;
	}

	public void setCategories(Category categories) {
		this.categories = categories;
	}

	public Writer getAuthor() {
		return author;
	}

	public void setAuthor(Writer author) {
		this.author = author;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	
}
