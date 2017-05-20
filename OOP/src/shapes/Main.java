package shapes;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		System.out.println(p1 + "<-- p1 Punto mutable");
		
		p1.moveBy(2, 2);
		System.out.println(p1 + "<-- Estado Punto mutable p1 movido en (2,2)");
		System.out.println();
		
		Rectangle r1 = new Rectangle(p1, 3, 3);
		System.out.println(r1 + "<-- r1 Rectangulo creado con p1 mutable");
		Rectangle r2 = new Rectangle(p1, 5, 5);
		System.out.println(r2 + "<-- r2 Rectangulo también creado con p1 mutable");
		r1.moveBy(5, 5);
		System.out.println(r1 + "<-- Mover Rectángulo r1 (5,5)");
		System.out.println(r2 + "<-- r2 también se movió? (5,5)");
		System.out.println(p1 + "<-- p1 Punto mutable después de mover r1 creado con p1 mutable: cambió de (3,4) a (8,9)");
		System.out.println();
		
		Rectangle r3 = new Rectangle(8, 9, 4, 4);
		System.out.println(r3 + "<-- r3 Rectángulo creado con coordenadas enteras");
		r3.moveBy(5, 5);
		System.out.println(r3 + "<-- Mover Rectángulo r2 (5,5)");
		System.out.println(p1 + "<-- p1 Punto mutable después de mover r2 creado con coordenadas enteras: no cambió, se mantuvo en (8,9)");
		System.out.println();
		
		r1.show();
		r2.show();
		r3.show();
		
		
		ImPoint imP1 = new ImPoint(1, 2);
		System.out.println(imP1 + "<-- ImP1 Punto Inmutable");
		
		ImPoint imPointRes = imP1.moveBy(2, 2);
		System.out.println(imP1 + "<-- Estado Punto inmutable imP1 (2,2)");
		System.out.println(imPointRes + "<-- Resultado Punto inmutable imPointRes movido en (2,2)");
		
		ImRectangle imR1 = new ImRectangle(imP1, 3, 3);
		System.out.println(imR1 + "<-- imR1 Rectangulo inmutable creado con imP1 inmutable");
		ImRectangle imR2 = new ImRectangle(imP1, 5, 5);
		System.out.println(imR2 + "<-- imR2 Rectangulo inmutabe también creado con imP1 inmutable");
		imR1.moveBy(5, 5);
		System.out.println(imR1 + "<-- Mover Rectángulo imR1 (5,5)");
		System.out.println(imR2 + "<-- imR2 también se movió? (5,5)");
		System.out.println(imP1 + "<-- imP1 Punto inmutable después de mover imR1 creado con imP1 inmutable: cambió de (3,4) a (8,9)");
		System.out.println();
	}
}
