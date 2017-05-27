package automovil;

public interface State {
	
	public void turnOn(Car car);
	
	public void turnOff(Car car);
	
	public void accelerate(Car car);
	
	public void brake(Car car);
	
	public void showNombre();
}
