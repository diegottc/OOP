package binaryTree;

public class Node {
	int value;
	Node nodoIzq;
	Node nodoDer;
	
	public Node(int value){
		this.value = value;
		this.nodoIzq = null;
		this.nodoDer = null;
	}
	
	public Node(int value, Node izq, Node der){
		this.value = value;
		this.nodoIzq = izq;
		this.nodoDer = der;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Node getNodeIzq(){
		return nodoIzq;
	}
	
	public Node getNodeDer(){
		return nodoDer;
	}
	
	public void setNodeIzq(Node node){
		this.nodoIzq = node;
	}
	
	public void setNodeDer(Node node){
		this.nodoDer = node;
	}
	
	public String toString(){
		return "("+this.value+")";
	}
}
