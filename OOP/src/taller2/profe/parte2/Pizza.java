package taller2.profe.parte2;
import java.util.ArrayList;


public abstract class Pizza extends AbstractFood  {
	ArrayList<Ingredient> ingredients;
	
	Pizza(){
		super();
		this.ingredients = new ArrayList<Ingredient>();
	}
	public void addIngredient(Ingredient ingredient){
		this.ingredients.add(ingredient);
	}
	
	@Override
	public String getName(){
		return super.getName() + this.ingredientsName();
	}
	private String ingredientsName() {
		String names ="";
		for(Ingredient in : this.ingredients){
			names +=  " with " + in.getName();
		}
		return names;
	}
	
	public int getPrice(){
		return super.getPrice() + this.ingredientsPrice();
	}
	private int ingredientsPrice() {
		int prices = 0;
		for(Ingredient in : this.ingredients){
			prices +=  in.getPrice();
		}
		return prices;
	}

	public int getCalories(){
		return super.getCalories() + this.ingredientsCalories();
	}
	private int ingredientsCalories() {
		int calories = 0;
		for(Ingredient in : this.ingredients){
			calories +=  in.getCalories();
		}
		return calories;
	}
}
