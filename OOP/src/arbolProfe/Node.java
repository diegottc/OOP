package arbolProfe;

public class Node implements Tree{
	int value;
	Tree left,right;

	public Node(int v, Tree l, Tree r){
        this.value=v;
        this.left=l;
        this.right=r;
    }
	
	public int sum(){
		return this.value + this.left.sum() + this.right.sum();
	}
	
	public int min(){
		return Math.min(this.value, Math.min(this.left.min(), this.right.min()));
	}

}
