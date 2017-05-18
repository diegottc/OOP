package arbolBinario;

public class Nodo {
	int dato;
	Nodo der;
    Nodo izq;

	public Nodo(int dat){
        this.dato=dat;
        this.der=null;
        this.izq=null;
    }
    
    public int getDato() {
		return dato;
	}
    
    public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}
}
