package herencia.tree;

public interface Tree extends Comparable {
	int sum(); 
	int min();
	
	// lo que sigue podría estar en cualquier lugar
	// "casi" singleton
	static Tree randomNode = new RandomNode();
	
	public static Tree get(){
		return randomNode;
	}
	public static Tree get(int value){
		return new Leaf(value);
	}
	public static Tree get(int value, Tree t1, Tree t2){
		return new Node(value, t1, t2);
	}
}
