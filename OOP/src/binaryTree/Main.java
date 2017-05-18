package binaryTree;

public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.put(100);
		tree.put(50);
		tree.put(25);
		tree.put(75);
		tree.put(150);
		tree.put(10);
		tree.put(200);
		System.out.println("Impresion entreorden: ");
        tree.imprimir();
        System.out.println();
        System.out.println("Impresion con nivel: ");
        tree.imprimirConNivel();
	}

}
