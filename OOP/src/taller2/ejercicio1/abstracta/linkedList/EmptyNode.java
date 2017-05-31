package taller2.ejercicio1.abstracta.linkedList;

public class EmptyNode implements Node {
	
	public int getValue(){
		return 0;
	}
	
	public Node getNext(){
		return null;
	}
	
	public String toString(){
		return "";
	}
	
	public void changeNext(Node n){
		
	}
}
