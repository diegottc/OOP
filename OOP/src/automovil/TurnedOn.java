package automovil;

public class TurnedOn implements State {
	
	public TurnedOn(){
		
	}
	
	public void turnOn(Car car){
		System.out.println("Ya estoy prendido");
	}
	
	public void turnOff(Car car){
		System.out.println("Apagándome");
	}
	
	public void accelerate(Car car){
		System.out.println("Acelerando");
	}
	
	public void brake(Car car){
		System.out.println("Frenando");
	}
}
