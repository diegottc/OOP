package herencia.tree;

public class RandomNode extends AbstractTree {

	public int sum() {
		return (int) (Math.random() * 100);
	}

	public int min() {
		return (int) (Math.random() * 100);
	}
}
