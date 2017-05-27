package automovilInterfaces;

public class TurnedOn implements State {
	
	int aceleradasSeguidas;
	final String nombre = ">>Encendido";
	
	public TurnedOn(){
		aceleradasSeguidas = 0;
	}
	
	public void turnOn(Car car){
		System.out.println("Ya estoy prendido");
	}
	
	public void turnOff(Car car){
		System.out.println("Apagándome");
		car.setState(new TurnedOff());
	}
	
	public void accelerate(Car car){
		System.out.println("Acelerando");
		aceleradasSeguidas++;
		if(aceleradasSeguidas==3)
			car.setState(new OverHeat());
	}
	
	public void brake(Car car){
		System.out.println("Frenando");
		aceleradasSeguidas = 0;
	}
	
	public String toString(){
		return "Estoy apagado";
	}
	
	public void showNombre(){
		System.out.println(nombre);
	}
}
