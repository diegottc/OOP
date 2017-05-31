package taller2.profe.parte2;


public abstract class AbstractFood implements Food {
	String name;
	int price;
	int calories;
	@Override
	public String getName(){
		return this.name;
	}

	@Override
	public int getPrice()  {
		return this.price;
	}

	@Override
	public int getCalories(){
		return this.calories;
	}

}
