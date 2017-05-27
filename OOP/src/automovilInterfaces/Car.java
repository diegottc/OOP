package automovilInterfaces;

public class Car {
	State state;

	public Car() {
		state = new TurnedOff();
	}
	
	public void turnOn(){
		state.turnOn(this);
	}
	
	public void turnOff(){
		state.turnOff(this);
	}
	
	public void accelerate(){
		state.accelerate(this);
	}
	
	public void brake(){
		state.brake(this);
	}
	
	public State getState(){
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void currentState(){
		state.showNombre();
	}
	
}
