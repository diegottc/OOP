package practicaInterfaces.tda;

public class LinkedList implements List {
	Entry first;
	Entry last;
	int size;
	
	public LinkedList(){
		first = last = null;
		size = 0;
	}
	
	public Object get(int index) {
		return getEntry(index).data;
	}

	public void add(int index, Object element) {
		Entry e = new Entry(element);
		Entry after = getEntry(index);
		e.next = after;
	}

	public boolean add(Object o) {
		return false;
	}

	public int indexOf(Object o) {
		return 0;
	}

	public boolean contains(Object o) {
		return false;
	}

}
