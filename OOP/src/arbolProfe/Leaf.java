package arbolProfe;

public class Leaf implements Tree{
	int value;

	public Leaf(int value) {
		this.value = value;
	}
	
	public int sum(){
		return this.value;
	}
	
	public int min(){
		return this.value;
	}
}
