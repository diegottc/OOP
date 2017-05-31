package taller2.profe.parte1;

public interface Node {

	boolean isEmpty();
	Node getNext();
	int getValue();
	void changeNext(Node n);
	String toString(); 

}

class ConcreteNode implements Node{
	int value;
	Node next;
	
	ConcreteNode(int v, Node n){
		this.value = v;
		this.next= n;
	}

	public boolean isEmpty() {
		return false;
	}

	public Node getNext() {
		return this.next;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public void changeNext(Node n) {
		this.next =n;	
	}
	
	public String toString(){
		return "["+value+"]"+next.toString();
	}
}

class EmptyNode implements Node{

	public boolean isEmpty() {
		return true;
	}

	public Node getNext() {
		return null; //en la vida real, aqui deberia tirar una excepción
	}

	@Override
	public int getValue() {
		return 0; //en la vida real, aqui deberia tirar una excepción
	}

	@Override
	public void changeNext(Node n) {
		//en la vida real, aqui deberia tirar una excepción		
	}
	
	public String toString(){
		return "";
	}
}
