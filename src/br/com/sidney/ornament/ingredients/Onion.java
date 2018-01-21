package br.com.sidney.ornament.ingredients;



import br.com.sidney.ornament.decorator.DishDecorator;
import br.com.sidney.ornament.dishes.Dish;

public class Onion extends DishDecorator {

	public Onion(Dish dish) {
		super(dish);
		
		name  = "Onion";
		price = 0.5;
	}

}
