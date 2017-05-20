package arbolBinario;

public class Arbol {
	Nodo raiz=null;
    
	public boolean tieneRaiz(){
        if(this.raiz==null)
        	return false;
        else
        	return true;
    }
 
    public Arbol alta(int dat){
        if(!tieneRaiz()){
            Nodo nuevo = new Nodo(dat);
            raiz = nuevo;
        }else{
            boolean izq;
            Nodo actual = raiz;
            while(true){
                if(actual.getDato() < dat)
                	izq = false;
                else
                	izq = true;
                if(!izq){
                    if(actual.getDer() == null){
                        actual.setDer(new Nodo(dat));
                        break;
                    }else
                    	actual = actual.getDer();
                }else{
                    if(actual.getIzq() == null){
                        actual.setIzq(new Nodo(dat));
                        break;
                    }
                    else actual = actual.getIzq();
                }
            }
        }
        return this;
    }
 
    public void imprimir(){
        ayudantePreorden(raiz);
    }
 
    public void ayudantePreorden(Nodo dat){
        if(dat == null)
        	return;
        System.out.printf("%d ",dat.getDato());
        ayudantePreorden(dat.getDer());
        ayudantePreorden(dat.getIzq());
    }
 
    public int mayor(){
    	Nodo actual;
    	actual = raiz;
    	while(actual.getDer() != null){
    		actual = actual.getDer();
    	}
    	return actual.getDato();
    }
 
   /* int suma,sumader,sumaizq,aux=0;
 
    private int ayudanteSuma(Nodo dat){
        if(dat==null)
        	return 0;
        suma = aux + dat.getDato();
        aux = suma;
        ayudanteSuma(dat.getDer());
        ayudanteSuma(dat.getIzq());
    }
    
    public int sumaizquierda(){
        Nodo dat = raiz;
        ayudanteSuma(dat.getIzq());
        sumaizq = suma;
        return sumaizq;
 
    }
 
    public int sumaderecha(){
        aux = 0;
        Nodo dat = raiz;
        ayudanteSuma(dat.getDer());
        sumader = suma;
        return sumader;
    }
    
    public double media(){
        double media,s1,s2,s3;
        s1=(double)(sumaizq);s2=(double)(sumader);s3=(double)(raiz.dato);
        media=(s1+s2+s3)/10;
        return media;
    }*/
    
    
    private void imprimirConNivel(Nodo node, int nivel)  {
        if (node != null) {    
            imprimirConNivel(node.getIzq(), nivel+1);
            System.out.print(node.getDato() + "("+nivel+") - ");
            imprimirConNivel(node.getDer(), nivel+1);
        }
    }

    public void imprimirConNivel() {
        imprimirConNivel (this.raiz,1);
        System.out.println();
    }
    
}
