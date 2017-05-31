package taller2.profe.parte1;

public class ArrayList extends AbstractList {

	private int capacity;
	
	ArrayList(){
		capacity = 1000000;
		super.list = new int[capacity];
		super.lastElement = 0;
	}
}
