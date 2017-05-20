package automovil;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(); //Apagado
		car.currentState(); //Estado actual
		car.turnOff(); //Intento apagar, pero ya estpoy apagado
		car.accelerate(); //Intento acelerar, pero estoy apagado
		car.brake(); //Intento frenar, pero estoy apagado
		car.turnOn(); //Intento encender, y enciende porque estaba apagado
		car.currentState(); //Estado actual
		car.turnOn(); //Intento encender, pero ya estaba encendido
		car.accelerate(); //Intento acelerar, y acelera porque estaba encendido
		car.brake(); //Intento frenar, y frena porque estaba encendido
		car.turnOff(); //Intento apagar, y apaga porque estaba encendido
		car.turnOn(); //Intento encender, y enciende porque estaba apagado
		
		car.accelerate();
		car.accelerate();
		car.brake();
		car.accelerate(); 
		car.accelerate(); //debería poder volver a acelerar, porque anteriormente frené
		
		//probar state OverHate
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.currentState(); //Estado actual
		car.accelerate(); //Intento acelerar, y no acelera porque está sobre-calentado
		car.brake(); //Intento frenar, y frena porque estaba encendido
		car.accelerate(); //Intento acelerar, y  acelera porque frenó luego de 3 aceleradas
		car.turnOff();
		car.currentState(); //Estado actual
	}

}
