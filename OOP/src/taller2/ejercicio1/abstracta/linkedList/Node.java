package taller2.ejercicio1.abstracta.linkedList;

public interface Node {
	public int getValue();
	public Node getNext();
	public String toString();
	public void changeNext(Node n);
}
