package taller2.ejercicio1.abstracta;

public class Vector extends AbstractList implements IntList{

	private int actualSize;

	public Vector(){
		this.actualSize = 1;
		this.size = 0;
		this.data = new int[this.actualSize];
	}

	public void add(int e) {
		super.add(e);
		
		if(this.size >= this.actualSize)
			expandSize();
	}
	private void expandSize(){
		int[] dataExpand = new int[this.actualSize*2];
		for (int i = 0; i < this.actualSize; i++) {
			dataExpand[i] = super.data[i];
		}
		this.actualSize = dataExpand.length;
		this.data = dataExpand;
	}

}
