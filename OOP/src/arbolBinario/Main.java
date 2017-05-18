package arbolBinario;

public class Main {

	public static void main(String[] args) {
		int[] a=new int[10];
		/*for(int i=0;i<=9;i++)
			a[i]=(int)(Math.random()*50);*/
		
		a[0] = 37;a[1] = 48;a[2] = 22;a[3] = 27;a[4] = 29;a[5] = 37;a[6] = 9;a[7] = 21;a[8] = 12;a[9] = 11;
		
		Arbol x = new Arbol();
		for(int i=0;i<10;i++)
			x.alta(a[i]);
		System.out.println("Los datos son: ");
		x.imprimir();
		x.imprimirConNivel();
		System.out.println("\nEl numero mayor es: "+x.mayor());
		System.out.println("La suma de los numeros de la Izquierda es: "+x.sumaizquierda());
		System.out.println("La suma de los numeros de la Derecha es: "+x.sumaderecha());
		System.out.println("La media es: "+x.media());
	}

}
