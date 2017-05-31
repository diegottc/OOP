package taller2.profe.parte2;

public class PizzaStore {
	
	Pizza orderSimplePizza(){
		Pizza simplePizza = new ThinDough();
		simplePizza.addIngredient(new Cheese());
		simplePizza.addIngredient(new Tomato());
		simplePizza.addIngredient(new Pepperoni());
		return simplePizza;
	}
	
	Pizza orderOnlyMeat(){
		Pizza simplePizza = new ThickDough();
		simplePizza.addIngredient(new Cheese());
		simplePizza.addIngredient(new Pepperoni());
		return simplePizza;		
	}
	Pizza orderOnlyVegetriant(){
		Pizza simplePizza = new ThinDough();
		simplePizza.addIngredient(new Cheese());
		simplePizza.addIngredient(new Tomato());
		simplePizza.addIngredient(new BBQSauce());
		return simplePizza;		
	}
	
	Pizza addIngredient(Pizza pizza, Ingredient ingredient){
		pizza.addIngredient(ingredient);
		return pizza;
	}
}
