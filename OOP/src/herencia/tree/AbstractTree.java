package herencia.tree;

public abstract class AbstractTree implements Tree {

	public int compareTo(Object o) {
		return this.sum() - ((Tree) o).sum();
	}
	
	public String toString(){
		return "Tree("+this.sum()+")";
	}
}
