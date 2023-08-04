package com.jsp.springdemo.constructor.injection;

public class Pen {

	String name;
	double price;
	String colour;

	public Pen(String name, double price, String colour) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
	}

}
