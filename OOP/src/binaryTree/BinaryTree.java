package binaryTree;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		this.root = null;
	}
	
	public void put(int value) {
		this.root = modify(value, root);
	}
	
	public Node modify(int value, Node node) {
		if (node==null){
			Node nuevo = new Node(value);
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
	
	public int suma() {
	      Node nodo= this.root;
	      int suma = 0;
	      while (nodo!=null) {
	        if (llave==nodo.llave)
	          return nodo.val;
	        if (llave<nodo.llave)
	          nodo= nodo.izq;
	        else
	          nodo= nodo.der;
	      }
	      return null;
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
	
}
