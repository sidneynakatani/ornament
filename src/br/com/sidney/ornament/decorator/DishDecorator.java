package br.com.sidney.ornament.decorator;

import br.com.sidney.ornament.dishes.Dish;

public class DishDecorator extends Dish {
	
	protected Dish dish;
	
	public DishDecorator(Dish dish){
		this.dish = dish;
	}
	
	@Override
	public String showIngredients() {
		return dish.showIngredients() + " and " + name ;
	}
	
	
	@Override
	public double showPrice() {
		return dish.showPrice() + price;
	}

}
