package practicaInterfaces.tda;

public class ArrayList implements List{
	
	int size;//qué tantos elementos tengo
	Object[] data;
	
	public ArrayList(){
		this(10);
	}
	
	public ArrayList(int capacity){
		this.size = 0;
		this.data = new Object[capacity];
	}
	
	public Object get(int index){
		return data[index];
	}
	
	
	public void add(int index, Object element){
		// resize if needed
		data[index] = element;
		this.size++;
	}
	
	
	public int indexOf(Object o){
		int index = 0;
		while (data[index] != null) {
			type type = (type) data.nextElement();
			
		}
	}
	
	public boolean contains(Object o){
		
	}

}
