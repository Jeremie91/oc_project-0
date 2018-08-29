package com.lambazon.domain;

public class Product {

	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() { return quantity;}

	private void setQuantity(int quantity) {

		// if condition on the value of quantity variable
		// Display 0 if quantity < 0 ; else its value

		if (quantity < 0)
			this.quantity = 0;

	    else
	    	this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {

		// if condition on the value of price variable
		// Display 0 if < 0 ; 1000 if > 1000 ; else its value

		if (price < 0)
        this.price = 0;

        else if (price > 1000)
        this.price = 1000;

	    else
	        this.price = price;
	}

	public double getInventoryPrice() {
		// Calculation of the Inventory Price
		// price by quantity and then returns it

		return (double) (price * quantity);
	}
}
