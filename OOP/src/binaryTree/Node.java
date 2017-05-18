package binaryTree;

public class Node {
	int value;
	BinaryTree nodoIzq;
	BinaryTree nodoDer;
	
	public Node(int value){
		this.value = value;
	}
	
	public Node(int value, BinaryTree izq, BinaryTree der){
		this.value = value;
		this.nodoIzq = izq;
		this.nodoDer = der;
	}
	
	public Node(){
		this.value = 0;
		this.nodoIzq = null;
		this.nodoDer = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public BinaryTree getNodeIzq(){
		return nodoIzq;
	}
	
	public BinaryTree getNodeDer(){
		return nodoDer;
	}
	
	public void setNodeIzq(BinaryTree node){
		this.nodoIzq = node;
	}
	
	public void setNodeDer(BinaryTree node){
		this.nodoDer = node;
	}
	
	public String toString(){
		return "("+this.value+")";
	}
}
