package br.com.sidney.ornament.dishes;

public abstract class Dish {
	
	protected String name;
	protected double price;
	
	public String showIngredients() {
		return name;
	}
	public double showPrice() {
		return price;
	}
	
	

}
