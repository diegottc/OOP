package herencia.tree;

public class Leaf extends AbstractValTree {
	
	public Leaf(int value){
		super(value);
	}
	
	public int sum(){
		return value;
	}
	
	public int min(){
		return value;
	}
}
