package taller2.ejercicio1;

public class Vector implements IntList {

	int actualSize, size;
	int[] data;
	
	public Vector(){
		this.actualSize = 1;
		this.size = 0;
		this.data = new int[1];
	}

	public void add(int e) {
		this.data[this.size] = e;
		this.size++;
		
		if(this.size == this.actualSize)
			expandSize();
	}

	public void remove() {
		this.size--;
	}

	public int get(int index) {
		if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " +
                                                     size);
        }
        else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
		return this.data[index];
	}

	public int size() {
		return this.size;
	}
	
	public void expandSize(){
		int[] dataExpand = new int[this.actualSize*2];
		for (int i = 0; i < this.actualSize; i++) {
			dataExpand[i] = this.data[i];
		}
		this.actualSize++;
		this.data = dataExpand;
	}
	
	public String toString(){
		String s = "";
		for (int i = 0; i < this.size; i++) {
			s += "["+this.data[i]+"]";
		}
		return s;
	}

}
