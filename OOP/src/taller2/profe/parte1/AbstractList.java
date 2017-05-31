package taller2.profe.parte1;

public abstract class AbstractList implements IntList{

	int lastElement;
	int[] list;
	@Override public void add(int n) {
		 this.list[this.lastElement] = n;
		 this.lastElement++;
	}

	@Override
	public void remove() {
		this.list[this.lastElement] = 0;
		this.lastElement--;
	}

	@Override
	public int get(int i) {	
		return list[i];
	}
	@Override
	public int size(){
		return this.lastElement;
	}
	public void addAtBegin(int n) {
		int[] auxList = new int[this.list.length];
		auxList[0] =n; 
		for(int i=0;i<lastElement ;i++ ){ 
			auxList[i+1] = this.list[i];
		}
		this.list = auxList;
		lastElement++;
	}
}
