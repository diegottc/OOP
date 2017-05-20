package automovil;

public class TurnedOff implements State {
	
	public TurnedOff(){
		
	}
	
	public void turnOn(Car car){
		System.out.println("Prendiendo");
	}
	
	public void turnOff(Car car){
		System.out.println("Ya estoy apagado");
	}
	
	public void accelerate(Car car){
		System.out.println("No puedo acelerar, estoy apagado");
	}
	
	public void brake(Car car){
		System.out.println("No puedo frenar, estoy apagado");
	}
}
