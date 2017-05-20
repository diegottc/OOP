package automovil;

public class OverHeat implements State {

	final String nombre = ">>Encendido, pero sobre-calentado";
	
	public void turnOn(Car car) {
		System.out.println("Estoy prendido, pero el motor deberá ser apagado pronto");
	}

	public void turnOff(Car car) {
		System.out.println("Apagándome, por fin descansare");
		car.setState(new TurnedOff());
	}

	public void accelerate(Car car) {
		System.out.println("No puedo acelerar mas");
	}

	public void brake(Car car) {
		System.out.println("Frenando, pero el motor sigue caliente");
	}

	public void showNombre(){
		System.out.println(nombre);
	}

}
