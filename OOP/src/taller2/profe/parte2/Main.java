package taller2.profe.parte2;



public class Main {
	//client
	public static void main(String[] args) {
		PizzaStore pizaHat = new PizzaStore();
		Pizza myPizza = pizaHat.orderOnlyMeat();
		pizaHat.addIngredient(myPizza, new Pepperoni());
		System.out.println(myPizza.getName());
	}

}
