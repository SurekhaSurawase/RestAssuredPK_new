package POJO_API;

import org.apache.juneau.annotation.Beanc;

public class Product_Ecom {

	// We created the POJO class
	private String Name;
	private int price;
	private String color;

	// Created the constructor for the class
	@Beanc(properties = "name, price, color") // Name you want to given to your Json
	public Product_Ecom(String name, int price, String color) {

		this.Name = name;
		this.price = price;
		this.color = color;

	}

	// Created the getter and setter

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product_Ecom [Name=" + Name + ", price=" + price + ", color=" + color + "]";
	}
	
	

}
