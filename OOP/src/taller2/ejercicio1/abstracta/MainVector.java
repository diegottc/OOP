package taller2.ejercicio1.abstracta;

public class MainVector {

	public static void main(String[] args) {
		IntList list = new Vector();
		System.out.println("largo: "+list.size());
		System.out.println(list);
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("largo: "+list.size());
		System.out.println(list);
		
		System.out.println("Valor posición 3: "+list.get(3));
		
		
		System.out.println("remuevo el último");
		list.remove();
		System.out.println(list);
		System.out.println("largo: "+list.size());
		
		System.out.println("Valor posición 7: "+list.get(7));
	}

}
