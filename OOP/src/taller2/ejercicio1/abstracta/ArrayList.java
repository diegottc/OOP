package taller2.ejercicio1.abstracta;

public class ArrayList extends AbstractList implements IntList {
	
	int capacity;
	
	public ArrayList(){
		this(1000);
	}
	
	public ArrayList(int capacity){
		this.size = 0;
		this.data = new int[capacity];
	}
}
