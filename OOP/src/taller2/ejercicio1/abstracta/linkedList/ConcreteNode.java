package taller2.ejercicio1.abstracta.linkedList;

public class ConcreteNode implements Node {
	int value;
	Node next;
	
	public ConcreteNode(int v, Node n){
		this.value = v;
		this.next = n;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void changeNext(Node n) {
		this.next =n;
	}
	
	public String toString(){
		return "["+value+"]"+next.toString();
	}

}
