package br.com.sidney.ornament.main;



import br.com.sidney.ornament.dishes.Dish;
import br.com.sidney.ornament.dishes.Pasta;
import br.com.sidney.ornament.dishes.Soup;
import br.com.sidney.ornament.ingredients.Onion;
import br.com.sidney.ornament.ingredients.Tomato;


public class DecoratorDemo {
	
	public static void main(String[] args){
		
		Dish mySoup = new Soup();
		System.out.println(mySoup.showIngredients() + " price is: " +mySoup.showPrice());
		
		mySoup = new Tomato(mySoup);
		System.out.println(mySoup.showIngredients() + " price is: " +mySoup.showPrice());
		
		mySoup = new Onion(mySoup);
		System.out.println(mySoup.showIngredients() + " price is: " +mySoup.showPrice());
		
		System.out.println();
		
		Dish myPasta = new Pasta();
		System.out.println(myPasta.showIngredients() + " price is: " +myPasta.showPrice());
		
		myPasta = new Tomato(myPasta);
		System.out.println(myPasta.showIngredients() + " price is: " +myPasta.showPrice());
		
		
	}

}
