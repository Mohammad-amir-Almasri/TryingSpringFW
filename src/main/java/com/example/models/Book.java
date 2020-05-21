package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Book {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;
	
	Book(int i, String n, double p){
		id =i;
		name=n;
		price=p;
	}
	
	void set(int i, String n, double p) {
		id =i;
		name=n;
		price=p;
	}
	
	int getId() {
		return id;
	}
	
	double getPrice() {
		return price;
	}
	
	String getName() {
		return name;
	}

}
