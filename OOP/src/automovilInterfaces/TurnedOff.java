package automovilInterfaces;

public class TurnedOff implements State {
	
	final String nombre = ">>Apagado";
	
	public void turnOn(Car car){
		System.out.println("Prendiendo");
		car.setState(new TurnedOn());
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
	
	public void showNombre(){
		System.out.println(nombre);
	}
}
