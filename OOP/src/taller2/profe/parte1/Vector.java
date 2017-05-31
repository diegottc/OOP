package taller2.profe.parte1;


public class Vector extends AbstractList {

	private int actualSize;
	
	Vector(){
		actualSize = 1;
		super.list = new int[actualSize];
		super.lastElement = 0;
	}
	

	public void add(int n){
		super.add(n);
		if(super.lastElement >= this.actualSize){
			expandSize();
		}
	}
	public void addAtBegin(int n) { //notar que este método y el add, se parecen mucho
									//si java permitiera pasar métodos como argumento
									//se podría ahorrar más código
		super.addAtBegin(n);
		if(super.lastElement >= this.actualSize){
			expandSize();
		}
	}

	private void expandSize() {
		int newSize = this.actualSize *2;
		int[] newList = new int[newSize];
		for(int i=0;i<actualSize ;i++ ){
			newList[i] = super.list[i];
		}
		super.list = newList;
		this.actualSize = newSize;
	}
}








