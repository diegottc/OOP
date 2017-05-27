package herencia.tree;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Tree t1 = Tree.get(30, Tree.get(10), Tree.get(50));
		System.out.println(t1.sum());
		Tree t2 = Tree.get(1000);
		Tree t3 = Tree.get(10, Tree.get(20), Tree.get(30));
		
		List l = new ArrayList();
		l.add(t2);
		l.add(t3);
		l.add(t1);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}
