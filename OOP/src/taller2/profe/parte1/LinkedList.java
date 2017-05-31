package taller2.profe.parte1;

public class LinkedList implements IntList {

	Node list;
	int size;
	
	LinkedList(){
		this.list = new ConcreteNode(0, new EmptyNode()); //una lista vacia parte con 2 nodos
									 //uno concreto que actua de cabecera y otro vacio
			                         //así es mas facil hacer el remove.
		this.size = 0;
	}
	
	
	@Override
	public void add(int n) {
		Node l = goToNode(this.size()-1); //apunto al nodo anterior al nodo que apunta al empty.
		l.changeNext(new ConcreteNode(n,new EmptyNode()));
		this.size++;

	}

	public void remove() {
		Node l = goToNode(this.size()); //apunto al nodo que apunta al empty.
		l.changeNext(new EmptyNode());
		this.size--;
	}

	public int get(int index) {
		return goToNode(index).getValue();
	}

	public int size() {
		return this.size;
	}

	private Node goToNode(int index){
		Node auxNode = this.list;
		for(int i=0 ; i <(index + 1); i++){ //gracias a que esta la cabecera, me tengo que mover uno mas
			auxNode = auxNode.getNext();
		}
		return auxNode;
	}

	public void addAtBegin(int n) {
		Node aux= list.getNext();
		list.changeNext(new ConcreteNode(n, aux));
		size++;
	}
	
	public String toString(){
		return list.toString();
	}
}
