package arbolProfe;

public class Main {

	public static void main(String[] args) {
		Tree t3 = new Node(30, new Leaf(10), new Leaf(20));
		System.out.println(t3.sum());
		System.out.println(t3.min());
	}
}
