package taller2.ejercicio1.abstracta.linkedList;

import taller2.ejercicio1.abstracta.IntList;

public class LinkedList implements IntList {
	
	Node list;
	int size;
	
	public LinkedList(){
		this.list = new ConcreteNode(0, new EmptyNode());
		this.size = 0;
	}

	public void add(int n) {
		Node l = goToNode(this.size()-1); 
		l.changeNext(new ConcreteNode(n,new EmptyNode()));
		this.size++;

	}
	
	public void remove() {
		Node l = goToNode(this.size());
		l.changeNext(new EmptyNode());
		this.size--;
	}

	public int get(int index) {
		if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + size);
        }
        else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
		return goToNode(index).getValue();
	}
	
	private Node goToNode(int index){
		Node auxNode = this.list;
		for(int i=0 ; i <(index + 1); i++){
			auxNode = auxNode.getNext();
		}
		return auxNode;
	}

	public int size() {
		return this.size;
	}
	
	public String toString(){
		return list.toString();
	}

}
