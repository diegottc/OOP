package taller2.ejercicio1;

public class ArrayList implements IntList {
	
	int capacity,size;
	int[] data;
	
	public ArrayList(){
		this(1000);
	}
	
	public ArrayList(int capacity){
		this.size = 0;
		this.data = new int[capacity];
	}

	public void add(int e) {
		this.data[this.size] = e;
		this.size++;
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
	
	public String toString(){
		String s = "";
		for (int i = 0; i < this.size; i++) {
			s += "["+this.data[i]+"]";
		}
		return s;
	}

}
