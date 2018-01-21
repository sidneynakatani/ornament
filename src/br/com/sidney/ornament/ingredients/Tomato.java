package br.com.sidney.ornament.ingredients;

import br.com.sidney.ornament.decorator.DishDecorator;
import br.com.sidney.ornament.dishes.Dish;

public class Tomato extends DishDecorator {

	public Tomato(Dish dish) {
		super(dish);
		
		name  = "Tomato";
		price = 1.0;
	}
	

}
