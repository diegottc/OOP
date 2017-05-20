package shapes;

public class Rectangle {
	Point origin;
	int width, height;
	
	public Rectangle(int x, int y, int w, int h){
		this.origin = new Point(x,y);
		this.width = w;
		this.height = h;
	}
	
	public Rectangle(Point p, int w, int h){
		this.origin = p;
		this.width = w;
		this.height = h;
	}
	
	public int area(){
		return this.width * this.height;
	}
	
	public void moveBy(int dx, int dy){
		this.origin.moveBy(dx, dy);
	}
	
	public String toString(){
		return "["+this.origin.toString()+"/"+this.width+"*"+this.height+"]";
	}
	
	public void show(){
		System.out.print("*1");
		for (int i = 0; i < this.width; i++) {
			System.out.print(" ");
		}
		System.out.print("*2");
		for (int i = 0; i < this.height; i++) {
			System.out.println();
		}
		System.out.print("*3");
		for (int i = 0; i < this.width; i++) {
			System.out.print(" ");
		}
		System.out.print("*4");
		System.out.println();
	}
}
