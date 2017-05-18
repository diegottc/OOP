package binaryTree;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		this.root = new Node();
	}
	
	public void put(int value) {
		this.root = modify(value, root);
	}
	
	public Node modify(int value, Node node) {
		if (node==null){
			Node nuevo = new Node();
			nuevo.setValue(value);
            nuevo.setNodeDer(new BinaryTree());
            nuevo.setNodeIzq(new BinaryTree());
			return nuevo;
		}
		if (value == node.getValue())
			node.setValue(value);
		else if (value < node.getValue())
			node.setNodeIzq(modify(value, node.getNodeIzq()));
		else
			node.setNodeDer(modify(value, node.getNodeDer()));
		return node;
	}
	
	public void imprimir(){
		imprimir(root);
	}
	
	public void imprimir(Node node){
		if (node != null)  {    
            imprimir(node.getNodeIzq());
            System.out.print(node.toString() + " ");
            imprimir(node.getNodeDer());
        }
	}
	
	private void imprimirConNivel(Node node,int nivel)  {
        if (node != null) {    
            imprimirConNivel(node.getNodeIzq(),nivel+1);
            System.out.print(node.getValue() + " ("+nivel+") - ");
            imprimirConNivel(node.getNodeDer(),nivel+1);
        }
    }

    public void imprimirConNivel () {
        imprimirConNivel (root,1);
        System.out.println();
    }
    
    public void preOrder(){
        if (!(root == null)) {
            System.out.print( root.getValue() + ", "  );
            root.hi.preOrder();
            root.hd.preOrder();
        }
    }
 
    public void inOrder(){
        if (!(root == null)) {
            raiz.hi.inOrder();
            System.out.print( raiz.dato + ", "  );
            raiz.hd.inOrder();
        }
    }
 
    public void posOrder(){
        if (!(root == null)) {
            raiz.hd.posOrder();
            raiz.hi.posOrder();
            System.out.print( raiz.dato + ", "  );
 
        }
    }
	
}
