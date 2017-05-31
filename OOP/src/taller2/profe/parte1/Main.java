package taller2.profe.parte1;

class Main {

	public static void main(String[] args) {
		/*IntList l1= new Vector();
		l1.addAtBegin(0);
		l1.addAtBegin(5);
		l1.addAtBegin(3);
		System.out.println(l1.size());
		l1.remove();
		System.out.println(l1.size());
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));*/
		
		IntList list = new LinkedList();
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
		System.out.println("Valor posición 0: "+list.get(0));
		System.out.println("Valor posición 1: "+list.get(1));
		System.out.println("Valor posición 2: "+list.get(2));
		System.out.println("Valor posición 3: "+list.get(3));
		System.out.println("Valor posición 4: "+list.get(4));
		System.out.println("Valor posición 5: "+list.get(5));
		System.out.println("Valor posición 6: "+list.get(6));
	}
	
	
}






	
	
	




