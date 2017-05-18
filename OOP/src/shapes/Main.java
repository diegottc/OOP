package shapes;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		System.out.println(p1 + "<-- p1 Punto mutable");
		ImPoint imP1 = new ImPoint(1, 2);
		System.out.println(imP1 + "<-- ImP1 Punto Inmutable");
		p1.moveBy(2, 2);
		System.out.println(p1 + "<-- Estado Punto mutable p1 movido en (2,2)");
		ImPoint imPointRes = imP1.moveBy(2, 2);
		System.out.println(imP1 + "<-- Estado Punto inmutable imP1 (2,2)");
		System.out.println(imPointRes + "<-- Resultado Punto inmutable imPointRes movido en (2,2)");
		System.out.println();
		
		Rectangle r1 = new Rectangle(p1, 10, 10);
		System.out.println(r1 + "<-- r1 Rectangulo creado con p1 mutable");
		r1.moveBy(5, 5);
		System.out.println(r1 + "<-- Mover Rectángulo r1 (5,5)");
		System.out.println(p1 + "<-- p1 Punto mutable después de mover r1 creado con p1 mutable: cambió de (3,4) a (8,9)");
		System.out.println();
		
		Rectangle r2 = new Rectangle(8, 9, 10, 10);
		System.out.println(r2 + "<-- r2 Rectángulo creado con coordenadas enteras");
		r2.moveBy(5, 5);
		System.out.println(r2 + "<-- Mover Rectángulo r2 (5,5)");
		System.out.println(p1 + "<-- p1 Punto mutable después de mover r2 creado con coordenadas enteras: no cambió, se mantuvo en (8,9)");
		System.out.println();
		
		Rectangle r3 = new Rectangle(p1, 20, 20);
		System.out.println(r3 + "<-- r3 Rectángulo creado con p1 mutable");
		r3.moveBy(5, 5);
		System.out.println(r3 + "<-- Mover Rectángulo r3 (5,5)");
		System.out.println(r1 + "<-- r1 Rectángulo creado con p1 mutable");
		System.out.println();
		
		p1.moveBy(10, 10);
		System.out.println(r3 + "<-- r3 estado Rectángulo luego de mover p1 (10,10)");
		System.out.println(r1 + "<-- r1 estado Rectángulo luego de mover p1 (10,10)");
	}
}
